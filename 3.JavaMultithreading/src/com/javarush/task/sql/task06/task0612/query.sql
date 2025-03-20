-- Write your code here:
UPDATE employee
SET salary   = 5000,
    position = 'fullstack developer'
WHERE position LIKE '%developer%';



# SELECT position, salary
# FROM employee
# WHERE position LIKE '%developer%'
# SET salary = 5000 AND position = 'fullstack developer';