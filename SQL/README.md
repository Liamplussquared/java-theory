1. [SQL Basics](#sql-basics)
2. [SQL Database](#sql-database)
	1. [Tables](#tables)
	2. [Constraints](#constraints)
	3. [Primary Key](#primary-key)
3. [Views](#views)


# SQL Basics
Structured Query Language 


## SELECT

```
SELECT columns 
FROM table_name
WHERE predicate
ORDER BY columns 
```

**Useful keywords:** `DISTINCT`, `COUNT`

**Operators in WHERE Clause:** =, >, <, >=, <=, <>, BETWEEN, LIKE, IN, AND, OR, NOT

**Operators for ORDER BY:** ASC, DESC

` GROUP BY columns ` useful in grouping result set by columns. 

` HAVING condition ` useful for aggregate functions, `WHERE` clause does not work with aggregate functions. 

Limiting row numbers can be achieved using different techniques depending on database system used. For *MySQL* `LIMIT` is used after `WHERE`, for `Oracle` `ROWNUM` is used as a predicate. 
`SELECT TOP` can be used on other database systems. 


## INSERT INTO

```
INSERT INTO table_name (columns)
VALUES (values)
```

Order of values should be in same order as columns in table.
```
INSERT INTO table_name
VALUES (values)
```


## UPDATE

```
UPDATE table_name
SET column = value, ...
WHERE predicate
```

UPDATE can affect one row, multiple rows or the entire table depending on the WHERE clause. 


## DELETE

```
DELETE FROM table_name
WHERE predicate 
```

DELETE can be used to delete all rows in the table while keeping the table structure. 


## Joins
Used to combines rows from multiple tables based on related column. Types of joins include: **Inner Join**, **Left (Outer) Join**, **Right (Outer) Join**, **Full Join**. Can join with more than two tables, just need to repeat `... JOIN ... ON ...`.

![Joins](https://www.w3schools.com/sql/img_rightjoin.gif)

#### Inner Join
Returns only records where there is a match between columns. 
```
SELECT columns
FROM table1
INNER JOIN table2 ON table1.column = table2.column
```

#### Left Join
Returns all records from left table and matching records in right table. May have null entries in columns.
```
SELECT columns
FROM table1
LEFT JOIN table2 ON table1.column = table2.column
```

#### Right Join
Returns all records from right table and matching 
```
SELECT columns
FROM table1
RIGHT JOIN table2 ON table1.column = table2.column
```

#### Full Join
Returns all records with match in left or right table.
```
SELECT columns
FROM table1
FULL OUTER JOIN table2 ON table1.column = table2.column
```

#### Self Join
Table is joined with itself. Aliases are used.
```
SELECT A.columns, B.columns 
FROM table AS A, table AS B
```


### Aliases 

Use `AS` keyword. Table or column can be refered to by alias given to it. 

Aliases can combines multiple columns. 

```
SELECT CustomerName, Address + ', ' + PostalCode + ' ' + City + ', ' + Country AS Address
FROM Customers;
```

Aliases are usefull when working with multiple tables, columns need to be combined, or column names are not easily readable.


### LIKE Operator 

Used in `WHERE` clauses to search for specified pattern. `_` represents a single character, `%` represents zero or more characters. 

**Examples** `WHERE name LIKE '%ee%'` returns all names that have two e's side by side. `WHERE name LIKE '___%'` matches all names that are at least three characters in length.

**Wildcard characters** differ depending on database system. 


### IN, BETWEEN

`WHERE column_name IN (value1, value2, ...)`

`WHERE column_name IN (SELECT STATEMENT)`

`WHERE column BETWEEN value1 AND value2)`

Can be used with dates, strings, numbers, ...


### UNION
Combines result sets of multiple SELECT statements. Each SELECT statement must have same number of columns, same data-types and be in the same order. `UNION` selects distinct values, `UNION ALL` selects all values. 

```
SELECT columns FROM table1 WHERE ... 
UNION 
SELECT columns from table2 WHERE ...
```


## Other useful stuff

**Comments:** Use `--` for single line, `/* ... */` for multiline.

`DISTINCT`

`IS (NOT) NULL`, `IFNULL(), ISNULL(), NVL()` allows returning of an alternative value when an expression is NULL.

`EXISTS`, `ANY`, `ALL` return true/false if condition satisfied. 

`SELECT * INTO newtable FROM oldtable` used to copy parts/all of a table.

```
INSERT INTO table2 
SELECT * FROM table1 
WHERE ...
``` 

Aggregate functions: `MAX()`, `MIN()`, `COUNT()`, `AVG()`, `SUM()`



# SQL Database

### Creating a database

`CREATE DATABASE dbName`

### Dropping a database 

` DROP DATABASE dbName`

### Backing up a database

```
BACKUP DATABASE dbName
TO DISK = 'filepath'
(WITH DIFFERENTIAL)
```

## Tables

### Creating
```
CREATE TABLE table_name (
	column1 datatype,
	column2 datatype,
	...
);
```


### Dropping/Truncating
` DROP TABLE table_name ` deletes entire table.

`TRUNCATE TABLE table_name` deletes data, preserves structure.


### Altering Table
```
ALTER TABLE table_name
ADD column_name datatype
DROP COLUMN column_name
ALTER COLUMN column_name datatype
```

### Constraints
`NOT NULL` column cannot have NULL value.

`UNIQUE` all values in column must be different.

`PRIMARY KEY` uniquely identifies each row.

`FOREIGN KEY` uniquely identifies row in another table.

`CHECK` check values pass condition

`DEFAULT` assign default value instead of NULL values

`INDEX` used to create/retrieve data efficiently. 


#### Can name Constraints
```
CREATE TABLE table_name (
	...
	CONSTRAINT constraint_name CONS_TYPE (...)
);
```

```
ALTER TABLE table_name
ADD CONSTRAINT ... 
```


#### Primary Key
Primary keys uniquely identify rows in a table. A table can only have one PK. 
Primary keys added just like other constraints and can be named.


#### Foreign Key
A Foriegn Key is a Primary Key from another table. 

Adding a Foriegn Key to a table is done via:
```
CREATE TABLE table_name (
	...
	FORIEGN KEY (fk_name) REFERENCES table2(fk_name)
); 
```


# Views
A view is a virtual table based on result-set of SQL statement.

```
CREATE VIEW view_name AS
SELECT columns
FROM table_name
WHERE condition;
```

`DROP VIEW view_name`, `CREATE OR REPLACE VIEW ...`