# 189. Rotate Array

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example

**Input**
```text
nums = [1,2,3,4,5,6,7], k = 3
```

**Output**
```text
[5,6,7,1,2,3,4]
```

---

## Approach

The array can be rotated efficiently using the **Reversal Algorithm**.

Steps:
1. Compute the effective rotation using `k = k % n`.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.

This method performs the rotation in-place without using extra space.

---

## Algorithm

1. Find the length of the array.
2. Update `k = k % n` to handle cases where `k` is greater than the array length.
3. Reverse the complete array.
4. Reverse the first `k` elements.
5. Reverse the remaining elements.
6. Return the rotated array.

---

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time | **O(n)** |
| Space | **O(1)** |

---

## Key Concepts

- Array Manipulation
- Two Pointers
- In-place Algorithm
- Reversal Technique

---

## Solution

Implemented in **Java**.

