-- Write your code here:
SELECT library.book.publication_year,
       library.book.isbn,
       library.book.title,
       library.author.full_name,
       library.publisher.name
FROM book
JOIN author ON library.book.author_id = library.author.id
JOIN library.publisher ON library.book.publisher_id = library.publisher.id;