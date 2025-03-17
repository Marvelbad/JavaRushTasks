-- Write your code here:
SELECT department, position, COUNT(*) AS count
FROM employee
GROUP BY department, position;