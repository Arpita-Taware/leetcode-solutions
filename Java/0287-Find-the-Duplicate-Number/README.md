# 287. Find the Duplicate Number

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive, there is only **one repeated number**.

Return the duplicate number without modifying the array.

### Example

**Input**

```text id="m3r81k"
nums = [1,3,4,2,2]
```

**Output**

```text id="rq6v5e"
2
```

---

## Approach

This solution uses a **frequency array** to keep track of the numbers that have already been encountered.

As the array is traversed:

* If a number is seen for the first time, its frequency is marked.
* If the number has already been marked, it is the duplicate and is returned immediately.

This approach is simple, efficient, and requires only one traversal of the input array.

---

## Algorithm

1. Create a frequency array of size `n + 1`, initialized with zeros.
2. Traverse the input array.
3. For each element:

   * If its frequency is `0`, increment it.
   * Otherwise, return that element as the duplicate.
4. If no duplicate is found, return `0`.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(n)** |

where `n` is the number of elements in the input array.

---

## Key Concepts

* Arrays
* Frequency Array
* Hashing
* Array Traversal

---

## Solution

Implemented in **Java**.

### Code Highlights

* Uses a frequency array to record previously visited numbers.
* Detects the duplicate during a single traversal.
* Returns immediately after finding the repeated element.
* Provides a straightforward and easy-to-understand solution.
