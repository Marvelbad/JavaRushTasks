-- Write your code here:
SELECT DISTINCT book.title
FROM book
         JOIN library.author ON author.id = book.author_id
WHERE author.full_name = 'Edgar Allan Poe'; -- В таблице нет такого full_name из-за предыдущей задачи...