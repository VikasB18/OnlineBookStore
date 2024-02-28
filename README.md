# Bookstore Web Application

## Overview
This web application is a simple bookstore where users can browse available books, add them to their cart, and make purchases. Administrators have additional privileges such as adding, modifying, and deleting books and users.

## Technologies Used
- Spring Boot
- MySQL
- JPA (Java Persistence API)

## Functionality

### User Endpoints

#### Get Users
- **Method:** GET
- **URL:** /api/users/get
- **Description:** Retrieves a list of all users.

#### Add User
- **Method:** POST
- **URL:** /api/users/add
- **Description:** Adds a new user to the database.
- **Request Body:** User object (JSON format)

#### Delete User
- **Method:** DELETE
- **URL:** /api/users/{id}
- **Description:** Deletes a user with the specified ID.
- **Path Parameter:** id (ID of the user to be deleted)

### Book Endpoints

#### Get Books
- **Method:** GET
- **URL:** /api/books/get
- **Description:** Retrieves a list of all available books.

#### Upload Image
- **Method:** POST
- **URL:** /api/books/upload
- **Description:** Uploads an image file for a book.
- **Request Parameter:** imageFile (multipart file)

#### Add Book
- **Method:** POST
- **URL:** /api/books/add
- **Description:** Adds a new book to the database.
- **Request Body:** Book object (JSON format)
- **Note:** Before adding the book, make sure to upload the image using the `/upload` endpoint.

#### Delete Book
- **Method:** DELETE
- **URL:** /api/books/{id}
- **Description:** Deletes a book with the specified ID.
- **Path Parameter:** id (ID of the book to be deleted)

#### Update Book
- **Method:** PUT
- **URL:** /api/books/update
- **Description:** Updates an existing book in the database.
- **Request Body:** Book object with updated information (JSON format)

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
