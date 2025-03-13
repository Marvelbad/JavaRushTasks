-- Write your code here:
SELECT last_name
FROM film_directors
         LEFT JOIN (SELECT grossed
         FROM films AS film
         WHERE grossed > 100) AS film ON film_directors.id = film.director_id
         WHERE film_directors.country = 'UK';