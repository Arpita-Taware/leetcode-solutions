# 268. Missing Number

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

### Example

**Input**

```text
nums = [3,0,1]
```

**Output**

```text
2
```

---

## Approach

This solution uses the **Gauss Sum Formula**.

The sum of the first `n` natural numbers (including `0`) is:

```text
n × (n + 1) / 2
```

By calculating the expected sum of numbers from `0` to `n` and subtracting the actual sum of the elements in the array, the missing number can be found efficiently.

---

## Algorithm

1. Calculate the expected sum using the formula `n × (n + 1) / 2`.
2. Compute the actual sum of all elements in the array.
3. Return the difference between the expected sum and the actual sum.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |

---

## Key Concepts

* Mathematics
* Gauss Sum Formula
* Array Traversal
* Constant Space Optimization

---

## Solution

Implemented in **Java**.

### Suggested Folder Structure

