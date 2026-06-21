# Cache Implementations in Java

A collection of cache implementations built using Java, focusing on efficient data retrieval, memory optimization, and cache eviction strategies commonly used in distributed systems and high-performance applications.

## Overview

Caching is a fundamental technique used to improve application performance by reducing expensive database calls, API requests, and computational overhead. This repository aims to provide clean, well-structured, and extensible implementations of popular caching algorithms while demonstrating core data structure and system design concepts.

Currently implemented:

* **LRU (Least Recently Used) Cache**

Planned implementations:

* LFU (Least Frequently Used) Cache
* FIFO (First In First Out) Cache
* MRU (Most Recently Used) Cache
* Time-Based Cache (TTL)
* Concurrent Thread-Safe Cache Variants

---

## Features

* O(1) cache operations for `get()` and `put()` in LRU implementation
* Clean Object-Oriented Design
* Extensible architecture for adding new cache strategies
* Well-structured and maintainable Java code
* Demonstrates practical use of HashMap and Doubly Linked List
* Suitable for learning Data Structures, System Design, and Low-Latency Application Development

---

## Implemented Cache

### LRU (Least Recently Used) Cache

The LRU Cache removes the least recently accessed item when the cache reaches its capacity.

#### Key Characteristics

* Fast lookup using HashMap
* Efficient ordering using Doubly Linked List
* Constant time complexity for insertion, deletion, and retrieval
* Widely used in databases, operating systems, browsers, and distributed systems

#### Time Complexity

| Operation       | Complexity |
| --------------- | ---------- |
| get(key)        | O(1)       |
| put(key, value) | O(1)       |
| Eviction        | O(1)       |

#### Space Complexity

O(capacity)

---

## Tech Stack

* Java
* Collections Framework
* HashMap
* Doubly Linked List
* Object-Oriented Programming Principles

---

## Project Structure

```text
src/
├── lru/
│   ├── LRUCache.java
│   ├── Node.java
│   └── Main.java
```

---

## Example Usage

```java
LRUCache cache = new LRUCache(3);

cache.put(1, "A");
cache.put(2, "B");
cache.put(3, "C");

cache.get(1);

cache.put(4, "D"); // Evicts key 2

System.out.println(cache.get(2)); // null
```

---

## Design Approach

The LRU Cache implementation combines:

* **HashMap** for constant-time key lookup
* **Doubly Linked List** for maintaining access order
* **Head/Tail pointers** for efficient insertion and eviction operations

This design ensures optimal performance while maintaining code readability and scalability.

---

## Learning Objectives

This repository demonstrates practical implementation of:

* Data Structures
* Algorithm Optimization
* Cache Eviction Policies
* Object-Oriented Design
* Performance Engineering
* Low-Latency System Concepts

---

## Future Enhancements

* Generic Cache Support (`<K, V>`)
* Thread-Safe Implementations
* Cache Statistics (Hits, Misses, Evictions)
* TTL-Based Expiration
* Benchmarking and Performance Testing
* Strategy Pattern for Pluggable Eviction Policies
