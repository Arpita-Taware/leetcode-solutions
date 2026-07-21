# 75. Sort Colors

## Problem

Given an array `nums` containing `0`s, `1`s, and `2`s, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order **red (0), white (1), and blue (2)**.

You must solve the problem without using the library's sort function.

### Example

**Input**

```text
nums = [2,0,2,1,1,0]
```

**Output**

```text
[0,0,1,1,2,2]
```

---

## Approach

This solution uses the **Dutch National Flag Algorithm** with three pointers:

* `low` tracks the position where the next `0` should be placed.
* `mid` traverses the array.
* `high` tracks the position where the next `2` should be placed.

During traversal:

* If `nums[mid] == 0`, swap it with `nums[low]` and increment both `low` and `mid`.
* If `nums[mid] == 1`, simply increment `mid`.
* If `nums[mid] == 2`, swap it with `nums[high]` and decrement `high`.

This sorts the array in a single pass without using extra space.

---

## Algorithm

1. Initialize three pointers: `low = 0`, `mid = 0`, and `high = n - 1`.
2. Traverse the array while `mid <= high`.
3. If the current element is:

   * `0`: swap with `low`, then increment both `low` and `mid`.
   * `1`: increment `mid`.
   * `2`: swap with `high`, then decrement `high`.
4. Continue until the array is completely sorted.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |

---

## Key Concepts

* Two Pointers
* Dutch National Flag Algorithm
* Array Manipulation
* In-place Sorting

---

## Solution

Implemented in **Java**.



