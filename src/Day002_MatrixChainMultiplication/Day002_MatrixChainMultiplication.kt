package Day002_MatrixChainMultiplication

fun main(args: Array<String>) {
    println(mcm(intArrayOf(1, 2, 3, 4, 3), 1, 4))
}

// recursive solution
fun mcm(p: IntArray, i: Int, j: Int): Int {
    if (i == j) return 0;

    var min = Int.MAX_VALUE;

    for ( k in i..j-1) {
        var count = Math.min(
                min,
                mcm(p, i, k) + mcm(p, k + 1, j) + p[i - 1] * p[k] * p[j]
        );

        if(count < min) min = count;
    }

    return min;
}