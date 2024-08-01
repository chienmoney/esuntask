CREATE DATABASE IF NOT EXISTS seating_management;
CREATE USER 'user'@'%' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'user'@'%';
 FLUSH PRIVILEGES;

USE seating_management;

CREATE TABLE employee(
  emp_id VARCHAR(5) PRIMARY KEY,
  emp_name VARCHAR(100),
  email VARCHAR(100),
  floor_seat_seq INT
);
CREATE TABLE seatingchart(
  floor_seat_seq INT AUTO_INCREMENT PRIMARY KEY,
  floor_no INT,
  seat_no INT
);
