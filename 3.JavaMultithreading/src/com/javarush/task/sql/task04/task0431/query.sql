-- Write your code here:
SELECT DAYNAME(date) AS day_of_week,
       COUNT(*)           AS reg_count
FROM event
WHERE type = 'REGISTRATION'
GROUP BY day_of_week
ORDER BY reg_count DESC
LIMIT 1;