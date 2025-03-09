-- Write your code here:
SELECT IF(position = 'manager' AND salary > 10000, 'good',
          IF(position <> 'manager' AND salary > 5000, 'good',
             'bad')) AS category
FROM employee
WHERE city LIKE 'London'