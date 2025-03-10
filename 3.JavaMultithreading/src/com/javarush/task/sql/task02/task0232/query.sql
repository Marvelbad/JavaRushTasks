-- Write your code here:
SELECT CASE is_full_time
           WHEN is_full_time = 'yes' THEN 'Full-time students'
           WHEN is_full_time = 'no' THEN 'Part-time students'
           END  AS student_type,
       COUNT(*) AS count
FROM students
GROUP BY is_full_time