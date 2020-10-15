insert into students values
    (1, 'Bob', 'Smith', 63),
    (2, 'Jane', 'Doe', 65),
    (3, 'Jill', 'Smith', 63);

insert into courses values
    (1, 'Java 101', 'Cras tristique hendrerit orci ut maximus. Morbi aliquam.', 3),
    (2, 'Java 201', 'Sed congue a metus id pretium. Suspendisse iaculis.', 3),
    (3, 'Java 301', 'Cras lobortis augue rhoncus, pharetra dolor in, faucibus.', 6),
    (4, 'Fundamentals of Computing', 'Curabitur et libero suscipit, scelerisque enim nec, accumsan.', 1);

insert into students_courses values
    (1, 1, 1, 4.0, 0),
    (2, 1, 2, 4.0, 0),
    (3, 1, 3, null, 1),
    (4, 1, 4, 0.0, 0),
    (5, 2, 1, 4.0, 0),
    (6, 2, 2, 4.0, 0),
    (7, 2, 4, 4.0, 0),
    (8, 3, 4, 4.0, 0),
    (9, 3, 1, null, 1)
