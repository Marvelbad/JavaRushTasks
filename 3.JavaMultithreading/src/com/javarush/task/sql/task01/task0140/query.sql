-- Write your code here:
SELECT ip_from, ip_to, country_name
FROM ip2country
ORDER BY ip_to DESC
LIMIT 100 OFFSET 74