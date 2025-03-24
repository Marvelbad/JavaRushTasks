-- Write your code here:
SELECT CONCAT(number, ', ', name) AS full_name
FROm lego.lego_set
ORDER BY CHAR_LENGTH(name) ASC;