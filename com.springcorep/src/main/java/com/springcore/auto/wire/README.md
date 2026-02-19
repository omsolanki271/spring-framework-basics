# Spring Framework – Autowiring (XML and Annotation Based)

## 📌 Project Overview
Demonstrates **Autowiring in Spring Framework** using:
- XML Configuration
- Annotation-Based Configuration  

Autowiring automatically injects dependent objects (beans) into Spring-managed classes.

---

## 1️⃣ Autowiring Using Annotation

### 📂 Package
`com.springcore.auto.wire.annotation`

### 🔹 Classes
- **Address** → `street`, `city`, getters/setters, constructor, `toString()`  
- **Emp** → Contains `Address` object, uses:
  ```java
  @Autowired
  @Qualifier("address2")
  private Address address;
  ```

### 🔹 XML Configuration
File: `auto_config.xml`
```xml
<context:annotation-config />
<bean class="com.springcore.auto.wire.annotation.Address" name="address1"/>
<bean class="com.springcore.auto.wire.annotation.Address" name="address2"/>
```

### 🔹 Output
```java
Emp e1 = context.getBean("Emp1", Emp.class);
System.out.println(e1);
```
Spring injects **address2** into `Emp`.

---

## 2️⃣ Autowiring Using XML

### 📂 Package
`com.springcore.auto.wire.xml`

### 🔹 Classes
- **Address** → Same as annotation version  
- **Emp** → Contains `Address` with setter:
  ```java
  public void setAddress(Address address) {
      System.out.println("Setter injection called...");
      this.address = address;
  }
  ```

### 🔹 XML Configuration
```xml
<bean class="com.springcore.auto.wire.xml.Address" name="address"/>
<bean class="com.springcore.auto.wire.xml.Emp" name="Emp1" autowire="byType"/>
```

Spring checks `Emp` has `Address` type → finds bean → injects automatically.

---

## 🔍 Difference Between XML and Annotation Autowiring

| XML Based | Annotation Based |
|-----------|------------------|
| Configured in XML file | Configured in Java class |
| Uses `autowire` attribute | Uses `@Autowired` |
| No Java annotations | Requires annotation processing |
| Less flexible | Modern and preferred |

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
