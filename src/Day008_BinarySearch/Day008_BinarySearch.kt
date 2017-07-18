package Day008_BinarySearch

fun main(args: Array<String>) {
    println(binarySearch(0, intArrayOf(2, 3, 4, 8, 10)))
    println(binarySearch(3, intArrayOf(2, 3, 4, 8, 10)))
}


fun binarySearch(i: Int, iArr:IntArray): Int {
    var lPos: Int = 0
    var rPos: Int = iArr.size() - 1

    while(lPos <= rPos){
        var mPos = (lPos+rPos) / 2

        if(i == iArr[mPos]) return iArr[mPos]
        if(i < iArr[mPos]) rPos = mPos - 1
        if(i > iArr[mPos]) lPos = mPos + 1
    }

    return -1
}