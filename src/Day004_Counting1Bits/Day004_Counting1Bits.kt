package Day004_Counting1Bits

fun main(args: Array<String>) {
    println(counting1Bits(6))
}

// Brian Kernighan's Algorithm
fun counting1Bits(num: Int): Int {
    var count: Int = 0
    var _num = num

    while (_num > 0) {
        _num = _num and (_num-1)
        count++
    }

    return count
}