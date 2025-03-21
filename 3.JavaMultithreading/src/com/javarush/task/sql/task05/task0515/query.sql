-- Write your code here:
SELECT name
FROM lego.part
WHERE name LIKE '%Slope%'
  AND name NOT LIKE '%45%%';