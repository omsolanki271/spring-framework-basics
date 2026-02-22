# 🌱 Spring Framework Basics

A Maven-based **Spring Core** project demonstrating fundamental concepts of the **Spring IoC Container** and **Dependency Injection (DI)** using XML configuration.

This project is built to strengthen core backend fundamentals before moving to advanced technologies like **Spring MVC** and **Spring Boot**.

---

## 📌 Project Overview

This project covers the core features of the Spring Framework including:

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Bean Lifecycle Management
- Autowiring
- Spring Expression Language (SpEL)
- Java-based Configuration

It is designed as a hands-on practice project to understand how Spring manages object creation and dependency resolution internally.

---

## 🧠 Concepts Implemented

### 🔹 Dependency Injection
- Setter Injection
- Constructor Injection
- Reference Injection (Bean-to-Bean Dependency)

### 🔹 Collection Injection
- List
- Set
- Map
- Properties

### 🔹 Autowiring
- XML-based Autowiring
- Annotation-based Autowiring

### 🔹 Additional Spring Features
- Bean Lifecycle Methods
- Standalone Collections
- Stereotype Annotations
- Java Configuration (@Configuration, @Bean)
- Spring Expression Language (SpEL)

---

## 📂 Project Structure

This project follows standard **Maven directory structure**:

```

com.springcorep
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.springcore
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

- Java (JDK 8+)
- Spring Core Framework
- Maven
- XML Configuration
- Eclipse IDE

---

## 🚀 How to Run the Project

1. Clone the repository
2. Open the project in Eclipse / IntelliJ
3. Ensure Maven dependencies are downloaded
4. Run the `App.java` OR `Test.java`file from any module
5. Observe dependency injection working via Spring container

---

## 🎯 Learning Objectives

This project helps in understanding:

- How Spring IoC container works internally
- How objects are created and managed by Spring
- How dependencies are injected using XML and annotations
- The difference between constructor and setter injection
- Real-world structure of a Maven-based Spring project

---

## 📈 Why This Project Matters

Understanding Spring Core deeply is essential before learning:

- Spring MVC
- Spring Boot
- Spring Data JPA
- Microservices Architecture

This project builds that foundation.

---

## 👨‍💻 Author

**Om Solanki**  
MCA Student | Java Backend Developer  
Passionate about building strong backend fundamentals with Java & Spring
