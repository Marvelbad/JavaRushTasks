-- Write your code here:
SELECT position, GROUP_CONCAT(name)
FROM employee
GROUP BY position
HAVING employee.position LIKE '%developer%';