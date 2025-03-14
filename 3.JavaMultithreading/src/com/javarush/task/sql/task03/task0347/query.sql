-- Write your code here:
SELECT *
FROM film_directors
RIGHT JOIN (SELECT title
            FROM films AS film
            WHERE title > 1990
            ) AS result ON film_directors.id = fil
            WHERE film_directors.country = 'USA'
            LIMIT 5;