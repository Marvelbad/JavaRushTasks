-- Write your code here:
SELECT released, COUNT(*) AS total
FROM lego.lego_set
GROUP BY released
ORDER BY total DESC;