-- Write your code here:
SELECT *
FROM authors
WHERE author_id NOT IN (SELECT author_id
                        FROM books
                        WHERE books.author_id = 7
                           OR title = 'War and Peace');