-- Write your code here:
SELECT DATE(CURRENT_DATE) AS today,
       NOW() + INTERVAL 3 DAY AS future_date_time,
       NOW() - INTERVAL  3 DAY AS past_date_time;




SELECT DATE(CURRENT_DATE) AS today,
       ADDDATE(NOW(),3) AS future_date_time,
       SUBDATE(NOW(),3) AS past_date_time