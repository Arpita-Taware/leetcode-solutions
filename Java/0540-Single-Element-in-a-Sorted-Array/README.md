# 540. Single Element in a Sorted Array

## Problem

You are given a **sorted** array consisting of only integers where every element appears **exactly twice**, except for one element that appears only once.

Return the single element that appears only once.

You must solve the problem in **O(log n)** time and **O(1)** space.

### Example

**Input**

```text id="t6zrjc"
nums = [1,1,2,3,3,4,4,8,8]
```

**Output**

```text id="ywtmow"
2
```

---

## Approach

This solution uses **Binary Search** to efficiently locate the unique element.

Before performing binary search, a few edge cases are handled:

* If the array contains only one element, return it.
* If the first element is unique, return it.
* If the last element is unique, return it.

During binary search:

* If the middle element is different from both its neighbors, it is the required answer.
* Otherwise, determine the pair containing the middle element.
* Count the number of elements on the left side of the pair.
* If the left partition contains an **even** number of elements, the unique element lies on the right; otherwise, it lies on the left.

This repeatedly halves the search space until the single element is found.

---

## Algorithm

1. Handle the edge cases:

   * Array size is `1`.
   * First element is unique.
   * Last element is unique.
2. Initialize `lo` and `hi`.
3. While `lo <= hi`:

   * Compute the middle index.
   * If the middle element differs from both neighbors, return it.
   * Determine the indices of the duplicate pair containing the middle element.
   * Count the elements on the left side of the pair.
   * If the left partition size is even, search the right half.
   * Otherwise, search the left half.
4. Return the unique element.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(log n)** |
| Space      | **O(1)**     |

---

## Key Concepts

* Binary Search
* Sorted Array
* Divide and Conquer
* Index Manipulation
* Constant Space Optimization

---

## Solution

Implemented in **Java**.

### Code Highlights

* Handles boundary cases before applying binary search.
* Identifies the duplicate pair containing the middle element.
* Uses the parity (even/odd count) of one partition to determine which half contains the unique element.
* Achieves the required **O(log n)** time complexity using constant extra space.

