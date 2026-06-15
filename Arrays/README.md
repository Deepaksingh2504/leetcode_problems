# Majority Element

### Pattern

Boyer-Moore Voting Algorithm

### Idea

We maintain two variables:

* candidate
* count

If `count == 0`, we choose the current element as the new candidate.

If the current element equals the candidate, we increase `count`.

If the current element is different from the candidate, we decrease `count`.

### Why it works

A majority element appears more than n/2 times.

Whenever we encounter a different element, it cancels out one occurrence of the current candidate.

Since the majority element appears more than all other elements combined, it cannot be completely canceled out.

Therefore, after all cancellations, the majority element survives as the final candidate.

### Complexity

Time Complexity: O(n)

Space Complexity: O(1)
