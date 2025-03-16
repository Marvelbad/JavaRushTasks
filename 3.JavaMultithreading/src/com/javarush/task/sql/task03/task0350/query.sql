-- Write your code here:
WITH tempTable AS (SELECT AVG(grossed) AS averageGrossed FROM films),
     tempTable2 (averageYear) AS (SELECT AVG(year_released) FROM films)
SELECT title, genre, year_released, grossed
FROM films,
     tempTable,
     tempTable2
WHERE grossed > tempTable.averageGrossed
  AND year_released > tempTable2.averageYear
GROUP BY year_released;