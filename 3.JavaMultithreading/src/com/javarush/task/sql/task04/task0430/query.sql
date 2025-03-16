-- Write your code here:
SELECT YEAR(date_time)  AS year,
       MONTH(date_time) AS month,
       DAY(date_time)   AS day,
       COUNT(*)         AS event_count
FROM event
GROUP BY year, month, day
HAVING event_count > 5;