# 🌱 Spring Framework Basics

A Maven-based **Spring Core** project demonstrating fundamental concepts of the **Spring IoC Container** and **Dependency Injection (DI)** using XML configuration.

This project is built to strengthen **core backend fundamentals** before moving to advanced technologies like **Spring MVC** and **Spring Boot**.

---

## 📌 Project Overview
This project demonstrates the core features of the **Spring Framework**, focusing on how the **Spring IoC Container** manages object creation and dependencies.

This project covers the core features of the **Spring Framework**, including:

* **Inversion of Control (IoC)**
* **Dependency Injection (DI)**
* **Bean Lifecycle Management**
* **Autowiring**
* **Spring Expression Language (SpEL)**
* **Java-based Configuration**
* **Coupling Concepts (Tight vs Loose Coupling)**

It is designed as a **hands-on practice project** to understand how **Spring manages object creation, dependency resolution, and bean lifecycle internally**.

---

## 🧠 Concepts Implemented

### 🔹 Core Design Principles

* **Tight Coupling vs Loose Coupling**
* Understanding why **Loose Coupling is important in Spring**
* Interface-based design to reduce dependency between classes

### 🔹 Dependency Injection

* **Setter Injection**
* **Constructor Injection**
* **Reference Injection (Bean-to-Bean Dependency)**

### 🔹 Collection Injection

* **List Injection**
* **Set Injection**
* **Map Injection**
* **Properties Injection**

### 🔹 Autowiring

* **XML-based Autowiring**
* **Annotation-based Autowiring**

### 🔹 Additional Spring Features

* **Bean Lifecycle Methods**
* **Standalone Collections**
* **Stereotype Annotations**
* **Java Configuration** (`@Configuration`, `@Bean`)
* **Spring Expression Language (SpEL)**

---

## 📂 Project Structure

This project follows the standard **Maven directory structure**:

```
com.springcorep
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.springcore
│   │   │       ├── coupling
│   │   │       │   ├── tight
│   │   │       │   └── loose
│   │   │       ├── setter_inj
│   │   │       ├── constructor_inj
│   │   │       ├── collections
│   │   │       ├── auto
│   │   │       ├── lifecycle
│   │   │       ├── ref
│   │   │       ├── spel
│   │   │       ├── javaconfig
│   │   │       └── stereotype
│   │   └── resources
│   │       └── config.xml
│   └── test
├── pom.xml
└── README.md
```
---

## ⚙️ Technologies Used

* **Java (JDK 8+)**
* **Spring Core Framework**
* **Maven**
* **XML Configuration**
* **IntelliJ IDEA / Eclipse IDE**

---

## 🚀 How to Run the Project

1. Clone the repository

```
git clone https://github.com/omsolanki271/spring-framework-basics.git
```

2. Open the project in **IntelliJ IDEA / Eclipse**

3. Ensure **Maven dependencies are downloaded**

4. Run any **Test or Main class** inside the modules.

5. Observe how **Spring Container manages object creation and dependency injection**.

---

## 🎯 Learning Objectives

This project helps in understanding:

* How **Spring IoC Container works**
* How **objects are created and managed by Spring**
* How **Dependency Injection works internally**
* How **interfaces promote loose coupling**
* Real-world structure of a **Maven-based Spring project**

---

## 📈 Why This Project Matters

Understanding **Spring Core** deeply is essential before learning:

* **Spring MVC**
* **Spring Boot**
* **Spring Data JPA**
* **Microservices Architecture**

This project builds that **strong foundation**.

---

## 👨‍💻 Author

**Om Solanki**
MCA Student | Java Backend Developer

