# Chapter01 - Python Parallel Programming
cat > ~/Desktop/PDC-SP26-SE/Chapter01/README.md << 'EOF'
# Chapter01 - Getting Started with Parallel Programming 🚀

## 📌 Overview
This chapter provides a comprehensive introduction to parallel programming in Python.
Parallel programming allows multiple tasks to run simultaneously, improving performance
and efficiency of programs.

## 🎯 Learning Objectives
- Understand the concept of parallel programming
- Learn the difference between concurrency and parallelism
- Implement threads and processes in Python
- Understand synchronization and communication between threads
- Learn how to avoid deadlocks and race conditions

## 📚 Topics Covered
1. Introduction to Parallel Computing
2. Threads vs Processes
3. Python Threading Module
4. Python Multiprocessing Module
5. Synchronization Primitives
6. Locks and Semaphores
7. Thread Communication
8. Race Conditions and Deadlocks
9. Global Interpreter Lock (GIL)
10. Performance Optimization

## 🛠️ Requirements
- Python 3.x
- Threading Module (built-in)
- Multiprocessing Module (built-in)
- Queue Module (built-in)

## 📂 File Structure
Chapter01/
├── README.md
├── thread_definition.py
├── thread_determination.py
├── threading_with_queue.py
├── multiprocessing_example.py
└── synchronization_example.py

## 💻 How to Run
```python
# Running a thread example
python thread_definition.py

# Running multiprocessing example
python multiprocessing_example.py
```

## 📖 Key Concepts

### 🔹 What is Parallel Programming?
Parallel programming is a type of computation where many calculations or processes
are carried out simultaneously.

### 🔹 Threads vs Processes
| Feature | Threads | Processes |
|---------|---------|-----------|
| Memory | Shared | Separate |
| Speed | Faster | Slower |
| Safety | Less Safe | More Safe |
| Communication | Easy | Complex |


### 🔹 Global Interpreter Lock (GIL)
GIL is a mutex that protects access to Python objects, preventing multiple threads
from executing Python bytecodes at once.

### 🔹 Synchronization
Synchronization is used to control access to shared resources and prevent race
conditions between threads.

## ⚠️ Common Issues
- **Race Condition** - When two threads access shared data simultaneously
- **Deadlock** - When two threads wait for each other to release resources
- **Starvation** - When a thread never gets CPU time

## 📝 Summary
This chapter gave us a strong foundation in parallel programming concepts using Python.
We learned about threads, processes, synchronization, and how to avoid common pitfalls
in parallel programming.



## 🔗 References
- Teacher Repo: [PacktPublishing](https://github.com/PacktPublishing/Python-Parallel-Programming-Cookbook-Second-Edition)

- My Repo: [PDC-SP26-SE](https://github.com/23fa-021-se-lgtm/PDC-SP26-SE)

- Python Official Docs: [Threading](https://docs.python.org/3/library/threading.html)

- Python Official Docs: [Multiprocessing](https://docs.python.org/3/library/multiprocessing.html)

## 👨‍💻 Author
- **Student:** 23FA-021-SE
- **Course:** Parallel and Distributed Computing (PDC)
- **Semester:** Spring 2026
EOF