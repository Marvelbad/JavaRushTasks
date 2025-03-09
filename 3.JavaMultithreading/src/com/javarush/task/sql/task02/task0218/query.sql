-- Write your code here:
SELECT CASE
           WHEN COALESCE(euro, 6) > 5 THEN 'best'
           WHEN COALESCE(euro, 6) = 5 THEN 'good'
           ELSE 'bad'
           END AS result
FROM cars