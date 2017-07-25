# Day 010: Karatsuba Multiplication

Link: [https://medium.com/100-days-of-algorithms/day-10-karatsuba-multiplication-a0535cc468e6](https://medium.com/100-days-of-algorithms/day-10-karatsuba-multiplication-a0535cc468e6)

## Notes to myself

1. Most efficient when n=2^k, where k is a positive integer
2. number of elementary multiplication for any n is at most 3^ceil(logN) <= 3n^(log3)
3. T(n) = 3T(ceil(n/2)) + cn+d, theta(n^(log3))
4. xL * yR + xR * yL = xL * yL + xR * yR + (xL - xR)(yL-yR)

## References

1. [https://ir.library.oregonstate.edu/xmlui/bitstream/handle/1957/32684/ErdemSerdarS2002.pdf?sequence=1](https://ir.library.oregonstate.edu/xmlui/bitstream/handle/1957/32684/ErdemSerdarS2002.pdf?sequence=1)
2. [http://people.cs.uchicago.edu/~laci/HANDOUTS/karatsuba.pdf](http://people.cs.uchicago.edu/~laci/HANDOUTS/karatsuba.pdf)
3. [https://en.wikipedia.org/wiki/Karatsuba_algorithm](https://en.wikipedia.org/wiki/Karatsuba_algorithm)