-- Write your code here:
SELECT is_full_time,
       COUNT(*) AS count
FROM students
GROUP BY is_full_time
ORDER BY is_full_time DESC