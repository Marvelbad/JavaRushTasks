-- Write your code here:
SELECT *
FROm film_directors
         RIGHT JOIN (SELECT title, director_id, year_released
                     FROM films
                     WHERE films.year_released > 1990) AS film ON film_directors.id = film.director_id
WHERE film_directors.country = 'USA'
LIMIT 5;