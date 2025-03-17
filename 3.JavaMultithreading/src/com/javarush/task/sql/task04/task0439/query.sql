-- Write your code here:
SELECT name        AS orogonal_name,
       TRIM(name)  AS trimmed_name,
       LTRIM(name) AS left_trimmed_name,
       RTRIM(name) AS right_trimmed_name
FROM employee;