# 📘 Student Management System (Spring Boot)

A simple **Student Management System REST API** built using **Spring Boot**.  
This project demonstrates CRUD operations, RESTful API design, and database integration using Spring Data JPA.

---

## 🚀 Features

- Add new students  
- View all students  
- View a student by ID  
- Update student details  
- Delete students  
- Input validation  
- Global exception handling  

---

## 🛠️ Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA (Java Persistence API)  
- Hibernate (ORM – Object Relational Mapping)  
- MySQL  
- Maven  
- REST API  
- Postman (for testing)

---

## 📂 Project Structure
```pgsql

src/main/java/com/kavinda/sms
├── controller     → REST Controllers
├── service        → Business logic
├── repository     → Database access (JPA)
├── model          → Entity classes
├── exception      → Global exception handling
└── SmsApplication → Main application

```


---

## ⚙️ Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/warakacs50/Student-Management-API.git
```
2. Navigate to the project folder:
```bash
cd Student-Management-API
```

3. Run the application:
```bash
mvn spring-boot:run
```

4. App will start at:
```bash
http://localhost:8080

```
---

## 🔗 API Endpoints

| Method | Endpoint              | Description       |
| ------ | --------------------- | ----------------- |
| GET    | `/api/students`       | Get all students  |
| GET    | `/api/students/{id}`  | Get student by ID |
| POST   | `/api/students`       | Add new student   |
| PUT    | `/api/students/{id}`  | Update student    |
| DELETE | `/api/students/{id}`  | Delete student    |
| GET    | `/api/students/hello` | Test endpoint     |

```
```
## 🎯 Purpose of This Project

* Practice Spring Boot fundamentals
* Understand Dependency Injection
* Learn REST API development
* Work with JPA & Hibernate
* Build real-world backend experience

```
```
## 👨‍💻 Author

* Kavinda UJ Warakamura
* Computer Science Undergraduate
* University of Jaffna






