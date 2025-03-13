-- Write your code here:
SELECT *
FROM authors
WHERE authors.id IN (SELECT author_id
             FROM books
             WHERE books.genre = 'fantasy');