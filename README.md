# App Overview
* A very basic crud app using Spring boot, Hibernate, JPA, and MySQL for learning purposes.
  * *IDE Used: IntelliJ IDEA*

# Instructions
* Download/Clone Repo
* Launch MySQL Workbench
 * Navigate to 'src/main/resources/' and copy-paste 'db_userbase.sql' content into MySQL query
    * Execute the query (Schema, Table, and a Record will be created)
* Open app in IDE (I used IntelliJ IDEA)
 * Navigate to 'src/main/resources/' and open 'application.properties'
    * Replace '{port}' (line 3) with port # (usually 3306)
    * Replace '{username}' (line 4) and '{password}' (line 5) with correct DB connection credentials
* Launch the Server and go to 'localhost:8080'
* You should see a welcome message and couple more lines of text

# How to CRUD
* The following operations are available:
  * *create* - Takes in 2 parameters: email and name
    * Example: http://localhost:8080/create?email=atif@gmail.com&name=Atif
  * *delete* - Takes in 1 parameters: id
    * Example: http://localhost:8080/delete?id=1
  * *update* - Takes in 3 parameters: id, email, and name
    * Example: http://localhost:8080/update?id=1&email=abc@gmail.com&name=Abc
  * *getByEmail* - Takes in 1 parameters: email
    * Example: http://localhost:8080/getByEmail?email=abc@gmail.com
