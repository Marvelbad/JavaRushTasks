-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total > 1 AND employee.position = 'frontend developer'
LIMIT 1;