# Car Booking System

This is a Spring Boot-based Car Booking System application. It allows users to book cars, manage users, and handle car-related operations with a RESTful API.

## Features
- User and Car management
- Booking functionality
- Exception handling
- JPA repository integration
- RESTful API endpoints

## Project Structure
- `controller/` - REST controllers for handling HTTP requests
- `service/` - Business logic for car and user operations
- `Dao/` - Data access objects
- `jpaRepo/` - Spring Data JPA repositories
- `entity/` - JPA entity classes
- `exceptions/` - Custom exception classes

## Getting Started

### Prerequisites
- Java 17 or later
- Maven 3.6+

### Build and Run
1. Clone the repository:
   ```sh
   git clone <repo-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd CarBookingSystem
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Configuration
Edit `src/main/resources/application.properties` to configure database and other settings.

## API Endpoints
Refer to the controller classes in `src/main/java/com/CarBookingSystem/controller/` for available endpoints.

## License
This project is licensed under the MIT License.
