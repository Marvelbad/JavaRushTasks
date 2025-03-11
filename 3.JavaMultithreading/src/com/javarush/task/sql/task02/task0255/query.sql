-- Write your code here:
SELECT name,
       MIN(price) AS min_price,
       MAX(price) AS max_price
FROM cars
GROUP BY name
HAVING MAX(price) < 200000;