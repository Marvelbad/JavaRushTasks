-- Write your code here:
SELECT *
FROM gyms
JOIN customers ON gyms.location = customers.location
WHERE gyms.location = 'London';