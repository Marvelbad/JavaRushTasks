-- Write your code here:
SELECT book.publication_year,
       book.isbn,
       book.title,
       author.full_name,
       publisher.name
FROM book
JOIN author ON book.author_id = author.id
JOIN publisher ON book.publisher_id = publisher.id;