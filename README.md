User Credit Card App

![angular4](https://user-images.githubusercontent.com/21153996/34914355-30622e76-f922-11e7-99f8-12b8e51495da.PNG)

# Angular 4 Frontend

This project was generated to make user credit card CRUD operations via ANGULAR 4.

## SpringBootCrudApi

RestFul Service uses following Technologies:

* Spring-boot
* Hibernate
* JaCoCo
* MySQL DB
* Swagger2

## Build

Run mvn clean install

## Run 

First run SpringBootCrudApi then run Angular4 project.

## SpringBootService

Run the following to kickstart springboot.
mvn spring-boot:run

## Angular
Prerequisites:
Install the stable version of latest Node JS
Install the following globally
npm install -g @angular/cli
npm install -g @angular/platform-browser@latest --save

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
