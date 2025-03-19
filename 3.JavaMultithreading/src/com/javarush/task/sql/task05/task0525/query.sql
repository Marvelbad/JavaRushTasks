-- Write your code here:
SELECT author.full_name, COUNT(book.id)
FROM author
JOIN book ON book.author_id = author.id
GROUP BY author.id
HAVING COUNT(book.id) > 1;