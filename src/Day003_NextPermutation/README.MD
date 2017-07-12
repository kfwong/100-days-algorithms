# Day 003: Next Permutation

Link: [https://medium.com/100-days-of-algorithms/day-3-next-permutation-ce817f5004e3](https://medium.com/100-days-of-algorithms/day-3-next-permutation-ce817f5004e3)

## Notes to myself

1. Observe that given any sequence in descending order, no larger permutation is possible.
2. Algorithm:
```
1. Scanning from the right to left, find a pair of adjacent numbers where a[i] > a[i-1].
2. Make position of a[i-1] the pivot. Scanning to the right of a[i-1], find the smallest next number a[j], where a[j] > a[i-1].
3. Swap a[i-1] and a[j].
4. Reverse the sequence to the right of the pivot position.
```

## References

1. [https://leetcode.com/articles/next-permutation/](https://leetcode.com/articles/next-permutation/)
2. [https://math.stackexchange.com/questions/239118/what-is-total-order-explanation-please](https://math.stackexchange.com/questions/239118/what-is-total-order-explanation-please)