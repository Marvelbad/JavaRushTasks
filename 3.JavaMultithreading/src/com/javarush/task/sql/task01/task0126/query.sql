-- Write your code here:
SELECT brand, model, quantity, booked_quantity
FROM car
WHERE brand IN ('renault', 'opel', 'skoda', 'seat')
   OR (quantity - booked_quantity) < 10