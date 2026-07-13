# 33. Search in Rotated Sorted Array

## Problem

There is an integer array `nums` sorted in ascending order and then rotated at an unknown pivot.

Given the rotated array `nums` and an integer `target`, return the **index** of `target` if it exists in the array; otherwise, return `-1`.

You must write an algorithm with **O(log n)** runtime complexity.

### Example

**Input**

```text
nums = [4,5,6,7,0,1,2], target = 0
```

**Output**

```text
4
```

---

## Approach

This solution uses **Binary Search** by taking advantage of the fact that **at least one half of the rotated array is always sorted**.

For every middle element:

* If the left half is sorted, check whether the target lies within that range.

  * If it does, continue searching in the left half.
  * Otherwise, search the right half.
* If the right half is sorted, check whether the target lies within that range.

  * If it does, continue searching in the right half.
  * Otherwise, search the left half.

By eliminating half of the search space in every iteration, the target is found efficiently.

---

## Algorithm

1. Initialize two pointers:

   * `lo = 0`
   * `hi = n - 1`
2. While `lo <= hi`:

   * Compute the middle index.
   * If the middle element equals the target, return its index.
   * Determine whether the left half is sorted.

     * If the target lies within the sorted left half, search left.
     * Otherwise, search right.
   * Otherwise, the right half must be sorted.

     * If the target lies within the sorted right half, search right.
     * Otherwise, search left.
3. If the target is not found, return `-1`.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(log n)** |
| Space      | **O(1)**     |

---

## Key Concepts

* Binary Search
* Rotated Sorted Array
* Divide and Conquer
* Search Algorithms
* Array Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses binary search without first finding the rotation pivot.
* Identifies which half of the array is sorted during each iteration.
* Narrows the search space based on the target's position relative to the sorted half.
* Achieves the required **O(log n)** time complexity with constant extra space.

