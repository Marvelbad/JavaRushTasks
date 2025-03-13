-- Write your code here:
SELECT full_name
FROM film_directors
         LEFT JOIN films AS f ON film_directors.id = f.director_id
WHERE f.title IN (SELECT title
                  FROM films
                  WHERE genre = 'comedy');