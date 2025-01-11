
# Hibernate with Method

This repository demonstrates a basic setup and usage of Hibernate ORM for performing CRUD (Create, Read, Update, Delete) operations with Java methods. The project emphasizes how to manage database records using Hibernate's session and transaction handling capabilities.

## Overview

In this project, I implemented a simple Java application using Hibernate to interact with a relational database (MySQL). The main focus is to showcase how to perform basic database operations by calling specific methods for each operation, ensuring the system interacts effectively with the database.

## Key Features

- **Hibernate Setup**: Configured Hibernate ORM with a MySQL database connection.
- **CRUD Methods**: Implemented methods for creating, reading, updating, and deleting records in the database.
- **Session Management**: Used Hibernate sessions and transactions to ensure proper interaction with the database.
- **JDBC Integration**: Utilized JDBC for database connectivity.

## What I Did

### 1. Hibernate Configuration

I set up Hibernate ORM in this project by creating a `hibernate.cfg.xml` file that contains the configuration properties for connecting to the MySQL database. This configuration includes database credentials such as the username, password, and database URL.

### 2. Entity Creation

I defined Java classes as entities that correspond to database tables. Each entity has fields representing columns in the table, and I used Hibernate annotations to map the Java class to a database table.

```java
@Entity
@Table(name = "example_table")
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    // Getter and Setter methods...
}
```

### 3. Implemented CRUD Methods

I created a utility class for performing CRUD operations using Hibernate. The methods included in this class perform the following actions:

- **Create**: Adds a new entity to the database using the `session.save()` method.
- **Read**: Retrieves an entity based on its primary key using `session.get()` or `session.load()`.
- **Update**: Updates an existing entity using `session.update()`.
- **Delete**: Deletes an entity from the database using `session.delete()`.

Example of the `Save` method:

```java
public void save(ExampleEntity entity) {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    session.save(entity);
    transaction.commit();
    session.close();
}
```

### 4. Transaction Management

I ensured that database transactions are properly managed by using Hibernate’s `Transaction` API. Each method involving data manipulation (such as save, update, delete) is wrapped in a transaction to ensure consistency.

### 5. Session Factory

I set up a Hibernate `SessionFactory` which is used to open `Session` objects. The `Session` objects represent the connection to the database, and I used them to perform all operations like saving, retrieving, updating, and deleting entities.

```java
SessionFactory sessionFactory = new Configuration()
    .configure("hibernate.cfg.xml")
    .addAnnotatedClass(ExampleEntity.class)
    .buildSessionFactory();
```

### 6. Database Configuration

I made sure to configure the correct database connection properties in `hibernate.cfg.xml`. This includes the connection URL, username, and password for connecting to MySQL (or another relational database).

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/my_database</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">password</property>
```

---

