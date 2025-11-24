```markdown
# RandomeJokeApi

Randome Joke API is a RESTful web service created using the Spring
 Boot framework. This API provides random jokes via HTTP endpoints and can be easily 
 integrated into other applications or used as a fun standalone service.

## Features

- Returns random jokes via a simple API endpoint
- Built with Java and Spring Boot
- Uses in-memory H2 database for development
- Includes development tools and testing support

## Technologies & Libraries Used

- **Java 21+**
- **Spring Boot**
  - spring-boot-starter-web (for REST API)
  - spring-boot-starter-data-jpa (for data persistence)
  - spring-boot-devtools (for hot reload during development)
  - spring-boot-starter-test (for testing)
- **H2 Database** (in-memory database for development)
- **Lombok** (to reduce boilerplate code)

## Getting Started

### Prerequisites

- Java 21 or newer
- Maven

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com/atulrathod3012/RandomeJokeApi.git
   cd RandomeJokeApi
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
   The application will start on `http://localhost:8080` by default.

### Usage

You can access the random joke endpoint using:
```
GET http://localhost:8080/jokes/random
```
*(Adjust the endpoint path if your controller is configured differently.)*

#### Example Request

```bash
curl http://localhost:8080/Joke/random
```

#### Example Response

```json
{
  "id": 1,
  "joke": "Why did the chicken join a band? Because it had the drumsticks!"
}
```

### Testing

To run the tests:
```bash
mvn test
```

## Configuration

- The application uses an in-memory H2 database by default for development.
- For production use, configure your database settings in `src/main/resources/application.properties`.

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and create a pull request.

## License

This project is for educational and demonstration purposes.
```