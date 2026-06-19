# Pattern Note: Maximum Frequency Substring + Distinct Character Constraint

## Problem Type

Given:

* String `s`
* `maxLetters`
* `minSize`
* `maxSize`

Find the maximum frequency of a substring satisfying the constraints.

---

## Initial Wrong Thinking

I tried to maintain:

```java
minSize <= windowSize <= maxSize
```

and count all substrings inside the window.

Problem:

* One window cannot represent all valid substrings.
* Substrings like `"aba"` may get skipped.
* Character frequency map belongs only to the current window, not every substring inside it.

This makes the logic messy.

---

## Key Observation

Suppose:

```text
aab
```

appears 10 times.

Then:

```text
aaba
```

cannot appear more than 10 times.

Why?

Because every occurrence of:

```text
aaba
```

contains:

```text
aab
```

but not every occurrence of:

```text
aab
```

extends to:

```text
aaba
```

Therefore:

```text
frequency(smaller substring)
>=
frequency(larger substring)
```

---

## Why Only minSize Works

For condition:

```text
distinct characters <= K
```

If a larger substring is valid, any smaller piece of it is also valid.

Example:

```text
abca
```

Distinct = 3

Smaller substring:

```text
abc
```

Distinct = 3

Still valid.

Therefore the maximum frequency must come from the shortest allowed length:

```java
minSize
```

So:

```java
Ignore maxSize
Use fixed window of size minSize
```

---

## Sliding Window Pattern

Maintain:

```java
HashMap<Character,Integer> charFreq
HashMap<String,Integer> substringFreq
```

Window size:

```java
minSize
```

Logic:

```java
Add right character

If window > minSize
    remove left character
    if frequency becomes 0
        remove from map

If window == minSize
    if distinctChars <= maxLetters
        count substring frequency
```

---

## Important Bug to Remember

Wrong:

```java
map.put(ch,map.get(ch)-1);
left++;
```

Correct:

```java
map.put(ch,map.get(ch)-1);

if(map.get(ch)==0)
{
    map.remove(ch);
}

left++;
```

Otherwise:

```java
map.size()
```

becomes incorrect.

---

## When This Trick Fails

For condition:

```text
distinct characters >= K
```

The proof breaks.

Example:

```text
abcd
```

Distinct = 4 (valid)

Smaller substring:

```text
ab
```

Distinct = 2 (invalid)

So:

```text
larger valid
≠
smaller valid
```

Therefore we cannot automatically say:

```java
Use only minSize
```

The optimization is specific to:

```text
distinct characters <= K
```

---

## What I Learned

1. Longer substrings are more restrictive and usually repeat less.
2. Every occurrence of a larger substring guarantees an occurrence of its smaller piece.
3. For "at most K distinct characters", the shortest valid length (`minSize`) is enough.
4. Always verify why an optimization works instead of memorizing it.
5. Fixed-size windows are much cleaner than trying to maintain all lengths simultaneously.
