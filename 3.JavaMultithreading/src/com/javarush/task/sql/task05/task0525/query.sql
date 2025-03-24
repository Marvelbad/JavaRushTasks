-- Write your code here:
SELECT author.full_name, COUNT(*) AS books
FROM library.book
        RIGHT JOIN library.author ON library.book.author_id = library.author.id
GROUP BY library.author.full_name
HAVING books > 1;