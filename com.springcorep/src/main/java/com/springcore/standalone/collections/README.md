# Spring Framework – Standalone Collections

## 📌 Overview
Demonstrates **Standalone Collection Injection in Spring** using:
- `util:list`
- `util:map`
- `util:properties`

Standalone collections are created outside the bean and reused in multiple beans using `ref`.

---

## 📂 Key XML Snippets

### Enable util namespace
```xml
xmlns:util="http://www.springframework.org/schema/util"
http://www.springframework.org/schema/util
http://www.springframework.org/schema/util/spring-util.xsd
```

### Standalone List
```xml
<util:list list-class="java.util.LinkedList" id="e-item">
    <value>Laptop</value>
    <value>TV</value>
    <value>Mobile</value>
    <value>Tablet</value>
</util:list>
```

### Standalone Map
```xml
<util:map map-class="java.util.HashMap" id="e-item-price">
    <entry key="Laptop" value="60000"/>
    <entry key="TV" value="15000"/>
    <entry key="Mobile" value="20000"/>
    <entry key="Tablet" value="26000"/>
</util:map>
```

### Standalone Properties
```xml
<util:properties id="dbcon">
    <prop key="driver">com.mysql.jdbc.driver</prop>
    <prop key="username">OM SOLANKI</prop>
    <prop key="password">123</prop>
    <prop key="url">mysql:jdbc://localhost:3306/database</prop>
</util:properties>
```

### Injecting into Bean
```xml
<bean class="com.springcore.standalone.collections.Product" name="pitem">
    <property name="item" ref="e-item"/>
    <property name="price" ref="e-item-price"/>
    <property name="properties" ref="dbcon"/>
</bean>
```

---

## 🎯 Key Concepts
- Standalone collections using `util` namespace  
- Reusable collection beans  
- Explicit collection implementation (`LinkedList`, `HashMap`, `Properties`)  
- Injection using `ref` attribute  
- Difference between local vs standalone collections  

---

## 🚀 How to Run
1. Configure Spring dependencies in Maven.  
2. Place `alone_config.xml` in `resources`.  
3. Run the `Test` class.  
4. Console output will show:
   - List → `LinkedList`  
   - Map → `HashMap`  
   - Properties → `java.util.Properties`  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
