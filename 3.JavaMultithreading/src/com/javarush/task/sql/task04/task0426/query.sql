-- Write your code here:
SELECT YEAR(date)  AS year,
       MONTH(date) AS month,
       DAY(date)   AS day,
       SUM(total)  AS total_sum
FROM data
GROUP BY year, month, day;