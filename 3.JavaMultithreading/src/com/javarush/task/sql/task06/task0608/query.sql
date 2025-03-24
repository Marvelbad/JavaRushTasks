-- Write your code here:
UPDATE test.employee
SET salary = salary + 1000
WHERE id NOT IN (
    SELECT id
    FROM task
    WHERE exp_date < '2022-10-01'
    )

-- INSERT добавление данных!!!должно быть!!!