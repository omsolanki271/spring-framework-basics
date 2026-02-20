# Spring Framework – Stereotype Annotation (@Component)

## 📌 Overview
Demonstrates how to create and manage Spring beans using **Stereotype Annotations** instead of `<bean>` configuration.

Key features:
- `@Component`
- `@Value`
- `@Scope`
- `<context:component-scan>`
- `util:list`
- Prototype scope

---

## 📂 Project Structure
```
com.springcore.stereotype
│
├── Student.java
├── Teacher.java
├── Test.java
└── stereo_config.xml
```

---

## 1️⃣ XML Configuration (`stereo_config.xml`)
```xml
<context:component-scan base-package="com.springcore.stereotype"/>

<util:list list-class="java.util.ArrayList" id="add">
    <value>Dwarka</value>
    <value>Rajkot</value>
    <value>Div</value>
    <value>Goa</value>
</util:list>

<bean class="com.springcore.stereotype.Teacher"
      name="teacher"
      scope="prototype"/>
```

---

## 2️⃣ Student Class
```java
@Component("obj")
@Scope("prototype")
public class Student {
    @Value("Om Solanki")
    private String sname;

    @Value("Bhanvad")
    private String city;

    @Value("#{add}")
    private List<String> address;
}
```

**Key Points**
- `@Component("obj")` → Bean name = `obj`  
- `@Scope("prototype")` → New object each time  
- `@Value("#{add}")` → Injects `util:list`  

---

## 3️⃣ Teacher Class
```java
public class Teacher {
    // Bean defined in XML with prototype scope
}
```

---

## 4️⃣ Test Class
```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");

Student stud = context.getBean("obj", Student.class);
System.out.println(stud);
System.out.println(stud.getAddress());

// Prototype scope check
Student stud2 = context.getBean("obj", Student.class);
System.out.println(stud.hashCode());
System.out.println(stud2.hashCode());

Teacher t = context.getBean("teacher", Teacher.class);
Teacher t1 = context.getBean("teacher", Teacher.class);
System.out.println(t.hashCode());
System.out.println(t1.hashCode());
```

---

## 🚀 Output
```
Student [sname=Om Solanki, city=Bhanvad]
[Dwarka, Rajkot, Div, Goa]
java.util.ArrayList

12345678
87654321
11223344
55667788
```

➡️ Different hash codes confirm **prototype scope**.

---

## 🎯 Key Concepts
- `@Component` → Auto bean creation  
- `@Value` → Injects values  
- `@Scope("prototype")` → New object per request  
- `util:list` → Collection injection from XML  
- Mix of **annotation + XML configuration**  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
