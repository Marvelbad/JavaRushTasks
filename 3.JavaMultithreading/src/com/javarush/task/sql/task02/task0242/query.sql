-- Write your code here:
SELECT YEAR(date_of_birth) AS year,
       MONTH(date_of_birth) AS month,
       COUNT(*) AS employee
FROM employee
GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);