# Collection Injection in Spring Framework

## 📌 Overview
This module demonstrates how **Spring Framework** performs Collection Injection using Setter-Based Dependency Injection in XML configuration.  
It shows how collection types like **List, Set, Map, and Properties** are injected into a Java class and managed by the Spring IoC container.

---

## 🎯 What This Project Demonstrates
- How Spring injects collection types using XML  
- How **List, Set, Map, and Properties** are configured  
- How multiple values can be injected into a single bean  
- How Spring automatically calls setter methods  
- How ApplicationContext loads and manages collection dependencies  

---

## 🧠 Collection Types Used
Four collection types are demonstrated:

### List
- Ordered collection  
- Allows duplicate values  

### Set
- Unordered collection  
- Does not allow duplicate values  

### Map
- Stores data in key–value format  
- Keys must be unique  

### Properties
- Special type of Map  
- Both key and value are Strings  

---

## 📂 Project Flow
1. Separate package is created for collection example.  
2. Class is defined with collection properties.  
3. Getters and setters are generated for Setter Injection.  
4. XML configuration file is created.  
5. Collection values are defined inside `<property>` tag.  
6. ApplicationContext loads configuration file.  
7. Bean is retrieved using `getBean()`.  
8. Spring injects collection values automatically.  

---

## 🚀 Key Learning Outcomes
After completing this module, you will understand:
- How Collection Injection works in Spring  
- Difference between **List** and **Set** behavior  
- How **Map** and **Properties** are configured  
- Role of ApplicationContext in dependency injection  
- How Spring IoC container manages object creation  

---

## 🎓 Learning Purpose
This project strengthens **Spring Core fundamentals** and improves understanding of Dependency Injection concepts.  
Collection Injection is an important topic for backend development and frequently asked in interviews.
