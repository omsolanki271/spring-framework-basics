# Spring Framework – Annotation Based Configuration (Without XML)

## 📌 Overview
This module demonstrates how to completely remove XML configuration and use **Java-based configuration** with annotations in Spring.

Key annotations and classes:
- `@Configuration`
- `@ComponentScan`
- `@Bean`
- `AnnotationConfigApplicationContext`

---

## 🎯 Why Java-Based Configuration?
### XML Approach
- Requires `applicationContext.xml`
- Beans defined using `<bean>`
- Component scanning via `<context:component-scan>`
- Loaded using `ClassPathXmlApplicationContext`

### Java Approach
- No XML file required
- Configuration handled inside Java class
- Cleaner and more professional

---

## 1️⃣ Creating Configuration Class
```java
@Configuration
@ComponentScan("com.springcore.demo")
public class JavaConfig {
}
```
- `@Configuration` → Marks class as configuration
- `@ComponentScan` → Replaces `<context:component-scan>`

---

## 2️⃣ Loading Context
```java
ApplicationContext context =
    new AnnotationConfigApplicationContext(JavaConfig.class);
```
- Replaces `ClassPathXmlApplicationContext`
- Loads Spring container using Java configuration

---

## 3️⃣ Defining Beans with @Bean
```java
@Bean
public Student getStudent() {
    return new Student();
}
```
- Method return type = Bean type  
- Method name = Bean ID (default)  
- Returned object = Bean instance  

### Custom Bean Names
```java
@Bean(name = {"student","std","learner"})
public Student createStudent() {
    return new Student();
}
```
Bean accessible using any of the names: `student`, `std`, `learner`.

---

## 4️⃣ Example with Dependency Injection

### Samosa Class
```java
public class Samosa {
    public void display() {
        System.out.println("Samosa price is 10");
    }
}
```

### Student Class
```java
public class Student {
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        samosa.display();
        System.out.println("Student is studying");
    }
}
```

### Configuration Class
```java
@Configuration
public class JavaConfig {

    @Bean
    public Samosa samosa() {
        return new Samosa();
    }

    @Bean
    public Student student() {
        return new Student(samosa());
    }
}
```

---

## 🚀 Output
```
Samosa price is 10
Student is studying
```

---

## 🔍 Difference Between XML and Java Config

| XML Configuration | Java Configuration |
|-------------------|--------------------|
| Uses XML file | Uses Java class |
| `<bean>` | `@Bean` |
| `<context:component-scan>` | `@ComponentScan` |
| Loaded with `ClassPathXmlApplicationContext` | Loaded with `AnnotationConfigApplicationContext` |

---

## 🎯 Interview Points
- **Which annotation marks configuration class?** → `@Configuration`  
- **What replaces `<bean>` tag?** → `@Bean`  
- **What replaces `<context:component-scan>`?** → `@ComponentScan`  
- **Which context class loads Java configuration?** → `AnnotationConfigApplicationContext`  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
