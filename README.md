# Toy Story Calculator

A simple desktop calculator built with Java Swing as a coursework project for UDESC's Object-Oriented Programming (POO) class.

## Features

- Basic arithmetic: addition, subtraction, multiplication and division
- A "special" operation slot
- Input validation:
  - Operands limited to values below 1000
  - Division by zero is rejected
  - Only one operator per equation
  - At least one operator must be selected before evaluating
- Toy Story themed UI

## Requirements

- Java 21 (JDK)
- Maven 3.6+

## Project structure

```
src/main/java/pooproject/udesc/poo/calculator/
├── Calculator.java   # Swing JFrame entry point and UI controller
├── Calculator.form   # NetBeans form definition
├── Services.java     # Arithmetic operations
├── Methods.java      # Enum of supported operations
└── Validators.java   # Input validation and custom exceptions
src/main/resources/assets/
└── toystory.jpg      # UI background asset
```

## Running

From the project root:

```bash
mvn compile exec:java
```

Or build a jar and run it:

```bash
mvn package
java -cp target/udesc-poo-calculator-1.0-SNAPSHOT.jar pooproject.udesc.poo.calculator.Calculator
```

The project was originally created in NetBeans and can also be opened and run directly from the IDE.

## Author

Ruan Silva — [GitHub](https://github.com/ruan-silva)
