-- Write your code here:
SELECT employee.name AS regular, FROM_BASE64(employee.name) AS from_based_64
FROM employee;