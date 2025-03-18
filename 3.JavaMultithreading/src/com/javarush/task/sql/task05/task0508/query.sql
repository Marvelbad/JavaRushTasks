-- Write your code here:
INSERT INTO author (id, first_name, last_name, full_name)
VALUES
    (10, 'John', 'Tolkien', 'J. R. R. Tolkien'),
    (11, 'Friedrich', 'Nietzsche', 'Friedrich Nietzsche'),
    (12, 'Aldous', 'Huxley', 'Aldous Huxley');

UPDATE author SET author.full_name = 'Clive Staples Lewis' WHERE full_name = 'Lewis C. S. Lewis';
UPDATE author SET author.full_name = 'John Ronald Reuel Tolkien' WHERE full_name = 'J. R. R. Tolkien';
UPDATE author SET author.full_name = 'Friedrich Wilhelm Nietzsche' WHERE full_name = 'Friedrich Nietzsche';
UPDATE author SET author.full_name = 'Stephen Edwin King' WHERE full_name = 'Stephen King Clive';
UPDATE author SET author.full_name = 'Aldous Leonard Huxley' WHERE full_name = 'Aldous Huxley';