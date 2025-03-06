-- Write your code here:
SELECT *
FROM car
WHERE (quantity - booked_quantity) BETWEEN 1 AND 100