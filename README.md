# Rocket_Elevators_Java_API

# Description

As the React application is not connected to the Rocket Elevators database directly, an API to interact with it will be needed. This API will provide any data requested by the application, along with any other CRUD operation needed. It must have an authentication feature as well, so we limit the usage and accessibility of our data.

# Usage

1. Install IntelliJ IDEA Ultimate, which is a commonly used IDE for Java development. You can get it here: https://www.jetbrains.com/idea/download/.

2. Create a new project in IntelliJ IDEA by going to File > New > Project. Select "Spring Initializr" from the list of project types, and click Next.

3. Fill out the form to create your new project. You will need to specify a group ID, artifact ID, and version for your project, as well as the dependencies you want to include. You should select "Spring Web" as one of the dependencies, as this will provide the necessary functionality for building a REST API.

4. Once you have finished filling out the form, click Finish to create the project. IntelliJ IDEA will create a basic project structure and configure your project with the necessary dependencies.

5. To create a new endpoint in your API, you can create a new controller class and define a method annotated with a request mapping annotation, such as @GetMapping or @PostMapping. For example: 

``` @RestController
@RequestMapping("/api/v1")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
}
```

6. To authenticate users using JSON Web Tokens (JWT), you will need to create a login endpoint that accepts a username and password from the user and verifies their credentials. If the credentials are valid, you can generate a JWT and return it to the user. On subsequent requests, the user can include the JWT in the header of the request to confirm their authenticity.

7. You can use the spring-security-jwt library to help you with generating and validating JWTs in your API. You will need to configure the library with a secret key and set up a JwtAuthenticationFilter to intercept incoming requests and check for a valid JWT.

# Dependecies

- Javax
- Springboot
- maven
- jsonwebtoken
- lombok
- mysql
- hibernate-core

use this link to find them: -->>https://mvnrepository.com/

# To Run this Project you can ...

Use those endpoints in postman >>> https://www.postman.com/downloads/




###
GET http://localhost:8080/users

###
POST http://localhost:8080/api/Authenticate

{
    "email": ""
    "password": ""
}

###
POST http://localhost:8080/Interventions/new

###
GET http://localhost:8080/Customers

###
GET http://localhost:8080/Customers/{{id}}

###
GET http://localhost:8080/users/{{id}}

###
GET http://localhost:8080/Addresses

###
GET http://localhost:8080/Addresses/{{id}}

###
GET http://localhost:8080/Batteries

###
GET http://localhost:8080/Batteries/{{id}}

###
GET http://localhost:8080/Batteries/{{id}}/Addresses

###
GET http://localhost:8080/Buildings

###
GET http://localhost:8080/Buildings/{{id}}

###
GET http://localhost:8080/Buildings/{{id}}/Addresses

###
GET http://localhost:8080/Columns

###
GET http://localhost:8080/Columns/{{id}}

###
GET http://localhost:8080/Columns/{{id}}/Batteries

###
GET http://localhost:8080/Elevators

###
GET http://localhost:8080/Elevators/{{id}}

###
GET http://localhost:8080/Employees

###
GET http://localhost:8080/Employees/{{id}}

###
GET http://localhost:8080/Interventions

###
GET http://localhost:8080/Interventions/{{id}}

###
POST http://localhost:8080/Interventions/new

###
PATCH http://localhost:8080/Interventions/update/{{id}}

###
DELETE http://localhost:8080/Interventions/delete/{{id}}

###
POST http://localhost:8080/Customers/new






