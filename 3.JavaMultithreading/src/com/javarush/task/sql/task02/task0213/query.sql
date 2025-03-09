-- Write your code here:
SELECT CASE is_full_time
           WHEN 1 THEN true
           WHEN 0 THEN false
           ELSE NULL
           END AS result
FROM students