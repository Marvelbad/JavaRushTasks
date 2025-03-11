-- Write your code here:
SELECT YEAR(prod_date) AS prod_year,
        MONTH(prod_date) AS prod_month,
        COUNT(*) AS total
FROM cars
WHERE name = 'Black Car'
GROUP BY  prod_date, prod_month;