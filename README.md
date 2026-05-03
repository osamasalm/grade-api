# Grade API

A REST API for managing student grades built with Spring Boot and JPA.

## Endpoints
- GET    /students         → get all students
- GET    /students/{id}    → get one student
- POST   /students         → add a student
- PUT    /students/{id}    → update a student
- DELETE /students/{id}    → delete a student

## Features
- Full CRUD operations
- H2 in-memory database with JPA
- Input validation with proper error messages
- Correct HTTP status codes

## How to run
1. Clone the repo
2. Open in IntelliJ IDEA
3. Run GradeApiApplication.java
4. API runs on http://localhost:8081
5. H2 console at http://localhost:8081/h2-console

## Built with
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Bean Validation
