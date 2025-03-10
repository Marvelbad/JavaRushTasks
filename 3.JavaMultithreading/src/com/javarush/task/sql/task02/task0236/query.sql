-- Write your code here:
SELECT department, position, COUNT(*) AS count
FROM employee
WHERE department = 'omega'
AND position = 'backend developer'
GROUP BY department, position;