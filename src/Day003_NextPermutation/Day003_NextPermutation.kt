package Day003_NextPermutation

fun main(args: Array<String>) {
    println(nextPermutation(intArrayOf(1, 5, 8, 4, 7, 6, 5, 3, 1)).joinToString(","))
}

fun nextPermutation(num: IntArray): IntArray {

    if (num.size() <= 1) return num

    var isAscPairFound: Boolean = false
    var pivotValue: Int = -1
    var pivotIndex: Int = -1
    var smallestNextHigherValue: Int = -1
    var smallestNextHigherIndex: Int = -1

    // 1. Scanning from the right to left, find a pair of adjacent numbers where a[i] > a[i-1].
    for (i in (num.size() - 1) downTo 1) {
        if (num[i] > num[i - 1]) {
            pivotValue = num[i - 1]
            pivotIndex = i - 1

            isAscPairFound = true

            break
        }
    }

    if (!isAscPairFound) return num

    // 2. Scanning to the right of a[i-1], find the smallest next number a[j], where a[j] > a[i-1].
    for ( i in pivotIndex..(num.size() - 1)) {
        if ( num[i] > pivotValue) {
            smallestNextHigherValue = num[i]
            smallestNextHigherIndex = i
        }
    }

    // 3. Swap a[i-1] and a[j].
    num[pivotIndex] = smallestNextHigherValue
    num[smallestNextHigherIndex] = pivotValue

    // 4. Reverse the sequence to the right of the pivot position.
    reverseIntArray(num, pivotIndex+1, num.size()-1);

    return num;
}

fun reverseIntArray(arr: IntArray, startIndex: Int, endIndex: Int) {
    val midIndex = (endIndex - startIndex) / 2

    for (i in startIndex..midIndex) {
        val temp = arr[startIndex]
        arr[startIndex] = arr[arr.size() - i - 1]
        arr[arr.size() - i - 1] = temp
    }
}