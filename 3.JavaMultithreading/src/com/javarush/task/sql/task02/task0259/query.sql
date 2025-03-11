-- Write your code here:
SELECT position, GROUP_CONCAT(name)
FROM employee
WHERE position LIKE '%developer%'
GROUP BY position
HAVING COUNT(*) > 1;