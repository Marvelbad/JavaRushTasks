-- Write your code here:
SELECT MONTHNAME(date) AS month,
    COUNT(*) AS event_count
FROM event
WHERE status IN ('ERROR', 'FAILED')
GROUP BY month
ORDER BY event_count DESC;