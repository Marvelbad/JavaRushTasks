-- Write your code here:
SELECT name
FROM lego.part
-- WHERE name REGEXP '(Slope.*Slope|Clip.*Clip)'
WHERE name LIKE '%Slope%Slope%' OR
      name LIKE '%Clip%Clip%';
