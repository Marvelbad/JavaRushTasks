-- Write your code here:
SELECT
    NOW() AS current_datetime,
    ADDTIME(NOW(), '00:00:00') AS add_null_seconds,
    ADDTIME(NOW(), '00:00:33') AS add_33_seconds;