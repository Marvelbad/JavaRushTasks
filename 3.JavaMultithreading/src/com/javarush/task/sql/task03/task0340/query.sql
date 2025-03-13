-- Write your code here:
SELECT *
FROM authors
WHERE authors.id NOT IN (SELECT author_id
                         FROM books
                         WHERE books.author_id IS NOT NULL
                           AND books.genre = 'novel');