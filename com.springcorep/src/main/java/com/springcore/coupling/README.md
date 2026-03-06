# Spring Framework Basics

This repository contains **basic Spring Framework concepts implemented using simple Java examples**.
The goal of this project is to clearly understand important design principles used in Spring.

Currently, the repository demonstrates the concept of **Tight Coupling vs Loose Coupling**, which is the foundation for understanding **Dependency Injection and Inversion of Control in Spring**.

---

## Project Concept

Modern frameworks like **Spring** promote **Loose Coupling** between components.
This project shows the difference between:

* **Tight Coupling**
* **Loose Coupling**

using simple Java classes.

Understanding this concept is important before learning:

* Spring IoC Container
* Dependency Injection
* Spring Beans

---

## Project Structure

```
com.springcore.coupling
│
├── tight
│   ├── UserDatabase.java
│   ├── UserManager.java
│   └── TightCouplingTest.java
│
└── loose
    ├── UserDataProvider.java
    ├── UserDatabaseProvider.java
    ├── WebServicesDataProvider.java
    ├── UserManager.java
    └── LooseCopulingTest.java
```

---

## Tight Coupling Example

In **tight coupling**, classes are directly dependent on each other.

Example:

```
UserManager → UserDatabase
```

Here the `UserManager` class directly creates an object of `UserDatabase`.

### Problem

If the data source changes (for example database → web service), the **UserManager class must also be modified**.

This makes the system:

* Hard to maintain
* Less flexible
* Difficult to extend

---

## Loose Coupling Example

In **loose coupling**, classes communicate using an **interface** instead of depending on concrete classes.

Example:

```
UserManager → UserDataProvider (Interface)
```

Different implementations can be provided:

* `UserDatabaseProvider`
* `WebServicesDataProvider`

Now the **UserManager class does not need to change** when a new provider is added.

This makes the system:

* Flexible
* Easy to maintain
* Easy to extend

---

## Key Learning

This example demonstrates the **core design principle used by Spring Framework**.

Spring uses:

* **Loose Coupling**
* **Dependency Injection**
* **Inversion of Control (IoC)**

to build scalable and maintainable applications.

---

## Author

Om Solanki
Java & Spring Learner
