package Day002_MatrixChainMultiplication

fun main(args: Array<String>) {
    println(mcm(intArrayOf(1, 2, 3, 4, 3), 1, 4))
}

// recursive solution with memoization
val memo = Array(5, { IntArray(5) })

fun mcm(p: IntArray, i: Int, j: Int): Int {
    // base case
    if (i == j) return 0;

    // return memo if computed before
    if (memo[i][j] > 0) return memo[i][j]

    var min = Int.MAX_VALUE;

    for ( k in i..j - 1) {
        min = Math.min(
                min,
                mcm(p, i, k) + mcm(p, k + 1, j) + p[i - 1] * p[k] * p[j]
        );

        memo[i][j] = min;
    }

    return min;
}