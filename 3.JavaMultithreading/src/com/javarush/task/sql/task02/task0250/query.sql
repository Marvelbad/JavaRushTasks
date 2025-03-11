-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
WHERE position = 'frontend developer'
GROUP BY department, position
HAVING total > 1;