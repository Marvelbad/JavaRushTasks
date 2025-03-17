-- Write your code here:
SELECT employee.name AS regular, TO_BASE64(employee.name) AS based_64
FROM employee;