# 118. Pascal's Triangle

## Problem

Given an integer `numRows`, return the first `numRows` of **Pascal's Triangle**.

In Pascal's Triangle:

* The first and last element of every row is `1`.
* Every other element is the sum of the two elements directly above it from the previous row.

### Example

**Input**

```text
numRows = 5
```

**Output**

```text
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

---

## Approach

This solution builds Pascal's Triangle **row by row**.

* Each row is stored as a list inside the final answer.
* The first and last element of every row are always `1`.
* For all other positions, the value is computed as the sum of the two adjacent elements from the previous row.

By using the previously generated rows, the triangle is constructed iteratively without recomputing values.

---

## Algorithm

1. Create an empty list to store all rows.
2. Iterate from row `0` to `numRows - 1`.
3. Create a new row.
4. For each position in the row:

   * If it is the first or last position, insert `1`.
   * Otherwise, compute:

     ```text
     currentValue = previousRow[j - 1] + previousRow[j]
     ```
5. Add the completed row to the answer.
6. Return the list containing all rows.

---

## Complexity Analysis

| Complexity | Value           |
| ---------- | --------------- |
| Time       | **O(numRows²)** |
| Space      | **O(numRows²)** |

The space complexity includes the storage required for the output triangle.

---

## Key Concepts

* Dynamic Programming
* 2D Lists
* Simulation
* Mathematical Patterns
* Array/List Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Builds the triangle iteratively.
* Uses previously generated rows to compute new values.
* Handles boundary elements (`1`) separately.
* Produces the complete triangle efficiently.


