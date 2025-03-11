-- Write your code here:
SELECT *
FROM gyms
JOIN customers
WHERE gyms.name = customers.name;