# Chapter05 - Python Parallel Programming

# 🚀 Chapter 05 – Asynchronous Programming in Python

![Python](https://img.shields.io/badge/Python-3.x-blue)
![AsyncIO](https://img.shields.io/badge/AsyncIO-Concurrency-green)
![Status](https://img.shields.io/badge/Status-Completed-success)

---

## 📖 Introduction

This chapter explores Python's asynchronous programming model using **AsyncIO** and **Concurrent Futures**.

The objective is to understand how Python executes multiple operations concurrently without blocking the main program flow.

---

## 🏗 Architecture Overview

```mermaid
graph LR

A[Main Program]
B[Event Loop]

A --> B

B --> C[Coroutine 1]
B --> D[Coroutine 2]
B --> E[Coroutine 3]

C --> F[Await I/O]
D --> F
E --> F

F --> G[Resume Execution]
```

---

## 📂 Project Modules

| Module | Description |
|----------|------------|
| `asyncio_coroutine.py` | Coroutine implementation |
| `asyncio_event_loop.py` | Event loop scheduling |
| `asyncio_task_manipulation.py` | Task creation and management |
| `asyncio_and_futures.py` | Futures and callbacks |
| `concurrent_futures_pooling.py` | Thread and Process pools |

---

# 🔹 AsyncIO Coroutines

## What is a Coroutine?

A coroutine is a function that can pause its execution and later continue from the same point.

### Workflow

```mermaid
sequenceDiagram
    participant User
    participant Coroutine

    User->>Coroutine: Start
    Coroutine->>Coroutine: Execute
    Coroutine-->>User: Suspend
    User->>Coroutine: Resume
    Coroutine-->>User: Result
```

### Key Benefits

✅ Non-blocking execution

✅ Better responsiveness

✅ Efficient task handling

### Challenges

❌ Learning curve

❌ Debugging complexity

---

# 🔹 Event Loop

## Purpose

The Event Loop acts as the scheduler of AsyncIO.

It continuously checks pending tasks and executes them whenever resources become available.

### Lifecycle

```mermaid
flowchart TD

A[Create Loop]
B[Register Tasks]
C[Execute]
D[Wait]
E[Resume]
F[Complete]

A --> B --> C --> D --> E --> F
```

---

# 🔹 Task Management

## Overview

Tasks wrap coroutines and allow them to run independently.

### Task Execution Model

```mermaid
graph TD

A[Coroutine]
B[Task Creation]
C[Scheduling]
D[Concurrent Execution]
E[Completion]

A --> B --> C --> D --> E
```

### Advantages

- Improved concurrency
- Better task organization
- Simplified scheduling

---

# 🔹 Futures

## Overview

A Future represents a result that is not available immediately but will be produced later.

### Future State Diagram

```mermaid
stateDiagram-v2

Pending --> Running
Running --> Completed
Running --> Cancelled
Completed --> Result
```

### Features

- Result tracking
- Callback support
- Asynchronous communication

---

# 🔹 Concurrent Futures

## ThreadPool & ProcessPool

Python provides executor pools for parallel execution.

### Architecture

```mermaid
graph TD

A[Main Program]

A --> B[Executor Pool]

B --> C[Worker 1]
B --> D[Worker 2]
B --> E[Worker 3]

C --> F[Results]
D --> F
E --> F
```

---

# ⚡ Execution Comparison

```mermaid
graph LR

A[Sequential]

A --> B[Task 1]
B --> C[Task 2]
C --> D[Task 3]

E[AsyncIO]

E --> F[Task 1]
E --> G[Task 2]
E --> H[Task 3]
```

---

# 📊 AsyncIO vs Traditional Programming

| Feature | Traditional | AsyncIO |
|----------|------------|----------|
| Execution | Sequential | Concurrent |
| Blocking | Yes | No |
| Performance | Moderate | High |
| Scalability | Limited | Excellent |
| Resource Usage | Higher | Lower |

---

# 📊 Task vs Future

| Feature | Task | Future |
|----------|------|--------|
| Runs Coroutine | ✅ | ❌ |
| Stores Result | ✅ | ✅ |
| Awaitable | ✅ | ✅ |
| Scheduled Automatically | ✅ | ❌ |

---

# 🎯 Learning Outcomes

After completing this chapter, you will be able to:

- Understand asynchronous programming concepts.
- Create and manage coroutines.
- Work with AsyncIO event loops.
- Implement task scheduling.
- Use Future objects effectively.
- Execute workloads using ThreadPoolExecutor.
- Execute workloads using ProcessPoolExecutor.
- Compare synchronous and asynchronous execution models.

---

# 🛠 Requirements

```bash
Python 3.x
```

Verify installation:

```bash
python --version
```

---

# ▶ Running Examples

### Coroutines

```bash
python asyncio_coroutine.py
```

### Event Loop

```bash
python asyncio_event_loop.py
```

### Tasks

```bash
python asyncio_task_manipulation.py
```

### Futures

```bash
python asyncio_and_futures.py
```

### Concurrent Futures

```bash
python concurrent_futures_pooling.py
```

---

# 📝 Key Takeaways

> AsyncIO enables highly efficient asynchronous execution by allowing tasks to pause and resume without blocking the program.

> Futures provide placeholders for results that will become available later.

> Concurrent Futures simplifies multithreading and multiprocessing through executor pools.

> Event Loops act as the heart of AsyncIO and coordinate all asynchronous operations.

---

## ⭐ Conclusion

This chapter provides practical exposure to modern Python concurrency techniques and serves as a foundation for developing scalable network applications, APIs, web services, and high-performance systems.