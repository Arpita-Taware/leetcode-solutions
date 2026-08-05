# 18. 4Sum

## Problem

Given an array `nums` of `n` integers, return all **unique quadruplets** `[nums[a], nums[b], nums[c], nums[d]]` such that:

* `0 <= a, b, c, d < n`
* `a`, `b`, `c`, and `d` are distinct indices
* `nums[a] + nums[b] + nums[c] + nums[d] == target`

The solution set must not contain duplicate quadruplets.

### Example

**Input**

```text
nums = [1,0,-1,0,-2,2], target = 0
```

**Output**

```text
[
  [-2,-1,1,2],
  [-2,0,0,2],
  [-1,0,0,1]
]
```

---

## Approach

This solution uses **Sorting** and the **Two Pointers** technique.

1. Sort the array to simplify duplicate handling and enable the two-pointer approach.
2. Fix the first two elements using nested loops.
3. Use two pointers (`left` and `right`) to find the remaining two elements whose sum completes the target.
4. Skip duplicate values for the first, second, third, and fourth elements to ensure only unique quadruplets are added.
5. Use `long` while calculating the sum to prevent integer overflow.

This approach efficiently finds all unique quadruplets while avoiding unnecessary comparisons.

---

## Algorithm

1. Sort the input array.
2. Iterate through the array using index `i` as the first element.
3. Skip duplicate values for `i`.
4. For each `i`, iterate using index `j` as the second element.
5. Skip duplicate values for `j`.
6. Initialize:

   * `left = j + 1`
   * `right = n - 1`
7. While `left < right`:

   * Compute the sum of the four elements.
   * If the sum equals the target:

     * Store the quadruplet.
     * Skip duplicate values for `left` and `right`.
     * Move both pointers inward.
   * If the sum is smaller than the target, move `left` forward.
   * Otherwise, move `right` backward.
8. Return all unique quadruplets.

---

## Complexity Analysis

| Complexity | Value                                  |
| ---------- | -------------------------------------- |
| Time       | **O(n³)**                              |
| Space      | **O(1)** *(excluding the output list)* |

---

## Key Concepts

* Arrays
* Sorting
* Two Pointers
* Nested Loops
* Duplicate Handling
* Overflow Prevention

---

## Solution

Implemented in **Java**.

### Code Highlights

* Sorts the array before processing.
* Uses two nested loops to fix the first two elements.
* Applies the two-pointer technique to find the remaining pair.
* Skips duplicate values to avoid repeated quadruplets.
* Uses `long` for the sum calculation to safely handle large integer values.


