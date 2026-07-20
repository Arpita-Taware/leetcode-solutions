# 867. Transpose Matrix

## Problem

Given a 2D integer matrix `matrix`, return its **transpose**.

The transpose of a matrix is obtained by converting all rows into columns and all columns into rows.

### Example

**Input**

```text
matrix = [[1,2,3],
          [4,5,6],
          [7,8,9]]
```

**Output**

```text
[[1,4,7],
 [2,5,8],
 [3,6,9]]
```

---

## Approach

Create a new matrix with dimensions **columns × rows**.

Traverse every element of the original matrix and place it in the transposed position:

* Element at `matrix[i][j]` is placed at `transpose[j][i]`.

Since every element is visited exactly once, this approach is both simple and efficient.

---

## Algorithm

1. Determine the number of rows `m` and columns `n` of the input matrix.
2. Create a new matrix of size `n × m`.
3. Traverse the original matrix using nested loops.
4. Assign:

   ```text
   transpose[j][i] = matrix[i][j]
   ```
5. Return the transposed matrix.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(m × n)** |
| Space      | **O(m × n)** |

where:

* `m` = number of rows
* `n` = number of columns

---

## Key Concepts

* Matrix
* 2D Arrays
* Matrix Traversal
* Row and Column Manipulation

---

## Solution

Implemented in **Java**.


