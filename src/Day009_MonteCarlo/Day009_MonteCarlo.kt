package Day009_MonteCarlo

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    // estimates pi
    println(monteCarlo(1000000))
}

fun monteCarlo(maxTrials: Int): Double {
    var currTrials: Double = 0.0
    var success: Double = 0.0

    while (currTrials < maxTrials) {
        var x: Double = ThreadLocalRandom.current().nextDouble(-1.0, 1.0)
        var y: Double = ThreadLocalRandom.current().nextDouble(-1.0, 1.0)

        var x2 = Math.pow(x, 2.0)
        var y2 = Math.pow(y, 2.0)

        if ((x2 + y2) <= 1) success++

        currTrials++
    }

    return (success / maxTrials) * 4.0
}