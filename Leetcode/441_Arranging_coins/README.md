# 441. Arranging Coins

## Problem

You have `n` coins and want to build a staircase.

The staircase consists of `k` rows where:

* The first row contains `1` coin.
* The second row contains `2` coins.
* The third row contains `3` coins.
* And so on.

Return the total number of **complete rows** that can be formed.

### Example

**Input**

```text
n = 5
```

**Output**

```text
2
```

**Explanation**

```text
Row 1 → 1 coin
Row 2 → 2 coins
Row 3 → requires 3 coins (only 2 remain)

Complete rows = 2
```

---

## Approach

This solution combines **Mathematics** and **Binary Search**.

The total number of coins required to build `k` complete rows is:

```text
k × (k + 1) / 2 ≤ n
```

Rearranging the inequality gives:

```text
k = (√(8n + 1) - 1) / 2
```

Instead of using the built-in square root function, the solution computes the integer square root of `8n + 1` using **Binary Search**, making it efficient and avoiding floating-point precision issues.

---

## Algorithm

1. Convert `n` to `long` to avoid integer overflow.
2. Compute the value:

   ```text
   8 × n + 1
   ```
3. Find its integer square root using binary search.
4. Apply the formula:

   ```text
   (√(8n + 1) - 1) / 2
   ```
5. Return the result as the number of complete rows.

---

## Complexity Analysis

| Complexity | Value        |
| ---------- | ------------ |
| Time       | **O(log n)** |
| Space      | **O(1)**     |

---

## Key Concepts

* Mathematics
* Binary Search
* Integer Square Root
* Overflow Handling
* Number Theory

---

## Solution

Implemented in **Java**.

### Code Highlights

* Derives the answer using the arithmetic series formula.
* Uses a custom binary search to compute the integer square root.
* Avoids floating-point operations and precision errors.
* Uses `long` arithmetic to safely handle large input values.


