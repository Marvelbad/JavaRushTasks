-- Write your code here:
SELECT department AS department_name, COUNT(*) AS count
FROM employee
WHERE position = 'frontend developer'
   OR position = 'developer'
GROUP BY department;

-- WHERE position IN ('frontend developer', 'developer')