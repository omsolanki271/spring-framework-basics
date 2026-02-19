# Spring Framework – Stereotype Annotation (@Component)

## 📌 Overview
Demonstrates how to create Spring beans using **Stereotype Annotations** instead of `<bean>` tag.

Used:
- `@Component`
- `@Value`
- `<context:component-scan>`

---

## 1️⃣ XML Configuration
```xml
<context:component-scan base-package="com.springcore.stereotype"/>
```
👉 Scans package and auto-registers classes annotated with `@Component`.

---

## 2️⃣ Student Class
```java
@Component("obj")
public class Student {
    @Value("Om Solanki")
    private String sname;

    @Value("Bhanvad")
    private String city;
}
```
- `@Component("obj")` → Bean name = `obj`  
- `@Value` → Injects constant values directly (no `<property>` tag needed)

---

## 3️⃣ Getting Bean
```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");

Student stud = context.getBean("obj", Student.class);
System.out.println(stud);
```

---

## 🚀 Output
```
Student [sname=Om Solanki, city=Bhanvad]
```

---

## 🎯 Key Points
- `@Component` → Marks class as Spring bean  
- `component-scan` → Finds annotated classes automatically  
- `@Value` → Injects primitive/String values  
- Bean name defaults to class name (`student`) if not specified  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
