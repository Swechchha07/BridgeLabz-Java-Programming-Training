# BridgeLabz Java Programming Training

This repository contains my code, exercises, and projects completed during the **BridgeLabz Java Programming Training** program. The work is organized across multiple branches, each dedicated to a specific stage/topic of the training — covering everything from Java fundamentals to advanced concepts, data structures & algorithms, design patterns, and concurrency.

## Branch Overview

| Branch | Topic | Description |
|---|---|---|
| [`core_programming`](../../tree/core_programming) | Core Java Basics & Intermediate | Elementary programs, arrays, control flow, and string handling exercises |
| [`object_oriented_programming`](../../tree/object_oriented_programming) | OOP Concepts | Classes, objects, encapsulation and a Library Management System exercise |
| [`advance_java_programming`](../../tree/advance_java_programming) | Advanced Java | Annotations, exception handling, generics, I/O streams, regex, and JUnit testing |
| [`io_programming_and_multithreading`](../../tree/io_programming_and_multithreading) | File I/O, Java 8 & Multithreading | CSV file handling, lambdas & streams, multithreading, and Hotel Reservation / Producer-Consumer projects |
| [`data_structure_algorithm`](../../tree/data_structure_algorithm) | Data Structures & Algorithms | Sorting, searching, stacks, queues, linked lists, and hash maps |
| [`design_modeling`](../../tree/design_modeling) | Design Patterns | Singleton, Factory, Decorator, Observer patterns with a Digital Library Management mini-project |
| `main` | Default | Project overview (this README) |

## Repository Structure

### `core_programming` branch
```
CoreProgrammingBasics/
├── Elementary_Programming/
│   ├── Level1/   # Basic programs (area, conversions, discounts, calculator, etc.)
│   └── Level2/   # Operations on int/double types
└── MakerPlan/    # Factorial, Prime number programs

CoreProgrammingIntermediate/
├── Arrays/
│   ├── Level1/   # Tables, sums, even/odd, FizzBuzz with arrays
│   └── Level2/   # BMI, bonus, frequency, largest/second largest etc.
├── ControlFlow/
│   ├── Level1/   # Loops, factorial, countdowns, sums
│   └── Level2/   # FizzBuzz, multiplication tables, factors, power
└── Strings/
    ├── Level1/   # String basics, exceptions, case conversions, substrings
    └── Level2/   # String length, splitting text
```

### `object_oriented_programming` branch
```
OopsBasics/
├── Ball.java                     # Class & object basics
├── Circle.java                   # Encapsulation / geometry
├── Line.java                     # Object modeling
├── Student.java                  # Class with fields & methods
├── Employee.java                 # Class with fields & methods
└── LibraryManagementSystem.java  # OOP mini-project
```

### `advance_java_programming` branch
```
AdvanceJavaProgramming/
├── Annotations/             # Built-in & custom annotations
├── ExceptionHandling/        # Custom exceptions (e.g., InsufficientBalance, InvalidAge)
├── Java Collections&Streams/
│   ├── Generics/              # Generic classes, methods, wildcards
│   ├── IO Streams/             # File, Byte, Buffered streams & serialization
│   └── MakerPlan/              # Address Book project
├── Junit/
│   ├── ArithmeticTestProject/  # Maven project with JUnit tests
│   └── StringUtils.java/       # Maven project with JUnit tests
└── Regex/                     # Email/phone validation, word search, password validation
```

### `io_programming_and_multithreading` branch
```
IOProgramming/             # CSV read/write, parse, validate, append, buffered I/O
Java8Features/
├── Lambda/                # Lambda expression examples
└── Streams/               # Stream operations (filter, map, distinct, limit, skip, count)
Multithreading/            # Thread creation, Runnable, thread states, virtual threads
ProblemSheet/              # Daemon threads, parallel printers, traffic signal simulation
HotelReservation/          # Maven project: CSV/JSON I/O + threads (payments, notifications)
MultithreadingProject/     # Maven project: Producer-Consumer & thread-safe Singleton
```

### `data_structure_algorithm` branch
```
DataStructures&Algorithms/
├── Algorithms/
│   ├── Sorting/      # Bubble, Insertion, Merge, Quick sort
│   └── Searching/    # Linear, Binary search
├── DataStructures/
│   ├── Stack/        # Array & Linked List implementations
│   ├── Queue/        # Array & Linked List implementations
│   ├── LinkedList/   # Singly & Doubly Linked List
│   └── HashMap/      # Basic HashMap implementation
└── MakerPlan/        # Balanced Parenthesis, Employee Records
```

### `design_modeling` branch
```
DesignPatterns/
├── Singleton/                # Eager & standard Singleton pattern
└── DigitalLibraryManagment/   # Maven project demonstrating:
    ├── Factory Pattern        # Subscription & UI factories
    ├── Decorator Pattern       # Reader view enhancements
    └── Observer Pattern        # Subscriber notifications
```

## Topics Covered

- **Java Fundamentals**: Variables, data types, operators, control flow (if-else, loops, switch)
- **Arrays & Strings**: Manipulation, searching, and common interview-style problems
- **Object-Oriented Programming**: Classes, objects, encapsulation, inheritance, polymorphism
- **Exception Handling**: Built-in and custom exceptions
- **Generics & Collections**: Generic classes/methods, wildcards, Collections framework
- **I/O Streams & File Handling**: File handling, byte/character streams, serialization, CSV & JSON processing
- **Java 8 Features**: Lambda expressions and the Stream API
- **Multithreading & Concurrency**: Thread lifecycle, Runnable, virtual threads, daemon threads, Producer-Consumer, thread-safe Singleton
- **Regular Expressions**: Pattern matching, validation (email, phone, password)
- **Unit Testing**: JUnit test cases for Maven-based projects
- **Data Structures & Algorithms**: Sorting, searching, stacks, queues, linked lists, hash maps
- **Design Patterns**: Singleton, Factory, Decorator, Observer

## Getting Started

### Prerequisites
- JDK 8 or above (JDK 21+ recommended for virtual threads in the multithreading branch)
- [Maven](https://maven.apache.org/) (for projects with `pom.xml`)
- An IDE such as IntelliJ IDEA.

### Running a Standalone Program
```bash
# Switch to the relevant branch
git checkout core_programming

# Compile and run a Java file
javac path/to/File.java
java FileName
```

### Running a Maven Project (e.g., JUnit / Design Pattern / Multithreading projects)
```bash
cd path/to/project
mvn clean test     # run unit tests
mvn clean compile  # compile the project
```

## Switching Branches

Each topic lives in its own branch. To explore a specific section, checkout the corresponding branch:
```bash
git clone https://github.com/Swechchha07/BridgeLabz-Java-Programming-Training.git
cd BridgeLabz-Java-Programming-Training
git checkout <branch-name>
```

## About BridgeLabz

[BridgeLabz](https://www.bridgelabz.com/) is a fellowship program that focuses on building strong fundamentals in programming through hands-on, project-based learning.

## Author

**Swechchha07** — Java Programming Training Fellow
