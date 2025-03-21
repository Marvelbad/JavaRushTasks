-- Write your code here:
SELECT released, COUNT(*)
FROM lego.lego_set
GROUP BY released;