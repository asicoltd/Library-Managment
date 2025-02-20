
# Lending Library Management System

## Overview

The Lending Library Management System allows users to manage a library's book inventory, user records, and loan transactions. It provides a menu-driven interface where administrators can add, modify, find, and list books, users, and book loans.

The system is designed with a simple structure using object-oriented programming principles in Java.

## Features

### Books
- Add a new book
- Modify book details
- Find a book by ISBN number
- List all books

### Users
- Add a new user
- Modify user details
- Find a user by name
- List all users

### Loans
- Add a new book loan (link a user to a book)
- Modify a loan (update loan details)
- Find a loan by ISBN number
- List all loans

## Technologies Used

- **Java 8** for the implementation.
- Object-oriented programming concepts.
- Command-line interface for interaction.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your machine.

### Running the Application

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/lending-library.git
   ```

2. Navigate to the project directory:
   ```bash
   cd lending-library
   ```

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the main application:
   ```bash
   java AppLauncher
   ```

### Application Menu

Once the program starts, you will be presented with a menu with the following options:

1. Enter a new book
2. Modify the book details (Enter the book ISBN number)
3. Find a book by ISBN number
4. Display the list of all books
5. Add a new user
6. Modify user details
7. Find a user by name
8. Display all users
9. Add a loan (link a user to a book by ISBN number)
10. Modify a loan (loan is identified by ISBN number)
11. Find a loan (loan is identified by ISBN number)
12. Display all loans
0. Exit the program

### Sample Menu:

```
Enter a selection from the following menu:
1. Enter a new book
2. Modify the book details. Enter the book isbn number
3. Find a book by isbn number
4. Display list of all books

5. Add a new user
6. Modify user details
7. Find a user by name
8. Display all users

9. Add a loan. Link a user name to a book by isbn number
10. Modify a loan. Loan is identified by isbn number
11. Find a loan. Loan is identified by isbn number
12. Display all loans

0. Exit program
```

### Example Usage:

1. **Add a New Book**
   - Select option `1` from the menu.
   - Enter the book title, author, publication date, and ISBN number.

2. **Add a New User**
   - Select option `5` from the menu.
   - Enter the user's first name, last name, age, and address.

3. **Add a Book Loan**
   - Select option `9` from the menu.
   - Enter the user's name and book ISBN number.
   - Enter the loan due date.

### Error Handling

The system will check for errors like invalid ISBN numbers, duplicate books or users, and full capacity of books, users, or loans. If any error occurs, the system will display an appropriate message.

### Classes and Methods

1. **AppDriver**
   - Manages the overall application execution and menu interface.

2. **AppLauncher**
   - Entry point of the application.

3. **Book**
   - Represents a book entity with details like title, author, ISBN, and publication date.

4. **BookLoan**
   - Represents a book loan with user, book, and due date information.

5. **LendingLibrary**
   - Manages books, users, and loans with methods for adding, modifying, finding, and listing them.

6. **LendingLibraryController**
   - Controls the application logic, providing methods to handle user input and interact with the `LendingLibrary`.

7. **User**
   - Represents a user in the library system with personal details and a user ID.

## Limitations

- The library has fixed capacities for books, users, and loans. Once these limits are reached, no new records can be added.
- Currently, only basic features are available (no advanced features like due date alerts or fines).

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

