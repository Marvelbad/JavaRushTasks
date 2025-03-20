-- Write your code here:
UPDATE employee
SET salary = salary + 1000
WHERE employee_id IN (
    SELECT e.employee_id
    FROM employee AS e
    LEFT JOIN task AS t ON e.employee_id = t.employee_id
    AND t.exp_date = '2022-10-01'
    WHERE t.employee IS NULL
    );