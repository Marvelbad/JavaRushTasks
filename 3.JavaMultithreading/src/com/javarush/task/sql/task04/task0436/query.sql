-- Write your code here:
SELECT LEFT(employee.position, 8)
FROM employee;

SELECT SUBSTR(position, 1, 8)
FROM employee;