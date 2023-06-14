# Student_Api
developing a backend API for Student  using Java ,Spring Boot. The API should allow users to perform various operations related to Student


# Problem Statement.

This API allows users to perform CRUD operations on Student entities with having 4-5 fields

## Requirements

- Create a Product entity with the following attributes:
  - ID (auto-generated)
  - FirstName
  - LastName
  - Age
  - Address
- Implement CRUD (Create, Read, Update, Delete) operations for the Student entity using RESTful endpoints.
- Create an Student entity with the following attributes:
  - ID (auto-generated)
  - FirstName 
  - LastName
  - Age
  - Address
- Implement the following operations for the Student entity using RESTful endpoints:
  - Add Student 
  - Get all Student from Databases
  - Get Student by id
  - Update Student using Id
  - Delete Student using Id



# Modules 

- Student Module  



### Admin Features 

- Adding Student  (http://localhost:8888/swagger-ui/index.html#/student-controller/addStudent)
- Get Student By id (http://localhost:8888/swagger-ui/index.html#/student-controller/findbyid)
- Get All Student From databases (http://localhost:8888/swagger-ui/index.html#/student-controller/viewAll)
- Update Student  (http://localhost:8888/swagger-ui/index.html#/student-controller/updateStudent)
- Delete Student using Id (http://localhost:8888/swagger-ui/index.html#/student-controller/DeleteStudent)


![01]()



# Technology and Tools used 

- Java
- MySQL
- Spring Boot
- Spring Data JPA
- Hibernate
- lombok
- Swagger
- Maven
- Git & GitHub
- Spring tool suite





## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties](https://github.com/gitsid1611/AtDev-Assignment/blob/main/student/student/src/main/resources/application.properties) file. 
* Update the port number, username and password as per your local database config.

```
    server.port=8888
    spring.datasource.url=jdbc:mysql://localhost:3306/Student;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```


# Features (http://localhost:8888/swagger-ui/#/)


## Author

- [Sudhirkumar Shukla]([https://github.com/avanishmani](https://github.com/gitsid1611))
