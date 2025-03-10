-- Write your code here:
SELECT department AS department_name, COUNT(*) AS count
FROm employee
WHERE position = 'frontend developer'
GROUP BY department;