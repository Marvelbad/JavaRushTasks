-- Write your code here:
SELECT YEAR(date)  AS year,
       MONTH(date) AS month,
       DAY(date)   AS day,
       COUNT(*)    AS event_count
FROM event
WHERE event.user_id = 3
  AND event.type = 'SOLVE_TASK'
  AND event.status = 'OK'
GROUP BY year, month, day;