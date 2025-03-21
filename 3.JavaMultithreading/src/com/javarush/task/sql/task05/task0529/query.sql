-- Write your code here:
SELECT library.author.full_name, COUNT(DISTINCT library.publisher.id) AS publishers
FROM book
         LEFT JOIN library.author ON book.author_id = author.id
         LEFT JOIN library.publisher ON publisher.id = book.publisher_id
GROUP BY author.id;