-- Write your code here:
SELECT full_name
FROM film_directors
         LEFT JOIN (SELECT title, director_id
                    FROM films
                    WHERE films.genre = 'comedy') AS f ON film_directors.id = f.director_id;