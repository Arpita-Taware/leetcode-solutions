# 852. Peak Index in a Mountain Array

## Problem

A **mountain array** is an array where:

* Elements strictly increase to a peak element.
* Elements strictly decrease after the peak.

Given a mountain array `arr`, return the **index** of the peak element.

### Example

**Input**

```text id="s1vplg"
arr = [0,2,1,0]
```

**Output**

```text id="9azm6s"
1
```

---

## Approach

This solution uses **Binary Search** to locate the peak element efficiently.

In a mountain array:

* If `arr[mid] < arr[mid + 1]`, we are on the **ascending slope**, so the peak lies to the right.
* If `arr[mid] > arr[mid + 1]`, we are on the **descending slope** or at the peak, so the peak lies at `mid` or to its left.

By repeatedly narrowing the search space, the peak index can be found in logarithmic time.

---

## Algorithm

1. Initialize two pointers:

   * `lo = 0`
   * `hi = n - 1`
2. While `lo < hi`:

   * Compute `mid`.
   * If `arr[mid] < arr[mid + 1]`, move to the right half:

     ```text
     lo = mid + 1
     ```
   * Otherwise, move to the left half:

     ```text
     hi = mid
     ```
3. When the loop ends, `lo` and `hi` point to the peak element.
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

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses binary search instead of linear traversal.
* Identifies whether the middle element lies on the increasing or decreasing side of the mountain.
* Narrows the search space by half in every iteration.
* Achieves the optimal **O(log n)** time complexity.


