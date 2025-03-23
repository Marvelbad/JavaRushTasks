-- Write your code here:
SELECT author.full_name, COUNT(*) AS books
FROM library.author
JOIN book ON book.author_id = author.id
GROUP BY author.full_name
HAVING books > 1;