# Reference Type Injection in Spring Framework

## 📌 Overview
This module demonstrates how **Spring Framework** performs Reference Type Injection using Setter-Based Dependency Injection in XML configuration.  
Reference Injection is crucial in real-world applications because one object often depends on another object.  
The Spring container manages and injects these object dependencies automatically.

---

## 🎯 What This Project Demonstrates
- How one class depends on another class  
- How Spring injects object references  
- How Dependency Injection reduces tight coupling  
- Different ways to inject reference types in XML  
- How Spring container manages dependent objects  

---

## 🧠 What is Reference Type Injection?
Reference Injection occurs when one class contains an object of another class as a property.

**Concept Example:**
- Class A depends on Class B  
- A cannot work without B  
- Spring injects object of B into A  

This is called **Dependency Injection using reference type.**

---

## 📂 Project Flow
1. Two separate classes are created.  
2. One class contains a reference variable of another class.  
3. Bean for dependent class is defined first.  
4. Bean for main class is defined next.  
5. Reference of dependent bean is injected in XML.  
6. ApplicationContext loads configuration file.  
7. Spring creates both objects.  
8. Setter methods are called automatically.  
9. Dependency is injected and ready to use.  

---

## 🚀 Reference Injection Methods
Spring provides three ways to inject reference types:

1. **Using `<ref>` element** – Standard and most common method.  
2. **Using `ref` attribute** – Short and cleaner syntax.  
3. **Using p-namespace with `-ref`** – Simplified and optimized configuration style.  

All three methods perform the same operation; only syntax differs.

---

## 🎯 Key Learning Outcomes
After completing this module, you will understand:
- What is Dependency Injection in real applications  
- Difference between value injection and reference injection  
- How Spring manages object dependencies  
- How IoC container controls object lifecycle  
- Why loose coupling is important in backend development  

---

## ⚖ Difference Between Value and Reference Injection
**Value Injection**  
- Injects primitive data (int, String, etc.)  

**Reference Injection**  
- Injects object dependencies  

---

## 🎓 Learning Purpose
Reference Injection is widely used in real-world enterprise applications.  
Understanding this concept is essential before moving to **Spring MVC, Spring Boot, and advanced frameworks.**  
It is also one of the most frequently asked **interview topics in Spring.**

