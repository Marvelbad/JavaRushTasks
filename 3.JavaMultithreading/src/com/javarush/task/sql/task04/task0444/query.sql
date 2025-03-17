-- Write your code here:
SELECT CONCAT(cities.city, ' - ', CHAR_LENGTH(cities.city)) AS city_length
FROM cities
ORDER BY CHAR_LENGTH(cities.city) ASC
LIMIT 3;