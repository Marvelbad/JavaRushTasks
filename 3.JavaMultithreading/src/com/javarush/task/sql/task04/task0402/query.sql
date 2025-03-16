-- Write your code here:
SELECT a / NULLIF(b, 0) AS division_result,
       a * b            AS multiply_result
FROM math;