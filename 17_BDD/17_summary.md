# Behaviour Driven Development
> is an agile software development process that encourages collaboration among developers, quality assurance testers, and customer representatives in a software project

## BDD Format
User story -> As X I want Y, so that Z -> Scenario -> Given, When, Then

### Gherkin
BDD menggunakan bahasa gherkin untuk mempermudah proses identifikasi tujuan stuatu fitur. 
Selain itu dapat menggunakan software Cucumber untuk memudahkan penulisan Gherkin
pada BDD.

### Cucumber
> Cucumber is a software tool that supports behavior-driven development. Central to the Cucumber BDD approach is its ordinary language parser called Gherkin. It allows expected software behaviors to be specified in a logical language that customers can understand.

## Story Example
Feature : login
- As a user. 
- I want to login
- So that i can create new Status

Scenarion : login success
- Given I am on login page
- When I input valid email and valid password
- And I click login button
- Then directed to home menu

### Serenity
> is a framework and open source library for the creation of automated software testing for code in development