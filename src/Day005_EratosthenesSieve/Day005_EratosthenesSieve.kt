package Day005_EratosthenesSieve

import java.math.BigInteger

fun main(args: Array<String>) {
    println("Total count of prime numbers: ${sieve(10000)}")
}

fun sieve(n: Int): Int {
    // 1. Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).
    // n+1 array space because we start counting from 1
    // Note: 1 is not prime
    var isComposite = BooleanArray(n + 1)

    // 2. Initially, let p equal 2, the smallest prime number.
    var p: Int = 2
    var isNextPFound = true
    var primeCount: Int = 0

    while (true) {
        if (!isNextPFound) break

        primeCount++

        print("${p} ")

        // 3. Enumerate the multiples of p by counting to n from 2p in increments of p, and mark them in the list (these will be 2p, 3p, 4p, ...; the p itself should not be marked).
        for (i in 2..n) {
            // mark as not prime
            if (i * p <= n) isComposite[i * p] = true
        }

        // 4. Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this new number (which is the next prime), and repeat from step 3.
        isNextPFound = false
        for (i in (p + 1)..n) {
            if (isComposite[i] == false) {
                p = i
                isNextPFound = true
                break
            }
        }

    }

    println()

    return primeCount
}