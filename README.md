# Bookstore Web Application

## Overview
This web application is a simple bookstore where users can browse available books, add them to their cart, and make purchases. Administrators have additional privileges such as adding, modifying, and deleting books and users.

## Technologies Used
- Spring Boot
- MySQL
- JPA (Java Persistence API)

## Functionality

### User Roles
- **Admin Role:** Administrators have access to functionalities like adding, modifying, and deleting books and users.
- **User Role:** Regular users can browse books, add them to their cart, and make purchases.

### Books Tab
- Both users and admins can view all available books along with details such as image, name, author, and price.
- Book details are retrieved by making calls to Spring Boot, which retrieves data from MySQL using JPA.

### Cart
- Users can add books to their cart and view the contents of their cart.
- They can also add or remove books from the cart.

### Admin Privileges
- **Books Tab:**
  - View/Delete Book Details Page
  - Edit Book Page
  - Add Book Page

- **User Tab:**
  - View/Delete User Details Page
  - Add User Page
