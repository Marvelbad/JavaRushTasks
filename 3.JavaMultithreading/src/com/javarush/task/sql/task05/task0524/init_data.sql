DROP TABLE IF EXISTS book;

CREATE TABLE book
(
    `id`               int NOT NULL AUTO_INCREMENT,
    `title`            varchar(100) DEFAULT NULL,
    `author_id`        int          DEFAULT NULL,
    `publisher_id`     int          DEFAULT NULL,
    `publication_year` int          DEFAULT NULL,
    `isbn`             bigint       DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `book`
VALUES (1, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2017, 9785389052857),
       (2, 'СТРАННАЯ ИСТОРИЯ ДОКТОРА ДЖЕКИЛА И МИСТЕРА ХАЙДА', 1, 1, 2019, 9785389024007),
       (3, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2017, 9785389092983),
       (4, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2007, 9785911815196),
       (5, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2011, 9785389031173),
       (6, 'ОСТРОВ СОКРОВИЩ', 1, 1, 2015, 9785389097186),
       (7, 'ГАМЛЕТ', 5, 1, 2018, 9785389064751),
       (8, 'УКРОЩЕНИЕ СТРОПТИВОЙ', 5, 1, 2016, 9785389033900),
       (9, 'РОМЕО И ДЖУЛЬЕТТА', 5, 1, 2018, 9785389027039),
       (10, 'УКРОЩЕНИЕ СТРОПТИВОЙ', 5, 1, 2009, 9785998503160),
       (11, 'ОДИССЕЯ', 6, 1, 2018, 9785389057319),
       (12, 'ОДИССЕЯ', 6, 1, 2018, 9785389092983),
       (13, 'ИЛИАДА', 6, 1, 2018, 9785389058705),
       (14, 'ИЛИАДА', 6, 1, 2018, 9785389030800),
       (15, 'ОДИССЕЯ', 6, 1, 2014, 9785389081192),
       (16, 'ОДИССЕЯ', 6, 1, 2010, 9785998509018),
       (17, 'ИЛИАДА', 6, 1, 2014, 9785389078390),
       (18, 'ИЛИАДА', 6, 1, 2010, 9785389078390),
       (19, 'ЯНКИ ПРИ ДВОРЕ КОРОЛЯ АРТУРА', 7, 2, 2018, 9789660375383),
       (20, 'ПРИКЛЮЧЕНИЯ ТОМА СОЙЕРА', 7, 1, 2018, 9785389030978);