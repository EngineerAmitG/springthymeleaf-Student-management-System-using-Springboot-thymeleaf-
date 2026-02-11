# 📋 Student Management System (Spring Boot + Thymeleaf)

A dynamic web-based Student Management System built using **Spring Boot, Thymeleaf, JPA, and PostgreSQL**.

This project demonstrates full CRUD operations with a Neo-Brutalist UI design.

---

## 🚀 Features

- ➕ Add Student
- 🔄 Update Student (Search by Email)
- 🔍 Search Student
- 🗑 Delete Student (By ID)
- 📋 View All Students
- ✅ Email uniqueness validation
- 🎨 Custom Neo-Brutalist UI
- 🗂 MVC Architecture (Controller → Service → Repository)

---

## 🛠 Tech Stack

- Java 23
- Spring Boot 4
- Spring Data JPA
- Hibernate
- Thymeleaf
- PostgreSQL
- Lombok
- Maven

---

## 📂 Project Structure

springthymeleaf
│
├── controller
│ └── StudentController.java
│
├── service
│ └── StudentService.java
│
├── repository
│ └── StudentRepository.java
│
├── entity
│ └── Student.java
│
├── templates
│ ├── index.html
│ ├── insert.html
│ ├── update.html
│ ├── search.html
│ ├── delete.html
│ └── students.html
│
└── static/css
├── index.css
├── insert.css
├── update.css
├── delete.css
├── search.css
└── students.css


---

## 🗄 Database Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springthymeleaf
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
📌 Entity Example
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;
}
▶ How to Run
Clone the repository

git clone https://github.com/your-username/student-management-system.git
Open in IntelliJ IDEA / VS Code

Configure PostgreSQL database

Run SpringthymeleafApplication.java

Open browser:

http://localhost:8081/home
📸 Screenshots
(Add screenshots here later)

##🎯 Learning Outcomes
Spring MVC flow understanding

Form handling with Thymeleaf

JPA Repository usage

Database constraints

Exception handling

Clean project structure

##👷 Developed By
EngineerG

##📄 License
This project is for educational purposes.
