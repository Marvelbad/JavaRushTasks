-- Write your code here:
SELECT name, COUNT(*) AS car_count
FROM cars
GROUP BY name
HAVING COUNT(*) > 1;
