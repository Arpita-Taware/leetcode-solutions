# 1. Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to `target`.

You may assume that each input has **exactly one solution**, and you may not use the same element twice.

The answer can be returned in any order.

### Example

**Input**

```text
nums = [2,7,11,15], target = 9
```

**Output**

```text
[0,1]
```

---

## Approach

This solution uses a **brute-force approach** by checking every possible pair of elements in the array.

Instead of using two independent indices, it iterates over the **distance (gap)** between two indices.

* The outer loop represents the gap between two elements.
* The inner loop selects the second index (`j`).
* The first index is calculated as `j - gap`.
* For each pair, the sum of the corresponding elements is checked against the target.
* As soon as a valid pair is found, the indices are returned.

Although this approach has the same time complexity as the conventional brute-force method, it explores pairs based on their distance rather than fixing the first index.

---

## Algorithm

1. Determine the length of the array.
2. Iterate over every possible gap from `1` to `n - 1`.
3. For each gap, traverse the array while ensuring both indices are valid.
4. For every pair:

   * First index = `j - gap`
   * Second index = `j`
5. If `nums[j - gap] + nums[j] == target`, return the two indices.
6. If no pair satisfies the condition, return an empty array.

---

## Complexity Analysis

| Complexity | Value     |
| ---------- | --------- |
| Time       | **O(n²)** |
| Space      | **O(1)**  |

---

## Key Concepts

* Arrays
* Brute Force
* Nested Loops
* Pair Enumeration
* Index Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses the **gap (distance)** between indices to generate all unique pairs.
* Avoids checking the same pair more than once.
* Returns immediately after finding the required pair.
* Requires only constant extra space.
