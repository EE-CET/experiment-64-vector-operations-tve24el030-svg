# Experiment 64: Vector Operations

## Problem Statement

Write a menu-driven Java program to manage a list of student names using the `Vector` class. Implement the following options:

1. Add a student name.
2. Insert a name at a specific index (**1-based index input**).
3. Remove a name.
4. Display the list.
5. Exit.

## Input Format
* Integers for menu choices.
* Strings for student names.
* Integers for index (when inserting, the index is 1-based, meaning index 1 corresponds to the first position).

## Output Format
* Specific messages for each operation as shown in the example (`Added`, `Inserted`, `Removed`).
* The display option should print the vector elements in standard bracket notation (e.g., `[Name1, Name2]`).

### Example Interaction

**Input:**
```text
1 Alice
1 Bob
2 Charlie 2
4
3 Bob
4
5
```

**Output:**
```text
Added
Added
Inserted
[Alice, Charlie, Bob]
Removed
[Alice, Charlie]
```
