-- Write your code here:
SELECT name, SUM(price) AS total_price
FROM cars
GROUP BY name
HAVING SUM(price) > 200000
-- ORDER by total_price DESC;