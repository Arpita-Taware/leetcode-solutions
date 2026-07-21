# 852. Peak Index in a Mountain Array

## Problem

A **mountain array** is an array where:

* The elements strictly increase to a single peak.
* The elements strictly decrease after the peak.

Given a mountain array `arr`, return the **index** of the peak element.

You must solve the problem efficiently.

### Example

**Input**

```text
arr = [0,2,1,0]
```

**Output**

```text
1
```

---

## Approach

This solution uses **Binary Search** to locate the peak element in logarithmic time.

In a mountain array:

* If `arr[mid] < arr[mid + 1]`, the middle element lies on the **ascending slope**, so the peak must be on the right.
* Otherwise, the middle element lies on the **descending slope** or is itself the peak, so the search continues on the left, including `mid`.

By repeatedly discarding half of the search space, the algorithm efficiently converges to the peak index.

---

## Algorithm

1. Initialize two pointers:

   * `lo = 0`
   * `hi = n - 1`
2. While `lo < hi`:

   * Compute the middle index.
   * If `arr[mid] < arr[mid + 1]`, move to the right half:

     ```text
     lo = mid + 1
     ```
   * Otherwise, move to the left half:

     ```text
     hi = mid
     ```
3. When `lo == hi`, both pointers point to the peak element.
4. Return `lo`.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(log n)** |
| Space      | **O(1)**     |

---

## Key Concepts

* Binary Search
* Mountain Array
* Peak Element
* Divide and Conquer
* Array Traversal

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses binary search instead of linear traversal.
* Determines whether the middle element lies on the increasing or decreasing side of the mountain.
* Eliminates half of the search space in every iteration.
* Achieves the optimal **O(log n)** time complexity with constant extra space.


