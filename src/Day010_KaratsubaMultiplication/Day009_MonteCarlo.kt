package Day010_KaratsubaMultiplication

fun main(args: Array<String>) {
    println(karatsuba(123, 678))
    //println(karatsuba(986542, 751))
}

fun karatsuba(x: Int, y: Int): Int {

    // base case
    if (x < 10 || y < 10) return x * y

    val base: Int = 10
    val xN: Int = x.toString().length()
    val yN: Int = y.toString().length()

    val xL: Int = x.toString().substring(0, xN / 2).toInt()
    val xR: Int = x.toString().substring(xN / 2).toInt()

    val yL: Int = y.toString().substring(0, yN / 2).toInt()
    val yR: Int = y.toString().substring(yN / 2).toInt()

    val zL: Int = karatsuba(xL, yL)
    val zR: Int = karatsuba(xR, yR)
    val zM: Int = karatsuba(xL + xR, yL + yR) - zL - zR
    //val zM: Int = zL + zR - karatsuba(xL - xR, yL - yR)

    return Math.pow(base.toDouble(), xN.toDouble()).toInt() * zL +
            Math.pow(base.toDouble(), (xN / 2).toDouble()).toInt() * zM +
            zR
}

/*
fun karatsuba(x: Int, y: Int): Int {
    val xDigitCount: Int = x.toString().length()
    val yDigitCount: Int = y.toString().length()

    val B: Int = 10
    val m: Int = calcMinBasePower(x, y)
    val Bm: Int = Math.pow(B.toDouble(), m.toDouble()).toInt()
    val Bm2: Int = Math.pow(B.toDouble(), 2 * m.toDouble()).toInt()

    val x1: Int = x.toString().substring(0, xDigitCount - m).toInt()
    val x0: Int = x.toString().substring(xDigitCount - m).toInt()

    val y1: Int = y.toString().substring(0, yDigitCount - m).toInt()
    val y0: Int = y.toString().substring(yDigitCount - m).toInt()

    val z2: Int = x1 * y1
    val z1: Int = x1 * y0 + x0 * y1
    val z0: Int = x0 * y0

    val xy = z2 * Bm2 + z1 * Bm + z0

    return xy
}
*/

fun calcMinBasePower(x: Int, y: Int): Int {
    val xDigitCount: Int = x.toString().length()
    val yDigitCount: Int = y.toString().length()

    return if (xDigitCount < yDigitCount) xDigitCount - 1 else yDigitCount - 1
}
