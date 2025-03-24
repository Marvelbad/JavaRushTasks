-- Write your code here:
SELECT library.author.full_name, COUNT(DISTINCT library.publisher.id) AS publishers
FROM book
         RIGHT JOIN library.author ON library.book.author_id = library.author.id
         RIGHT JOIN library.publisher ON library.publisher.id = library.book.publisher_id
GROUP BY library.author.id;

-- Получить всех авторов которые имеют издаталей. Если издателей нет то ноль!