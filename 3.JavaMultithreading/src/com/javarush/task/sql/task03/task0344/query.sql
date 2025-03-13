-- Write your code here:
SELECT films.title
    FROM films
LEFT JOIN (
    SELECT last_name
        FROM film_directors AS director
        WHERE last_name = 'Spielberg'
    ) AS director ON films.director_id = director_id;