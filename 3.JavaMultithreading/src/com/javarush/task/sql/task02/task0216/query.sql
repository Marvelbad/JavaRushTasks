-- Write your code here:
SELECT CASE position
           WHEN 'backend' THEN 'yes'
           WHEN 'frontend' THEN 'yes'
           ELSE 'no'
           END AS result
FROM employee
WHERE department = 'cool devs';