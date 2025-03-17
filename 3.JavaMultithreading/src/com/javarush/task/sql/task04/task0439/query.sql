-- Write your code here:
SELECT employee.name        AS orogonal_name,
       TRIM(employee.name)  AS trimmed_name,
       LTRIM(employee.name) AS left_trimmed_name,
       RTRIM(employee.name) AS right_trimmed_name
FROM employee;