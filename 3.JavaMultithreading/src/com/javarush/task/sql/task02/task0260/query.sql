-- Write your code here:
SELECT rating, GROUP_CONCAT(name)
FROM employee
GROUP BY rating
HAVING employee.rating > 2;