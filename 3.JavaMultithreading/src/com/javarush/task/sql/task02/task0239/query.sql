-- Write your code here:
SELECT YEAR(date_of_birth) AS year, MONTH(date_of_birth) AS month
FROM employee
WHERE MONTH(date_of_birth) IN (12, 1, 2);