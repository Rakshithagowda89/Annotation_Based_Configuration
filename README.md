# Spring Boot Component-Based Configuration

## 📌 Project Overview

This project demonstrates **component-based configuration in Spring Boot** using the `@SpringBootApplication` and `@Component` annotations.

The application creates a Spring-managed `Home` object using Spring's IoC (Inversion of Control) container. It retrieves the object from the application context and calls the `connect()` method to display a success message.

## 🎯 Objectives

- Understand component-based configuration in Spring Boot.
- Learn how Spring creates and manages objects (beans).
- Understand the purpose of `@SpringBootApplication`.
- Learn how `@Component` registers a class as a Spring bean.
- Retrieve a bean using `getBean()`.
- Understand constructor execution during bean creation.

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Core
- Maven
- Eclipse / Spring Tool Suite (STS)

## 📂 Project Structure

```text
ComponentBasedApplication
│
├── src/main/java
│   └── com/example/demo
│       ├── ComponentBasedApplication.java
│       └── Home.java
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
└── README.md
```

## 📖 Annotations Used

### 1. `@SpringBootApplication`

This annotation is used on the main application class.

It combines three important annotations:

- **`@Configuration`** – Allows the class to provide configuration to the Spring container.
- **`@EnableAutoConfiguration`** – Enables Spring Boot to configure the application automatically based on the dependencies available.
- **`@ComponentScan`** – Scans the application package and its subpackages for Spring components.

### 2. `@Component`

The `@Component` annotation is used on the `Home` class.

It tells Spring to detect the class during component scanning and register it as a Spring bean. Spring creates and manages the object through its IoC container.

## ⚙️ How the Application Works

1. The `main()` method starts the Spring Boot application.
2. Spring creates the application context.
3. Component scanning detects the `Home` class because it has the `@Component` annotation.
4. Spring creates the `Home` object and executes its constructor, printing `Object Created`.
5. `context.getBean(Home.class)` retrieves the Spring-managed `Home` bean.
6. The `connect()` method is called.
7. The application prints `Internet connected Sucessfully`.

## ▶️ How to Run the Project

1. Open Eclipse or Spring Tool Suite (STS).
2. Import or open the Spring Boot project.
3. Ensure that the required Spring Boot dependencies are available in `pom.xml`.
4. Open `ComponentBasedApplication.java`.
5. Right-click the file.
6. Select **Run As → Spring Boot App** (or **Java Application**).
7. Check the console for the output.

## 💻 Expected Output

```text
Object Created
Internet connected Sucessfully
```

Spring Boot may display additional startup logs before these messages.

## 🧠 Key Concepts Learned

- Spring IoC container
- Dependency management and bean creation
- Component scanning
- Spring Boot auto-configuration
- `@SpringBootApplication`
- `@Component`
- `ConfigurableApplicationContext`
- Retrieving beans using `getBean()`

## 📝 Conclusion

This project demonstrates how Spring Boot simplifies object creation and management using component-based configuration. By using `@Component` and `@SpringBootApplication`, the `Home` class becomes a Spring-managed bean, which can be retrieved from the application context and used without manually creating its object with the `new` keyword.
