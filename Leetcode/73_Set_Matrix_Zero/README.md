# 73. Set Matrix Zeroes

## Problem

Given an `m × n` integer matrix, if an element is `0`, set its **entire row and column** to `0`.

You must perform the operation **in-place** without using additional space proportional to the size of the matrix.

### Example

**Input**

```text
matrix = [
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
```

**Output**

```text
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
```

---

## Approach

This solution achieves **O(1) extra space** by using the **first row and first column as marker arrays**.

Since the first row and first column are reused for marking, two boolean variables are maintained to remember whether they originally contained any zero.

The algorithm works in four steps:

1. Check whether the **first row** or **first column** initially contains a zero.
2. Traverse the remaining matrix. Whenever a zero is found, mark its corresponding row and column by setting the first element of that row and column to zero.
3. Traverse the matrix again (excluding the first row and first column). If either the row marker or column marker is zero, set the current element to zero.
4. Finally, update the first row and first column if they originally contained zeros.

This approach modifies the matrix in-place while using only constant extra memory.

---

## Algorithm

1. Initialize two boolean variables:

   * `firstRowZero`
   * `firstColZero`
2. Check whether the first row contains any zero.
3. Check whether the first column contains any zero.
4. Traverse the remaining matrix.
5. Whenever a zero is found:

   * Set the corresponding first row element to zero.
   * Set the corresponding first column element to zero.
6. Traverse the matrix again (excluding the first row and first column):

   * If either marker is zero, set the current element to zero.
7. If `firstRowZero` is true, set every element in the first row to zero.
8. If `firstColZero` is true, set every element in the first column to zero.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(m × n)** |
| Space      | **O(1)**     |

where:

* `m` = number of rows
* `n` = number of columns

---

## Key Concepts

* Matrix
* In-place Algorithm
* Constant Space Optimization
* Matrix Traversal
* Row and Column Marking

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses the **first row and first column as markers** instead of extra arrays.
* Preserves the original state of the first row and first column using two boolean flags.
* Performs all modifications in-place with **constant extra space**.
* Efficiently updates the matrix in two passes after marking.

