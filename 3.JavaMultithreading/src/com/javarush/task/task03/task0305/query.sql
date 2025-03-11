-- Write your code here:
SELECT g.id, g.name, c.name, c.email
FROM gyms AS g
JOIN customers AS c ON g.name = c.name;