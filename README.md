Project Name: In-Memory Library API

I have developed a Spring Boot REST API to manage a library book inventory using in-memory storage, without using any database.

The API supports the following operations:
- Add a new book
- Retrieve a book by ID
- Search books by year
- Delete a book

The project follows a clean layered architecture using Controller, Service, DTO, Store, and Exception handling layers.  
Swagger UI has also been integrated to test APIs easily.

I faced some challenges related to Maven dependencies and Swagger compatibility, which I resolved by debugging and configuring stable Spring Boot and OpenAPI versions.

GitHub Repository Link:
https://github.com/Aniket1603/In-Memory-Library


# In-Memory Library API

This is a simple Spring Boot REST API project to manage books in a library using in-memory storage (no database).

The API allows adding, viewing, searching, and deleting books.

---

## Tech Stack
- Java 17
- Spring Boot
- Maven
- Swagger UI
- GitHub

---

## Features
- Add new books
- Get book by ID
- Search books by year
- Delete books
- In-memory storage (No database)
- Swagger UI support

---

## How to Run the Project

Clone the repository:
```bash
git clone https://github.com/Aniket1603/In-Memory-Library.git
Run the project: - mvn spring-boot:run
API Base URL
http://localhost:8080

API Endpoints

Add Book:

POST /books


Get Book by ID:

GET /books/{id}


Search Books by Year:

GET /books/search?year=2024


Delete Book:

DELETE /books/{id}

Sample Request Body
{
  "id": 1,
  "title": "Spring Boot Mastery",
  "author": "Aniket",
  "year": 2024
}

Swagger UI
http://localhost:8080/swagger-ui/index.html

Future Improvements

Add MySQL database
Add login system
Add pagination
Deploy project online
