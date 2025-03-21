-- Write your code here:
SELECT space.object.name,
       YEAR(discovery_date)  AS d_year,
       MONTHNAME(discovery_date) AS d_month,
       DAYNAME(discovery_date)   AS d_day
FROM space.object;