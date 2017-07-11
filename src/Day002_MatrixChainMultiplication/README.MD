# Day 002: Matrix Chain Multiplication

Link: [https://medium.com/100-days-of-algorithms/day-2-matrix-chain-multiplication-3ae6349c34ab](https://medium.com/100-days-of-algorithms/day-2-matrix-chain-multiplication-3ae6349c34ab)

## Notes to myself

1. Recursion formula:
```
M[i,j] = 0, if i=j
M[i,j] = min( M[i,k] + M[k+1, j] + P{i-1}P{k}P{j} ), where i<=k<j
```

## References

1. [http://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/](http://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/)
2. [https://www.youtube.com/watch?v=GMzVeWpyTN0](https://www.youtube.com/watch?v=GMzVeWpyTN0)
3. [https://en.wikipedia.org/wiki/Matrix_chain_multiplication](https://en.wikipedia.org/wiki/Matrix_chain_multiplication)