# Bank Management System

Welcome to the Bank Management System project! This is a desktop application developed in Java using Swing for the graphical user interface. It simulates a bank management system where users can perform various banking operations such as changing their PIN, checking their balance, and signing up for new accounts.

## Table of Contents
- [About the Project](#about-the-project)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About the Project
This project is designed to provide a simple and intuitive interface for managing bank operations. Users can:
- Change their PIN
- Check their balance
- Sign up for new accounts

The application interacts with a MySQL database to store and retrieve user information securely. The system ensures that all user inputs are validated and provides feedback through dialog boxes.

## Technologies Used
- **Java**: The primary programming language used for the application.
- **Swing**: A Java GUI toolkit used for building the graphical user interface.
- **JDBC**: Java Database Connectivity for database operations.
- **MySQL**: The database management system used to store user and bank information.

## Features
- User authentication
- User-friendly interface
- Secure PIN change functionality
- Balance enquiry
- New account sign-up

## Getting Started

### Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK)
- MySQL
- IntelliJ IDEA or any other Java IDE

### Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/AlokKumarYadav2410/bank-management-system.git

2. **Navigate to the project directory:**
    ```sh
    cd bank-management-system

### Running the Application
1. Open the project in IntelliJ IDEA.
2. Set up the MySQL database:
   - Create a database named bank_management.
   - Import the provided SQL script to set up the necessary tables.
3. Configure the database connection in the application:
   - Update the database configuration file with your MySQL credentials.
4. Add JAR's:
   - jcalendar
   - mysql_connector
4. Run the MainClass to start the application.

## Project Structure
<pre>
bank-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bank/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── schema.sql
├── .gitignore
├── README.md
└── pom.xml
</pre>

## Usage
Once the application is running, you can:  
- Sign up for a new account.
- Log in using your credentials.
- Change your PIN.
- Check your balance.

## Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.  
1. Fork the Project
2. Create your Feature Branch 
    ```sh
    git checkout -b feature/AmazingFeature
3. Commit your Changes 
    ```sh
    git commit -m 'Add some AmazingFeature'
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

## License
Distributed under the MIT License. See LICENSE for more information.