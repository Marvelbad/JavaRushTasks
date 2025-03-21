-- Write your code here:
SELECT book.publication_year,
       book.isbn,
       book.title,
       author.full_name,
       library.publisher.name
FROM book
JOIN author ON book.author_id = author.id
JOIN library.publisher ON book.publisher_id = publisher.id;