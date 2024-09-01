# Kata : Library Management System

## Description
The Library Management System is a simple application built to manage books in a library. It allows users to add new books, borrow available books, return borrowed books, and view a list of all available books. This project is developed in Java using TDD (Test-Driven Development) and follows SOLID principles to ensure maintainable and extensible code.

## Table of Contents

- [Problem Statement](#problem-statement)
- [Requirements](#requirements)
- [Features](#features)
  - [Add Books](#add-books)
  - [Borrow Books](#borrow-books)
  - [Return Books](#return-books)
  - [View Available Books](#view-available-books)
- [Best Practices Followed](#best-practices-followed)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Test Summary](#test-summary)
  - [Test Report](#test-report)


## Problem Statement

Create a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.

## Requirements

### Add Books:

- Users should be able to add new books to the library.
- Each book should have a unique identifier (e.g., ISBN), title, author, and publication year.

### Borrow Books:

- Users should be able to borrow a book from the library.
- The system should ensure that the book is available before allowing it to be borrowed.
- If the book is not available, the system should raise an appropriate error.

### Return Books:

- Users should be able to return a borrowed book.
- The system should update the availability of the book accordingly.

### View Available Books:

- Users should be able to view a list of all available books in the library.


## Features

The Library Management System provides the following key features:

**1. Add Books**

  - Functionality: Allows users to add new books to the library.
  - Details:<br>
        - Each book has a unique identifier (ISBN), title, author, and publication year.<br>
        - Books are stored in the library's repository and marked as available by default.

**2. Borrow Books**

  - Functionality: Enables users to borrow books from the library.
  - Details:<br>
        - Before borrowing, the system checks if the book is available.<br>
        - If the book is available, it is marked as borrowed (availability set to false).<br>
        - If the book is not available, the system raises a BookNotAvailableException.

**3. Return Books**

  - Functionality: Allows users to return books they have borrowed.
  - Details:<br>
        - When a book is returned, it is marked as available again (availability set to true).<br>
        - The system ensures that the returned book is part of the library’s collection.

**4. View Available Books**

  - Functionality: Users can view a list of all books currently available in the library.
  - Details:<br>
        - The system filters out borrowed books and displays only those marked as available.<br>
        - Users can see the title, author, and publication year of each available book.


## Best Practices Followed

  - **TDD (Test-Driven Development)**: Tests were written before implementing the features.
  - **SOLID Principles**: The code follows SOLID principles to ensure maintainability and scalability.
  - **Clean Code**: The code is well-structured, with meaningful variable and method names, making it easy to read and maintain.


## Getting Started

### Prerequisites
- Java 8 or above
- Maven 3.6.0 or above

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-management-system.git

2. Navigate into the project directory:

   ```bash
   cd library-management-system

3. Build the project using Maven:
   ```bash
   mvn clean install

4. Run Test case:
    To run the tests, use the following Maven command:
   ```bash
   mvn test
   ```

## Test Summary

This project follows Test-Driven Development (TDD) principles, ensuring that all functionalities are thoroughly tested. The test cases cover various scenarios, including adding books, borrowing available books, returning borrowed books, and viewing available books.

### Testing Freamwork:

- JUnit 5

### Test Report


    Number of Tests: 5
    Passed Tests: 5
    Failed Tests: 0
    Skipped Tests: 0
    Execution Time: 0.273 s

![image](https://github.com/user-attachments/assets/df9a74c7-3759-4dfd-be31-6ef1b214556b)
