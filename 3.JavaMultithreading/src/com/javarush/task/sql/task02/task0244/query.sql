-- Write your code here:
SELECT YEAR(prod_date) AS prod_year,
        MONTH(prod_date) AS prod_month,
        COUNT(*) AS total
FROM cars
WHERE name = 'Black Car' AND cars.price > 99000
GROUP BY  prod_year, prod_month;