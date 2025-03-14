-- Write your code here:
SELECT *
FROM films
         JOIN (SELECT year_born
               FROM film_directors AS director
               WHERE year_born < 1940
               ) AS result ON films.director_id = result