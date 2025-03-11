-- Write your code here:
SELECT name, SUM(price) AS total_price
FROM cars
group by name