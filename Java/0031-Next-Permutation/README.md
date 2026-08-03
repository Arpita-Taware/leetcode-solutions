# 31. Next Permutation

## Problem

A **permutation** of an array is an arrangement of its elements.

Given an array of integers `nums`, rearrange the numbers into the **next lexicographically greater permutation**.

If such a permutation is not possible (i.e., the array is in descending order), rearrange it into the **lowest possible order** (ascending order).

The replacement must be **in-place** and use only constant extra memory.

### Example

**Input**

```text id="dbqkpu"
nums = [1,2,3]
```

**Output**

```text id="87zizq"
[1,3,2]
```

---

## Approach

This solution computes the next permutation in-place using three steps:

1. **Find the pivot**

   * Traverse the array from right to left.
   * Locate the first index where `nums[i] < nums[i + 1]`.
   * This index marks the point where the next larger permutation can be formed.

2. **Find the successor**

   * Starting from the end of the array, find the first element greater than the pivot.
   * Swap it with the pivot.

3. **Reverse the suffix**

   * Reverse the portion of the array after the pivot.
   * Since the suffix is initially in descending order, reversing it produces the smallest possible arrangement.

If no pivot exists, the array is already the largest permutation, so reversing the entire array gives the smallest permutation.

---

## Algorithm

1. Traverse the array from right to left to find the first index where:

   ```text
   nums[i] < nums[i + 1]
   ```
2. If no such index exists:

   * Reverse the entire array.
   * Return.
3. Traverse from the end of the array to find the first element greater than the pivot.
4. Swap the pivot with that element.
5. Reverse the subarray after the pivot.
6. The resulting array is the next lexicographical permutation.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |

---

## Key Concepts

* Arrays
* Greedy Algorithm
* Two Pointers
* In-place Algorithm
* Lexicographical Order

---

## Solution

Implemented in **Java**.

### Code Highlights

* Finds the pivot by scanning from right to left.
* Swaps the pivot with the smallest greater element on its right.
* Reverses the suffix to obtain the next smallest lexicographical arrangement.
* Performs all operations in-place using constant extra space.
