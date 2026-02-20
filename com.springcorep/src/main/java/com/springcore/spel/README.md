# 🌱 Spring Framework – Spring Expression Language (SpEL)

## 📌 Overview
This project demonstrates the use of **Spring Expression Language (SpEL)** to inject values into Spring beans using the `@Value` annotation.

SpEL allows you to:
- Perform arithmetic operations
- Call static methods
- Access constants
- Create objects
- Evaluate boolean expressions

The project is implemented using **:contentReference[oaicite:0]{index=0}** with annotation-based configuration.

---

## 🛠️ Technologies Used
- Java
- Spring Core
- Spring Expression Language (SpEL)
- XML Configuration
- Eclipse / IntelliJ IDEA

---

## 📂 Package Structure
```

com.springcore.spel
│
├── Solution.java
├── Test.java
└── spelconfig.xml

````

---

## 1️⃣ XML Configuration (`spelconfig.xml`)
```xml
<context:component-scan base-package="com.springcore.spel"/>
````

### 🔹 Explanation

* `component-scan` → Automatically detects classes annotated with `@Component`
* No `<bean>` tag is required for the `Solution` class

---

## 2️⃣ Solution Class (Using SpEL)

```java
@Component
public class Solution {

    @Value("#{3+4}")
    private int x;

    @Value("#{2*4}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double e;

    @Value("#{new java.lang.String('om')}")
    private String name;

    @Value("#{('user'=='user')}")
    private boolean isActive;
}
```

---

## 3️⃣ SpEL Expressions Used

| Expression            | Description               |
| --------------------- | ------------------------- |
| `#{3+4}`              | Arithmetic addition       |
| `#{2*4}`              | Arithmetic multiplication |
| `#{T(Math).sqrt(25)}` | Calling static method     |
| `#{T(Math).PI}`       | Accessing static constant |
| `#{new String('om')}` | Object creation           |
| `#{('user'=='user')}` | Boolean comparison        |

---

## 4️⃣ Test Class

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext(
        "com/springcore/spel/spelconfig.xml");

Solution sol = context.getBean("solution", Solution.class);
System.out.println(sol);

// Manual SpEL parsing
SpelExpressionParser sp = new SpelExpressionParser();
Expression ex = sp.parseExpression("3+3");
System.out.println(ex.getValue());
```

---

## 🚀 Output

```
Solution [x=7, y=8, z=5.0, e=3.141592653589793, name=om, isActive=true]
6
```

---

## 🎯 Key Concepts Demonstrated

* `@Value` with SpEL expressions
* Arithmetic operations in SpEL
* Static method & constant access
* Object creation using SpEL
* Boolean expression evaluation
* `SpelExpressionParser` usage
* Annotation-based Spring configuration

---

## ✅ Learning Outcomes

* Strong understanding of Spring Expression Language
* Ability to inject dynamic values into beans
* Knowledge of advanced `@Value` annotation usage
* Clear difference between annotation-based and manual SpEL evaluation

---

## 👨‍💻 Author

**Om Solanki**
*MCA Student | Java Backend Learner*
