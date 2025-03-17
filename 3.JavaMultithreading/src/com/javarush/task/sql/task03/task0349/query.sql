-- Write your code here:
WITH tempTable AS (SELECT AVG(film_directors.year_born) AS averageDOB
                   FROM film_directors)
SELECT id, full_name, year_born
FROM film_directors,
     tempTable
WHERE film_directors.year_born < tempTable.averageDOB;