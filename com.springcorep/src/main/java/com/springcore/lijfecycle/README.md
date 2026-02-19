# Spring Framework – Bean Lifecycle Management

## 📌 Overview
This project demonstrates different ways to manage **Spring Bean Lifecycle** using:
- XML configuration (`init-method`, `destroy-method`)
- Interfaces (`InitializingBean`, `DisposableBean`)
- Annotations (`@PostConstruct`, `@PreDestroy`)

It shows how initialization and destruction callbacks are handled by the **Spring IoC container**.

---

## 1️⃣ Bean Lifecycle Using XML Methods

### 🔹 Class: Product
```java
public void init() {
    System.out.println("Inside init method call....");
}

public void destroy() {
    System.out.println("Inside destroy method call...");
}
```

### 🔹 XML Configuration
```xml
<bean class="com.springcore.lijfecycle.Product" name="p1"
      init-method="init" destroy-method="destroy">
    <property name="price" value="200" />
</bean>
```

Spring calls `init()` after bean creation and `destroy()` before bean destruction.

---

## 2️⃣ Bean Lifecycle Using Interfaces

### 🔹 Class: Product2
Implements `InitializingBean` and `DisposableBean`:
```java
@Override
public void afterPropertiesSet() throws Exception {
    System.out.println("init method call using Interface....");
}

@Override
public void destroy() throws Exception {
    System.out.println("destroy method call using Interface....");
}
```

### 🔹 XML Configuration
```xml
<bean class="com.springcore.lijfecycle.Product2" name="p2"
      init-method="afterPropertiesSet" destroy-method="destroy">
    <property name="price" value="333" />
</bean>
```

Spring automatically calls `afterPropertiesSet()` and `destroy()`.

---

## 3️⃣ Bean Lifecycle Using Annotations

### 🔹 Class: Product3
```java
@PostConstruct
public void start() {
    System.out.println("init method call for @annotation");
}

@PreDestroy
public void end() {
    System.out.println("destroy method call for @annotation");
}
```

### 🔹 XML Configuration
```xml
<context:annotation-config />

<bean class="com.springcore.lijfecycle.Product3" name="p3"
      init-method="start" destroy-method="end">
    <property name="price" value="553" />
</bean>
```

Spring calls `start()` after bean creation and `end()` before bean destruction.

---

## 🚀 Key Learning Outcomes
- How to define lifecycle methods in **XML configuration**  
- How to use **Spring lifecycle interfaces** (`InitializingBean`, `DisposableBean`)  
- How to use **annotations** (`@PostConstruct`, `@PreDestroy`)  
- How Spring IoC container manages **bean initialization and destruction**  

---

## 🛠 Technologies Used
- Java  
- Spring Core  
- XML Configuration  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
```