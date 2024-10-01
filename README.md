# DesignPatterns

This repository demonstrates common design patterns implemented in Java. The goal is to provide easy-to-understand examples of how these patterns can be used in software development. Currently, the repository includes implementations of the **Singleton** and **Factory Method** patterns, with more patterns to be added in the future.

## Design Patterns Included

### 1. Singleton Pattern

The **Singleton Pattern** ensures that a class has only one instance and provides a global point of access to it. This pattern is useful when exactly one object is needed to coordinate actions across a system.

**Key Features:**
- Private constructor to prevent external instantiation.
- Static method to get the instance of the class.

### 2. Factory Method Pattern

The **Factory Method Pattern** defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by reducing the need for clients to instantiate objects directly.

**Key Features:**
- A superclass or interface defining a method to create an object.
- Subclasses or concrete classes that implement the creation logic.
