-- Write your code here:
SELECT CONCAT(number, ' , ', name) AS full_name
FROM lego.lego_set
ORDER BY number ASC;