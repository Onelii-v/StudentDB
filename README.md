[README.txt](https://github.com/user-attachments/files/22196610/README.txt)
# Student Database App (Java + JDBC + MySQL)

## Overview
This is a console-based Java application for managing student information using **JDBC** with **MySQL**.  
It demonstrates how to perform CRUD operations by organizing the code into separate classes:

- `Student` → Model class (represents a student object).  
- `DBConnection` → Handles database connection.  
- `InsertData` → Handles inserting students.  
- `SelectData` → Handles viewing and searching students.  
- `DeleteAndUpdateData` → Handles updating and deleting students.  
- `Main` → Provides the console menu to interact with the system.  

---

## Features
- Add a student  
- View all students  
- Search student by ID  
- Update student details  
- Delete a student  

---

## Database Setup

1. Open MySQL and run:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

-- Optional sample data
INSERT INTO students (name, age, course) VALUES
('Alice', 20, 'Computer Science'),
('Bob', 22, 'Information Systems');
