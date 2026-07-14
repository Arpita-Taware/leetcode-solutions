# 74. Search a 2D Matrix

## Problem

You are given an `m × n` integer matrix with the following properties:

* Each row is sorted in non-decreasing order.
* The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` if the target exists in the matrix; otherwise, return `false`.

You must design an algorithm with **O(log(m × n))** time complexity.

### Example

**Input**

```text
matrix = [
  [1,3,5,7],
  [10,11,16,20],
  [23,30,34,60]
]

target = 3
```

**Output**

```text
true
```

---

## Approach

This solution treats the entire **2D matrix as a single sorted 1D array**.

Instead of performing two separate binary searches, a single binary search is applied over the range `0` to `m × n - 1`.

For any middle index:

* The corresponding row is calculated using:

  ```text
  row = mid / numberOfColumns
  ```
* The corresponding column is calculated using:

  ```text
  column = mid % numberOfColumns
  ```

This mapping allows direct access to the matrix element while maintaining logarithmic search time.

---

## Algorithm

1. Determine the number of rows `m` and columns `n`.
2. Initialize:

   * `lo = 0`
   * `hi = (m × n) - 1`
3. While `lo <= hi`:

   * Compute the middle index.
   * Convert the index into matrix coordinates:

     * `row = mid / n`
     * `column = mid % n`
   * Compare the matrix element with the target.
   * If equal, return `true`.
   * If greater, search the left half.
   * Otherwise, search the right half.
4. If the target is not found, return `false`.

---

## Complexity Analysis

| Complexity | Value             |
| ---------- | ----------------- |
| Time       | **O(log(m × n))** |
| Space      | **O(1)**          |

where:

* `m` = number of rows
* `n` = number of columns

---

## Key Concepts

* Binary Search
* 2D Matrix
* Index Mapping
* Divide and Conquer
* Array Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Treats the matrix as a virtual sorted 1D array.
* Converts a 1D index into 2D coordinates using division and modulo operations.
* Performs a single binary search without flattening the matrix.
* Achieves the required **O(log(m × n))** time complexity using constant extra space.

