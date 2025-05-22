# Advanced Java Programming Exercises

This repository contains comprehensive Java programming exercises covering collections, string operations, GUI development with Swing, servlets, JSP, and database connectivity.

## 📚 Table of Contents

- [Collections Framework](#collections-framework)
- [String Operations](#string-operations)
- [GUI Programming with Swing](#gui-programming-with-swing)
- [Servlet Programming](#servlet-programming)
- [JSP and Session Management](#jsp-and-session-management)
- [Database Connectivity (JDBC)](#database-connectivity-jdbc)
- [How to Run](#how-to-run)
- [Prerequisites](#prerequisites)

## 🗂️ Collections Framework

### Exercise 1a: ArrayList and LinkedList Operations
Comprehensive program demonstrating various operations on ArrayList and LinkedList:
- Adding elements and insertion at specific indices
- Element access, updating, and removal
- Searching, sorting, and iteration techniques
- List size management and sublists
- Iterator pattern implementation

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1a.Listinterface/1a.png)**

### Exercise 1b: ArrayList Specific Operations
Collection of programs focusing on ArrayList manipulations:

1. **Color Search Program** - Search for "Red" color in ArrayList
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1b.ArrayList/1b1.png)**

2. **Element Removal** - Remove 2nd element and "Blue" from ArrayList
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1b.ArrayList/1b2.png)**

3. **Sorting Colors** - Sort ArrayList using Collections.sort()
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1b.ArrayList/1b3.png)**

4. **SubList Extraction** - Extract 1st and 2nd elements using subList()
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1b.ArrayList/1b4.png)**

5. **Index-based Removal** - Delete nth element by index
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1b.ArrayList/1b5.png)**

### Exercise 1c: LinkedList Advanced Operations
Specialized LinkedList operations and iterator usage:

1. **Positional Iterator** - Iterate from specified position using listIterator()
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1c.LinkedList/1c1.png)**

2. **Reverse Iteration** - Use descendingIterator() for reverse traversal
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1c.LinkedList/1c2.png)**

3. **End Insertion** - Add elements at the end using offerLast()
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1c.LinkedList/1c3.png)**

4. **Position Display** - Show elements with their positions
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1c.LinkedList/1c4.png)**

5. **Element Swapping** - Swap first and third elements using Collections.swap()
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/1c.LinkedList/1c5.png)**

## 🔤 String Operations

### Exercise 2a: Comprehensive String Operations
Complete demonstration of Java string handling capabilities:
- String creation and basic operations
- Length calculation and character access
- String comparison methods
- Searching and substring operations
- String modification and whitespace handling
- Concatenation and splitting techniques
- StringBuilder usage
- String formatting
- Email validation using contains(), startsWith(), and endsWith()

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/2a.Stringoperationsdemo/2a.png)**

### Exercise 2b: Performance Comparison
Performance benchmark between StringBuffer and StringBuilder:
- Append operation test with 10,000 iterations
- Performance analysis and comparison
- Justification of better choice

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/2b.StringTestingPerformance/2b.png)**

### Exercise 3a: Extended String Operations
Advanced string manipulation techniques (duplicate of 2a with extended functionality).

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3a.StringOperations/3a.png)**

### Exercise 3b: String Utility Functions
Custom string utility functions:

1. **Null/Empty Check** - isNullOrEmpty() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3b.StringExercise/3b1.png)**

2. **Substring Counter** - countOccurrences() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3b.StringExercise/3b2.png)**

3. **String Reversal** - reverseString() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3b.StringExercise/3b3.png)**

4. **Palindrome Checker** - isPalindrome() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3b.StringExercise/3b4.png)**

5. **Whitespace Removal** - removeWhitespace() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3b.StringExercise/3b5.png)**

### Exercise 3c: Advanced String Utilities
Additional string manipulation functions:

6. **Word Capitalization** - capitalizeWords() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3c.Stringexercise/3c6.png)**

7. **String Truncation** - truncate() function with ellipsis
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3c.Stringexercise/3c7.png)**

8. **Numeric Validation** - isNumeric() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3c.Stringexercise/3c8.png)**

9. **Random String Generator** - generateRandomString() function
   **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3c.Stringexercise/3c9.png)**

10. **Word Counter** - countWords() function
    **[Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/3c.Stringexercise/3c10.png)**

## 🖥️ GUI Programming with Swing

### Exercise 4a: Basic Swing Application
Simple Swing program with JFrame and JLabel:
- Display "Hello! VI C, Welcome to Swing Programming"
- Blue color, plain font, size 32

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/4.Swings/SwingExe1.png)**

### Exercise 4b: Button Event Handling
Interactive button program with ActionListener:
- Country selection buttons (Sri Lanka/India)
- Event-driven message display

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/4.Swings/CountryButtonExample.png)**

### Exercise 4c: Image Button Events
Advanced button program with images:
- Digital Clock and Hour Glass image buttons
- ActionListener implementation

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/4.Swings/clock.png)**

## 📋 Advanced Swing Components

### Exercise 5a: JList with Console Output
Country selection using JList:
- Countries: USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore
- Console output on selection

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/5.Swings/CountryListConsole.png)**

### Exercise 5b: Color Tabbed Pane
Tabbed interface with color display:
- RED, BLUE, and GREEN tabs
- Dynamic color display on tab selection

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/5.Swings/ColorTabbedPane.png)**

### Exercise 5c: Country-Capital Mapping
Enhanced JList with capital display:
- Country selection shows corresponding capital
- Console output integration

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/5.Swings/CountryCapitalList.png)**

### Exercise 5d: Extended Color Tabs
Additional tabbed pane implementation:
- Cyan, Magenta, and Yellow tabs
- Color switching functionality

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/5.Swings/CTP1.png)**

## 🌐 Servlet Programming

### Exercise 6a: Factorial Calculator
Web-based factorial calculator:
- HTML form input
- Servlet processing
- Step-by-step implementation guide

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/6.JavaServletExample/Fact.png)**

### Exercise 6b: Cookie Management
Advanced cookie handling:
- User name storage in cookies
- Visit counter implementation
- Cookie expiry demonstration
- Personalized welcome messages

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/6.JavaServletExample/cookiecount.jpg)**

### Exercise 6c: Prime Number Checker
Web-based prime number validator:
- HTML input form
- Servlet-based prime checking algorithm
- Detailed implementation steps

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/6.JavaServletExample/Prime.png)**

## 📄 JSP and Session Management

### Exercise 7a: Session Management
JSP session handling with timeout:
- 1-minute session expiry
- User name input and greeting
- Session timeout demonstration

**[Screenshot 1](https://github.com/shivu-kumar/Advance-Java/blob/main/Exp7-JavaServlet/session1.jpg)** | **[Screenshot 2](https://github.com/shivu-kumar/Advance-Java/blob/main/Exp7-JavaServlet/session2.jpg)**

### Exercise 7b: Cookie Management System
Comprehensive cookie management:
- Cookie creation with custom fields (Name, Domain, Max Age)
- Active cookie list display
- Navigation between cookie operations

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/Exp7-JavaServlet/cookie.jpg)**

## 🗃️ Database Connectivity (JDBC)

### Exercise 8a: Coffee Database - Insert Operations
Coffee inventory management system:
- Table structure: `coffee(id, coffee_name, price)`
- Record insertion via HTML/JSP
- Display all existing records

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP8-JDBCExample/8a.png)**

### Exercise 8b: Coffee Database - Update Operations
Coffee record modification:
- Update existing coffee products by ID
- HTML form integration
- JSP result display

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP8-JDBCExample/8b.png)**

### Exercise 8c: Employee Database - Insert and Report
Employee management system:
- Table structure: `Emp(empno, empname, basicsalary)`
- Data insertion via keyboard input
- Comprehensive employee report generation

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP8-JDBCExample/8c.png)**

### Exercise 8d: Employee Database - Update Operations
Employee record updates:
- Modify employee information by ID
- HTML/JSP interface integration

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP8-JDBCExample/8d.png)**

## 🔍 Advanced Database Operations

### Exercise 9a: Coffee Database - Delete Operations
Record deletion functionality:
- Delete coffee products by ID
- Display remaining records after deletion

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP9-JDBCExample/9a.png)**

### Exercise 9b: Coffee Database - Query Operations
Advanced querying capabilities:
- Search coffee names starting with 'D'
- Pattern-based database queries

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP9-JDBCExample/9b.png)**

### Exercise 9c: MySQL Employee Management
MySQL-specific employee operations:
- Employee data insertion
- Comprehensive reporting system
- MySQL database integration

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP9-JDBCExample/9c.jpg)**

### Exercise 9d: MySQL Conditional Deletion
Advanced deletion operations:
- Delete employees with names starting with 'ID'
- Pattern-based deletion queries
- Result reporting

**[View Output Screenshot](https://github.com/shivu-kumar/Advance-Java/blob/main/EXP9-JDBCExample/9d.jpg)**

## 🛠️ Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Apache Tomcat** server for servlet/JSP programs
- **MySQL Database** for JDBC exercises
- **IDE** (Eclipse, IntelliJ IDEA, or NetBeans recommended)
- **Web browser** for testing web applications

## 🚀 How to Run

### For Core Java Programs (Exercises 1-3):
```bash
javac ProgramName.java
java ProgramName
```

### For Swing Applications (Exercises 4-5):
```bash
javac SwingProgram.java
java SwingProgram
```

### For Servlet Programs (Exercise 6):
1. Deploy WAR file to Tomcat server
2. Start Tomcat server
3. Access via web browser: `http://localhost:8080/your-app-name`

### For JSP Programs (Exercises 7-9):
1. Place JSP files in Tomcat webapps directory
2. Configure database connection (for JDBC exercises)
3. Start Tomcat server
4. Access via web browser

## 📋 Database Setup (For JDBC Exercises)

### Coffee Table:
```sql
CREATE TABLE coffee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    coffee_name VARCHAR(100),
    price DECIMAL(10,2)
);
```

### Employee Table:
```sql
CREATE TABLE Emp (
    empno INT PRIMARY KEY,
    empname VARCHAR(100),
    basicsalary DECIMAL(10,2)
);
```

## 🤝 Contributing

Feel free to fork this repository and submit pull requests for improvements or additional exercises.

## 📝 License

This project is for educational purposes. Feel free to use and modify as needed.

---

**Note**: All screenshots and detailed outputs are available in the respective directories of this repository.
