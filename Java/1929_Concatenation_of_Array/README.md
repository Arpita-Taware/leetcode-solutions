# 1929. Concatenation of Array

## Problem

Given an integer array `nums` of length `n`, create a new array `ans` of length `2n` such that:

* `ans[i] = nums[i]`
* `ans[i + n] = nums[i]`

Return the concatenated array.

### Example

**Input**

```text
nums = [1,2,1]
```

**Output**

```text
[1,2,1,1,2,1]
```

---

## Approach

This solution creates a new array of size `2n`.

While traversing the original array once:

* Copy each element to the corresponding position in the first half of the new array.
* Copy the same element to the corresponding position in the second half (`i + n`).

This completes the concatenation in a single traversal.

---

## Algorithm

1. Find the length `n` of the input array.
2. Create a new array `ans` of size `2 × n`.
3. Traverse the original array.
4. For each index `i`:

   * Assign `ans[i] = nums[i]`.
   * Assign `ans[i + n] = nums[i]`.
5. Return the concatenated array.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(n)** |

The extra space is required for the output array of size `2n`.

---

## Key Concepts

* Arrays
* Array Traversal
* Simulation
* Index Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Traverses the input array only once.
* Copies each element into both halves of the result array.
* Produces the concatenated array with linear time complexity.

