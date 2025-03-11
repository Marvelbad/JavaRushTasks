-- Write your code here:
SELECT gyms.name , gyms.location, customers.sex, customers.location
FROM gyms
JOIN customers ON gyms.location = customers.location;