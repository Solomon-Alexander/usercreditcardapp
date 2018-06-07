# User Credit Card App - Angular 4 Frontend

This project was generated to make user credit card CRUD operations via ANGULAR 4.

## User Credit Card App - SpringBoot backend

RestFul Service uses following Technologies:

* Java 8
* Spring-boot
* Hibernate
* JaCoCo
* MySQL DB 8.0
* Swagger2

## Build

Run mvn clean install

## Run

First run backend then run frontend Angular4 project.

## SpringBootService
Navigate to backend folder
Run the following to kickstart springboot.
mvn spring-boot:run
For building the artifacts (i.e jar) use this: mvn clean install

## Angular
Prerequisites:

* Install the stable version of latest Node JS.

* Install the angular CLI globally at the project root level: npm install -g @angular/cli

On the package.json directory for angular run in order :
Go to front end folder
* npm install
* ng serve

Add/Remove/Edit User Credit Card on http://localhost:4201/

## Running Integration Test

Run mvn clean verify -P integration-test 

## Running Service Unit Tests

Run mvn clean verify -P all-tests

## Documentation

To get more look at http://localhost:8081/swagger-ui.html#/
