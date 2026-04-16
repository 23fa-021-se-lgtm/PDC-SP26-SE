# ============================================================
# CHAPTER 02: MULTITHREADING AND SYNCHRONIZATION IN PYTHON
# ============================================================

# ------------------------------------------------------------
# INTRODUCTION
# ------------------------------------------------------------
# This chapter presents the concept of multithreading in Python
# through the threading module. It explains how multiple tasks
# can be executed simultaneously and how shared data is managed
# securely using synchronization techniques.

# ------------------------------------------------------------
# PURPOSE
# ------------------------------------------------------------
# - To understand the fundamentals of multithreading
# - To learn how threads are created and controlled
# - To recognize issues such as race conditions
# - To implement synchronization mechanisms effectively

# ------------------------------------------------------------
# THREAD WORKFLOW
# ------------------------------------------------------------

#        Main Application
#              │
#     ┌────────┼────────┐
#     │        │        │
#  Thread A  Thread B  Thread C
#     │        │        │
#     └────────┴────────┘
#              │
#         Combined Output

# ------------------------------------------------------------
# RACE CONDITION (ISSUE)
# ------------------------------------------------------------

# Shared Variable = 0

# Thread-A → Reads (0)
# Thread-B → Reads (0)
# Thread-A → Updates (1)
# Thread-B → Updates (1)

# Final Value = 1 (Incorrect, expected 2)

# ------------------------------------------------------------
# SYNCHRONIZATION CONTROL FLOW
# ------------------------------------------------------------

#        ┌───────────────────────┐
#        │   Multiple Threads    │
#        └──────────┬────────────┘
#                   │
#                   ▼
#        ┌───────────────────────┐
#        │ Access Shared Resource│
#        └──────────┬────────────┘
#                   │
#          ┌────────┴────────┐
#          │                 │
#          ▼                 ▼
#   No Synchronization   With Synchronization
#          │                 │
#          ▼                 ▼
#   ┌───────────────┐   ┌───────────────┐
#   │ Race Condition│   │ Controlled    │
#   │ Inconsistent  │   │ Access        │
#   │ Data          │   │ (Safe Output) │
#   └───────────────┘   └───────┬───────┘
#                               │
#                               ▼
#                     ┌──────────────────┐
#                     │ Final Correct    │
#                     │ Result           │
#                     └──────────────────┘

# Explanation:
# Without synchronization, threads create inconsistent results.
# With proper mechanisms like locks or semaphores, execution
# becomes controlled and produces correct output.

# ------------------------------------------------------------
# LOCK (CONTROL MECHANISM)
# ------------------------------------------------------------

# Thread-A → Lock → Critical Section → Unlock
# Thread-B → Wait → Executes after release

# Ensures exclusive access to shared resources

# ------------------------------------------------------------
# REENTRANT LOCK (RLOCK)
# ------------------------------------------------------------

# Thread-A:
#   acquire()
#     acquire() again
#       release()
#         release()

# Allows repeated locking by the same thread

# ------------------------------------------------------------
# SEMAPHORE
# ------------------------------------------------------------

# Maximum limit = 2 threads

# Thread-A → Permitted
# Thread-B → Permitted
# Thread-C → Waiting
# Thread-D → Waiting

# Restricts access based on defined limit

# ------------------------------------------------------------
# EVENT MECHANISM
# ------------------------------------------------------------

# Worker Thread         Waiting Thread
#     │                     │
#   Task Complete        wait()
#     │                     │
#   set() --------------> Signal Received → Proceed

# Enables communication between threads

# ------------------------------------------------------------
# PRODUCER - CONSUMER MODEL
# ------------------------------------------------------------

#        ┌───────────────┐
#        │   Producer    │
#        │ (Generate Data)│
#        └───────┬───────┘
#                │
#                ▼
#        ┌───────────────┐
#        │     Queue     │
#        │ (Buffer Area) │
#        └───────┬───────┘
#                │
#                ▼
#        ┌───────────────┐
#        │   Consumer    │
#        │ (Process Data)│
#        └───────────────┘

# Flow:
# Producer → put(data) → Queue → get(data) → Consumer

# Explanation:
# The producer generates data and places it into a shared queue.
# The consumer retrieves and processes the data. The queue ensures
# safe communication between threads without direct conflict.
# ------------------------------------------------------------
# CONDITION SYNCHRONIZATION
# ------------------------------------------------------------

# Producer → generates data → notify()
# Consumer → waits → processes data

# Threads proceed only when conditions are satisfied

# ------------------------------------------------------------
# BARRIER SYNCHRONIZATION
# ------------------------------------------------------------

# Thread-A ─┐
# Thread-B ─┼──> Barrier → Continue simultaneously
# Thread-C ─┘

# All threads must reach a common point before moving forward

# ------------------------------------------------------------
# QUEUE-BASED COMMUNICATION
# ------------------------------------------------------------

# Producer → Queue → Consumer

# add(item) → queue → remove(item)

# Provides safe data exchange between threads

# ------------------------------------------------------------
# FILE DETAILS
# ------------------------------------------------------------

# Thread_definition.py → Introduction to threads
# Thread_determine.py → Thread behavior analysis
# Thread_name_and_processes.py → Thread identification
# MyThreadClass.py → User-defined thread class
# MyThreadClass_lock.py → Lock implementation
# MyThreadClass_lock_2.py → Advanced locking techniques
# Rlock.py → Reentrant locking
# Semaphore.py → Resource limitation control
# Event.py → Signaling mechanism
# Condition.py → Conditional synchronization
# Barrier.py → Thread coordination
# Threading_with_queue.py → Queue communication

# ------------------------------------------------------------
# EXECUTION METHOD
# ------------------------------------------------------------

# Run any file using:
# python filename.py

# Example:
# python Event.py

# ------------------------------------------------------------
# ACHIEVEMENTS
# ------------------------------------------------------------

# - Ability to design multithreaded programs
# - Understanding synchronization challenges
# - Efficient handling of shared resources
# - Selection of appropriate synchronization tools

# ------------------------------------------------------------
# KEY CONSIDERATIONS
# ------------------------------------------------------------

# - Shared data must be handled carefully
# - Lack of synchronization causes inconsistencies
# - Python uses Global Interpreter Lock (GIL)

# ------------------------------------------------------------
# SUMMARY
# ------------------------------------------------------------

# This chapter establishes a clear understanding of
# multithreading and synchronization, which are essential
# concepts for building reliable and high-performance systems.

# ============================================================s