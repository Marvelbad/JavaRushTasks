-- Write your code here:
SELECT DISTINCT book.title
FROM book
         JOIN author ON author.id = book.author_id
WHERE author.full_name = 'Edgar Allan Poe';