package day48_Collections;

public class CollectionsIntro {

    /*
    COLLECTIONS
    - classes and interfaces that represent a group of objects as a single entity
    - grow in nature
    - increase and decrease in size
    - hold non-primitive data types
    - standard data structure

    COLLECTION INTERFACE extends to 3 child interfaces.
    - List interface
        - ArrayList class
        - LinkedList class
        - Vector class
            -Stack
    - Queue interface
    - Set interface

    Collection interface is a root interface of a collection framework.

    Collection interface defines the most common methods that are applicable for any collection object
    size()
    add()
    addAll()
    remove()
    removeAll()
    removeIf()
    retainAll()
    isEmpty()
    contains()
    containsAll()
    clear()
    toArray()

    1. LIST INTERFACE
    - child interface of collection
    - duplicates are allowed
    - insertion order is preserved
    - has index numbers
    - uses get() method to retrieve elements

    1.1. ARRAY LIST CLASS
    - implements the List interface
    - internally uses array
    - faster retrieval of elements
    - import java.util.ArrayList;

    1.2. LINKED LIST CLASS
    - implements the list interface
    - internally uses doubly linked list
        - each element points to the next element
    - faster insertion and deletion of elements
    - import java.util.LinkedList;

    1.3. VECTOR CLASS
    - implements the list interface
    - internally uses array
    - is synchronized (thread safe)

    1.3.1. STACK CLASS
     - a child of vector class
     - synchronized (thread-safe)
     - last in, first out order
        - pop() method

    PROCESS
    - an instance of a program running on a computer
    - programs that are scheduled for execution in the CPU
    - Activity Monitor (My Processes)

    THREAD
    - a subset of a process
    - a sequence of execution within a process
    - every single process has at least one thread
    - shares all the resources of process

    MULTI-THREADING
    - two of more threads are being executed within the process
        - 471 processes 2,284 threads

    SYNCHRONIZED (THREAD-SAFETY)
    - process of controlling the access of multiple threads to any shared resource
    - only one thread to access the shared resource at a time (Thread-safety)
        - When thread 1 is executed, resource is locked by thread 1. Thread 2, 3, 4 are waiting in lock.
    - Advantage: thread-safe
    - Disadvantage: slower

    MULTI-TASKING
    - two or more processes are running

    CONCURRENT EXECUTION
        100 * 5 -> 5000 seconds -> 1000 threads
        chrome browser (process) -> 1000 threads

    PARALLEL EXECUTION
    - faster than concurrent execution
        200 * 5 = 1000 seconds
        Chrome browser1 (process) -> 200 threads
        Chrome browser2 (process) -> 200 threads
        Chrome browser3 (process) -> 200 threads
        Chrome browser4 (process) -> 200 threads
        Chrome browser5 (process) -> 200 threads

    2. SET INTERFACE
    - child interface of collection
    - does not allow duplicates
    - does not have index numbers
    - insertion order is not preserved
    - import java.util.Set

    2.1. HASHSET CLASS
    - implements the set interface
    - the fastest
    - maintains the random order of elements
    - accepts null values
    - import java.util.HashSet;

    2.1.1. LINKED HASH SET CLASS
    - child class of HashSet
    - maintains the insertion order
    - accepts null values
    - import java.util.LinkedList;

    2.2. SORTED SET INTERFACE

    2.2.1. TREE SET CLASS
    - implements the SortedSet interface
    - maintains the sorted (ascending) order
    - does not accept null keyword (value)
    - import java.util.TreeSet

    3. QUEUE INTERFACE

     */
}
