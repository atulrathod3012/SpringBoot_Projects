

<p align="center">
   <img src="https://img.icons8.com/color/96/000000/lol.png" alt="JokeHub Logo" width="96" height="96"/>
</p>

# JokeHub API 🤣


<p align="center">
   <a href="https://spring.io/projects/spring-boot"><img src="https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen?style=flat-square&logo=spring-boot" alt="Spring Boot"></a>
   <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-8%2B-blue?style=flat-square&logo=java" alt="Java"></a>
   <a href="https://github.com/atulrathod3012/RandomeJokeApi"><img src="https://img.shields.io/github/license/atulrathod3012/RandomeJokeApi?style=flat-square" alt="License"></a>
</p>

A simple, fun, and modern REST API for random jokes. Built with Spring Boot, this project demonstrates clean architecture, CRUD operations, and best practices for Java backend development.


## ✨ Features
- 🎲 Retrieve a random joke
- 📋 List all jokes
- ➕ Add new jokes
- ❌ Delete jokes


## 🛠️ Technologies Used
- ☕ Java
- 🌱 Spring Boot
- 🗄️ Spring Data JPA
- 🛢️ H2 Database
- 🐘 Maven


## 🚀 Getting Started


### Prerequisites
- Java 8 or higher
- Maven


### Running the Application


1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd JokeHub-Api-master
   ```
2. **Build the project:**
   ```sh
   mvn clean install
   ```
3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
   The API will be available at `http://localhost:8080`.


### 📚 API Endpoints

- `GET /jokes/random` — Get a random joke
- `GET /jokes` — Get all jokes
- `POST /jokes` — Add a new joke
- `DELETE /jokes/{id}` — Delete a joke by ID


### 🧪 Example Usage

**Get a random joke:**
```sh
curl http://localhost:8080/jokes/random
```

**Add a new joke:**
```sh
curl -X POST -H "Content-Type: application/json" -d '{"content": "Why did the chicken cross the road? To get to the other side!"}' http://localhost:8080/jokes
```


## 🗄️ Database
- Uses H2 in-memory database for development and testing.
- Initial data is loaded from `src/main/resources/data.sql`.


## 📁 Project Structure
- `controller/` — REST controllers
- `service/` — Business logic
- `repository/` — Data access layer
- `model/` — JPA entities


<p align="center">
   <b>Made with ❤️ for fun and learning!</b>
</p>
