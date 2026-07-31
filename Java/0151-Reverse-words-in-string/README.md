# 151. Reverse Words in a String

## Problem

Given a string `s`, reverse the order of the words.

A word is a sequence of non-space characters. The returned string should:

* Have the words in reverse order.
* Contain only a single space between words.
* Have no leading or trailing spaces.

### Example

**Input**

```text
s = "the sky is blue"
```

**Output**

```text
"blue is sky the"
```

### Example 2

**Input**

```text
s = "  hello world  "
```

**Output**

```text
"world hello"
```

---

## Approach

This solution traverses the string **from right to left** and extracts each word as it encounters it.

A `StringBuilder` is used to construct the final reversed string.

The process is:

1. Start from the end of the string.
2. Skip any trailing or consecutive spaces.
3. Mark the end of the current word.
4. Move left until the beginning of the word is reached.
5. Extract the word using `substring()`.
6. Append it to the result.
7. Repeat until the beginning of the string is reached.

Since the string is traversed from right to left, the words are naturally added in reverse order.

---

## Algorithm

1. Initialize a `StringBuilder` named `result`.
2. Start from the last character using index `i`.
3. Skip spaces while moving left.
4. Store the current position as the end of the word.
5. Continue moving left until a space or the beginning of the string is reached.
6. Extract the word using:

   ```text
   s.substring(i + 1, end + 1)
   ```
7. Append a space before the word if the result already contains text.
8. Append the extracted word.
9. Repeat until all words are processed.
10. Return the resulting string.

---

## Complexity Analysis

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(n)** |

where `n` is the length of the input string.

The `StringBuilder` stores the resulting reversed string.

---

## Key Concepts

* Strings
* StringBuilder
* String Traversal
* Two Pointers
* String Manipulation

---

## Solution

Implemented in **Java**.

### Code Highlights

* Traverses the string from **right to left**.
* Handles multiple spaces automatically.
* Removes leading and trailing spaces from the result.
* Uses `StringBuilder` to construct the answer efficiently.
* Does not require splitting the string into an array of words.

