# JDBC CRUD Application

A simple Java application that demonstrates **CRUD** (Create, Read, Update, Delete) operations using **JDBC** (Java Database Connectivity). This project is console-based and designed to perform database operations efficiently with robust error handling.


## 🚀 Key Features

1. **Database Connection**  
   - Establishes a connection between the Java application and the database using JDBC.

2. **CRUD Operations**  
   - **Create**: Insert new records into the database.  
   - **Read**: Retrieve data from the database.  
   - **Update**: Modify existing records in the database.  
   - **Delete**: Remove records from the database.

3. **SQL Query Execution**  
   - Handles SQL queries directly within Java, executing appropriate commands for each operation.

4. **Console-Based Input/Output**  
   - Users interact with the application through the terminal, with results and status messages displayed accordingly.

5. **Robust Exception Handling**  
   - Ensures smooth functioning with proper error handling for SQL and connection issues.

---

## 📂 Project Structure

### 1. **JDBC Setup**  
Manages database connectivity:
- Utilizes `DriverManager` to establish connections.
- Configures database URLs, credentials, and handles connection closing.

### 2. **CRUD Operations**  
Each operation is encapsulated as a method, using SQL queries for direct interaction:
- `createRecord()`: Inserts data.  
- `readRecords()`: Retrieves data.  
- `updateRecord()`: Updates data.  
- `deleteRecord()`: Deletes data.

### 3. **Exception Handling**  
Implements robust error handling:
- Catches and processes `SQLException` for database-related issues.
- Ensures the application remains stable during errors.

---

## 💻 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/rahull0328/JDBC-Crud.git
   cd JDBC-Crud
