-- Write your code here:
SELECT YEAR(date_of_birth) AS birth_year, COUNT(*)
FROM employee
GROUP BY birth_year;