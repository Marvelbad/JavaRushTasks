-- Write your code here:
SELECT
    NOW() AS current_datetime,
    ADDTIME(NOW(), NULL) AS add_null_seconds,
    ADDTIME(NOW(), '33') AS add_33_seconds;