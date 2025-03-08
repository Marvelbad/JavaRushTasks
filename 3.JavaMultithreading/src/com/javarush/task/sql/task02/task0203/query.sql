-- Write your code here:
UPDATE numbers
SET number1 = 1
WHERE id = 1;

SELECT IF(number1 < number2, 'yes', 'no') AS result
FROM numbers