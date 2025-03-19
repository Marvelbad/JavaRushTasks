-- Write your code here:
SELECT author.full_name, COUNT(DISTINCT publisher.id) AS publishers
FROM book
         LEFT JOIN author ON book.author_id = author.id
         LEFT JOIN publisher ON publisher.id = book.publisher_id
GROUP BY author.id;