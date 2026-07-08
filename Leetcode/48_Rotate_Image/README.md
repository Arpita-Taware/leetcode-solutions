# 48. Rotate Image

## Problem

Given an `n × n` 2D matrix representing an image, rotate the image by **90 degrees clockwise**.

You must rotate the image **in-place**, meaning you cannot allocate another 2D matrix to perform the rotation.

### Example

**Input**

```text
matrix = [[1,2,3],
          [4,5,6],
          [7,8,9]]
```

**Output**

```text
[[7,4,1],
 [8,5,2],
 [9,6,3]]
```

---

## Approach

This solution rotates the matrix in-place using two simple steps:

1. **Transpose the matrix**

   * Swap the elements across the main diagonal.
   * Every element at `matrix[i][j]` is swapped with `matrix[j][i]`.

2. **Reverse each row**

   * After transposition, reverse every row using the two-pointer technique.
   * This converts the transposed matrix into the required 90° clockwise rotated matrix.

Since the operations are performed directly on the original matrix, no additional 2D matrix is required.

---

## Algorithm

1. Find the size `n` of the matrix.
2. Traverse only the lower triangular part of the matrix (`j < i`) and swap:

   ```text
   matrix[i][j] ↔ matrix[j][i]
   ```
3. For each row:

   * Initialize two pointers (`left` and `right`).
   * Swap the corresponding elements while `left < right`.
4. Return the modified matrix.

---

## Complexity Analysis

| Complexity | Value     |
| ---------- | --------- |
| Time       | **O(n²)** |
| Space      | **O(1)**  |

---

## Key Concepts

* Matrix
* In-place Algorithm
* Matrix Transposition
* Two Pointers
* Array Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* **Step 1:** Transpose the matrix by swapping elements across the main diagonal.
* **Step 2:** Reverse each row using two pointers.
* Achieves the required rotation without using extra space.

### Suggested Folder Structure

