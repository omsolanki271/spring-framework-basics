
Here’s a clean, **README.md** version of your *Spring Framework – Constructor Injection* project with only usable, structured points:

```markdown
# Spring Framework – Constructor Injection

## 📌 Overview
This module demonstrates **Constructor Injection** in Spring Framework using XML configuration.  
Constructor Injection means dependencies are injected through the constructor instead of setter methods.

---

## 1️⃣ Basic Constructor Injection

### 🔹 Certi Class
```java
public Certi(String name)
```

### 🔹 XML Configuration
```xml
<bean class="com.springcore.constructor_inj.Certi" name="cer">
    <constructor-arg value="Java Developer" />
</bean>
```

Spring calls the constructor and injects the value `"Java Developer"`.

---

## 2️⃣ Constructor Injection with Multiple Parameters

### 🔹 Person Class
Constructor:
```java
public Person(String name, int personid, Certi obj, List<String> phones)
```

### 🔹 XML Configuration
```xml
<bean class="com.springcore.constructor_inj.Person" name="cinj">
    <constructor-arg value="Solanki Om" />
    <constructor-arg value="22" type="int" />
    <constructor-arg ref="cer" />
    <constructor-arg>
        <list>
            <value>1111111111</value>
            <value>2222222222</value>
            <value>3333333333</value>
        </list>
    </constructor-arg>
</bean>
```

### 🔹 Important Points
- `value` → for primitive and String  
- `ref` → for object reference  
- `<list>` → for collection injection  
- `type="int"` → specifies exact constructor parameter type  

---

## 3️⃣ Constructor Ambiguity Problem

### 🔹 Addition Class
Multiple constructors:
```java
Addition(double a, double b)
Addition(int a, int b)
Addition(String a, String b)
```

### 🔹 Problem
```xml
<constructor-arg value="14"/>
<constructor-arg value="11"/>
```
Spring may get confused which constructor to call.

### ✅ Best Practice to Solve Ambiguity
Use **type** or **index**.

**Using type:**
```xml
<constructor-arg value="14" type="int"/>
<constructor-arg value="11" type="int"/>
```

**Using index:**
```xml
<constructor-arg index="0" value="14"/>
<constructor-arg index="1" value="11"/>
```

This clearly tells Spring which constructor to use.

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
```