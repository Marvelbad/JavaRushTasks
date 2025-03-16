-- Write your code here:
SELECT DATE(CURRENT_DATE) AS today,
       NOW() + INTERVAL 3 DAY AS future_date_time,
       NOW() - INTERVAL  3 DAY AS past_date_time;