-- Write your code here:
SELECT prod_year,
       COUNT(*) AS count
FROM cars
GROUP BY prod_year