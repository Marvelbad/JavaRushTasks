-- Write your code here:
SELECT cities.city
FROM cities
ORDER BY LENGTH(city) DESC
LIMIT 3;