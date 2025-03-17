DROP TABLE IF EXISTS event;

CREATE TABLE event
(
    `id`      INT         not null auto_increment primary key,
    `date`    DATE        not null,
    `user_id` INT         not null,
    `type`    VARCHAR(20) not null,
    `status`  VARCHAR(10) not null
);

insert into event (id, date, user_id, type, status)
values (1, DATE_ADD(now(), interval -1 day), 3, 'LOGIN', 'OK'),
       (2, DATE_ADD(now(), interval -20 day), 1, 'REGISTRATION', 'OK'),
       (3, DATE_ADD(now(), interval -5 day), 4, 'SOLVE_TASK', 'ERROR'),
       (4, DATE_ADD(now(), interval -8 day), 5, 'REGISTRATION', 'OK'),
       (5, DATE_ADD(now(), interval -13 day), 1, 'REGISTRATION', 'OK'),
       (6, DATE_ADD(now(), interval -23 day), 9, 'LOGIN', 'FAILED'),
       (7, DATE_ADD(now(), interval -32 day), 6, 'REGISTRATION', 'OK'),
       (8, DATE_ADD(now(), interval -8 day), 7, 'REGISTRATION', 'OK'),
       (9, DATE_ADD(now(), interval -37 day), 8, 'LOGIN', 'ERROR'),
       (10, DATE_ADD(now(), interval -69 day), 5, 'REGISTRATION', 'OK'),
       (11, DATE_ADD(now(), interval -23 day), 3, 'LOGIN', 'OK'),
       (12, DATE_ADD(now(), interval -11 day), 4, 'LOGIN', 'FAILED'),
       (13, DATE_ADD(now(), interval 0 day), 1, 'SOLVE_TASK', 'OK'),
       (14, DATE_ADD(now(), interval -39 day), 3, 'LOGIN', 'OK'),
       (15, DATE_ADD(now(), interval 0 day), 4, 'SOLVE_TASK', 'OK'),
       (16, DATE_ADD(now(), interval -9 day), 6, 'REGISTRATION', 'ERROR'),
       (17, DATE_ADD(now(), interval -1 day), 9, 'LOGIN', 'OK'),
       (18, DATE_ADD(now(), interval 0 day), 1, 'LOGIN', 'FAILED'),
       (19, DATE_ADD(now(), interval -33 day), 7, 'SOLVE_TASK', 'OK'),
       (20, DATE_ADD(now(), interval -14 day), 5, 'LOGIN', 'OK'),
       (21, DATE_ADD(now(), interval 0 day), 2, 'SOLVE_TASK', 'FAILED'),
       (22, DATE_ADD(now(), interval -22 day), 8, 'REGISTRATION', 'OK'),
       (23, DATE_ADD(now(), interval -27 day), 1, 'SOLVE_TASK', 'OK'),
       (24, DATE_ADD(now(), interval 0 day), 9, 'LOGIN', 'ERROR'),
       (25, DATE_ADD(now(), interval -8 day), 3, 'SOLVE_TASK', 'OK'),
       (26, DATE_ADD(now(), interval -25 day), 4, 'LOGIN', 'FAILED'),
       (27, DATE_ADD(now(), interval -49 day), 6, 'SOLVE_TASK', 'OK'),
       (28, DATE_ADD(now(), interval -6 day), 5, 'REGISTRATION', 'OK'),
       (29, DATE_ADD(now(), interval -1 day), 8, 'LOGIN', 'ERROR'),
       (30, DATE_ADD(now(), interval -17 day), 8, 'LOGIN', 'OK'),
       (31, DATE_ADD(now(), interval -16 day), 2, 'LOGIN', 'OK'),
       (32, DATE_ADD(now(), interval 0 day), 3, 'SOLVE_TASK', 'FAILED'),
       (33, DATE_ADD(now(), interval -2 day), 1, 'SOLVE_TASK', 'OK'),
       (34, DATE_ADD(now(), interval -1 day), 7, 'LOGIN', 'OK'),
       (35, DATE_ADD(now(), interval -24 day), 6, 'SOLVE_TASK', 'OK'),
       (36, DATE_ADD(now(), interval -33 day), 5, 'SOLVE_TASK', 'ERROR'),
       (37, DATE_ADD(now(), interval -18 day), 1, 'REGISTRATION', 'OK'),
       (38, DATE_ADD(now(), interval -29 day), 5, 'LOGIN', 'FAILED'),
       (39, DATE_ADD(now(), interval -2 day), 8, 'SOLVE_TASK', 'OK'),
       (40, DATE_ADD(now(), interval -5 day), 4, 'LOGIN', 'OK'),
       (41, DATE_ADD(now(), interval -12 day), 6, 'SOLVE_TASK', 'FAILED'),
       (42, DATE_ADD(now(), interval -22 day), 3, 'LOGIN', 'FAILED'),
       (43, DATE_ADD(now(), interval 0 day), 2, 'SOLVE_TASK', 'OK'),
       (44, DATE_ADD(now(), interval -11 day), 1, 'LOGIN', 'OK'),
       (45, DATE_ADD(now(), interval -13 day), 4, 'REGISTRATION', 'OK'),
       (46, DATE_ADD(now(), interval -30 day), 9, 'SOLVE_TASK', 'ERROR'),
       (47, DATE_ADD(now(), interval -19 day), 7, 'LOGIN', 'OK'),
       (48, DATE_ADD(now(), interval 0 day), 2, 'REGISTRATION', 'FAILED'),
       (49, DATE_ADD(now(), interval -9 day), 8, 'SOLVE_TASK', 'OK'),
       (50, DATE_ADD(now(), interval -11 day), 5, 'LOGIN', 'OK');