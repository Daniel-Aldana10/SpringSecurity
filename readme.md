# Spring MVC Auth App

This is a Spring-based web application with authentication powered by Spring Security. It allows users to register, log in, and ensures that usernames are unique by checking if a user already exists before account creation.
## Getting Started

These instructions will help you get a copy of the project running on your local machine for development and testing purposes.

### Prerequisites

You will need the following installed:

- [Java 17+](https://jdk.java.net/)
- [Maven 3.8+](https://maven.apache.org/install.html)
- Git 

### Installing

Clone the repository:

``` 
git clone https://github.com/Daniel-Aldana10/SpringSecurity.git
cd SpringSecurity
```

Build the project using Maven:
```
mvn clean install
```

### Running the Application

You can run the program with:

```
java -cp target/SecurityApplication.0.0.1.jar
```

## Deployment

To package:
```
mvn package
```
Then run using:
```
java -cp target/SecurityApplication.0.0.1.jar
```

## Javadoc

Code documentation is available in `target/site/apidocs/index.html` after running the command:

```bash
mvn javadoc:javadoc
````
## Author

Daniel Aldana — [GitHub](https://github.com/Daniel-Aldana10)