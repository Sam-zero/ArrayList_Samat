# My Custom Data Structures Implementation

## Author: Samat Zharylkap 

## Group: BDA-2409

## Overview

This project provides custom implementations of several fundamental data structures in Java. The goal was to create these data structures from scratch, adhering to specific constraints and demonstrating a strong understanding of their underlying principles.  Specifically, this project includes:

* `MyArrayList`: A dynamic array implementation similar to `ArrayList`.
* `MyLinkedList`: A doubly linked list implementation similar to `LinkedList`.
* `MyStack`: A stack data structure.
* `MyQueue`: A queue data structure.
* `MyMinHeap`: A min-heap data structure.

A key constraint of this project was to avoid using any classes from the `java.util.*` package, except for `java.util.Iterator`.

## Features

* **Generic Types:** All data structures support generic types (`<T>`) to work with various data types.
* **Custom `MyList` Interface:** `MyArrayList` and `MyLinkedList` implement a custom `MyList<T>` interface, defining common list operations.
* **Memory Management:** `MyArrayList` dynamically resizes to accommodate growing data.
* **Efficient Operations:** `MyLinkedList` offers efficient insertion and deletion at both ends.
* **Min-Heap Functionality:** `MyMinHeap` provides efficient retrieval and removal of the minimum element.
* **Comprehensive Testing:** Each data structure is accompanied by its own set of test classes, located in the `src/` directory.

## Data Structure Choices and Justifications

A crucial aspect of this project was selecting appropriate underlying data structures for the logical data structures (`MyStack`, `MyQueue`, `MyMinHeap`). Here's the rationale behind the choices:

* **MyStack:** Implemented using `MyLinkedList`. A linked list is a suitable choice for a stack because `push` and `pop` operations (adding and removing elements from the top) can be performed efficiently at the head of a linked list (O(1) time complexity).
* **MyQueue:** Implemented using `MyLinkedList`.  Similarly, a linked list provides efficient `enqueue` (add to the rear) and `dequeue` (remove from the front) operations.  Adding to the tail and removing from the head of a linked list are both O(1) operations.
* **MyMinHeap:** Implemented using `MyArrayList`.  While a tree-based structure is the logical representation of a heap, an array allows for efficient storage and calculation of parent-child relationships using array indices.  This provides a good balance of performance and simplicity for this implementation.

## How to Compile and Run

1.  **Compilation:**
    * Navigate to the project's root directory in your terminal.
    * Compile all Java files (source and tests):
        ```bash
        javac src/*.java
        ```
2.  **Running Tests:**
    * To run the tests for a specific data structure (e.g., `MyArrayList`):
        ```bash
        java src.MyArrayListTest
        ```
    * Replace `src.MyArrayListTest` with the appropriate test class name (`src.MyLinkedListTest`, `src.MyStackTest`, etc.) to run other tests.
    * **Note:** These commands assume your `CLASSPATH` is set correctly or that you are running them from within the correct directory.

## Design Decisions

* **Doubly Linked List:** `MyLinkedList` is implemented as a doubly linked list to provide O(1) time complexity for `addFirst()`, `addLast()`, `removeFirst()`, and `removeLast()`. This design choice prioritizes efficient operations at both ends of the list.
* **Array Resizing:** `MyArrayList` uses a dynamic array that automatically increases its capacity when it becomes full. The capacity is typically doubled to balance memory usage and the frequency of resizing operations.
* **Generic Type Handling:** The `Comparable<T>` interface or a `Comparator<T>` (if implemented in methods like `sort()`) is used to handle comparisons between generic type elements, allowing for sorting and other operations on comparable objects.

## Limitations

* **Basic Testing:** The provided test classes primarily focus on basic functionality. More comprehensive testing (e.g., edge cases, performance tests) could be added.
* **Error Handling:** While basic error handling is implemented (e.g., `IndexOutOfBoundsException`), more robust error management could be incorporated.

