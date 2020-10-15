drop table if exists students_courses;
drop table if exists students;
drop table if exists courses;

create table students(
    id integer primary key,
    first_name varchar(100),
    last_name varchar(100),
    credits integer             # credits needed - not total
);

create table courses(
    id integer primary key,
    name varchar(100),
    description varchar(255),
    credits integer
);

create table students_courses(
    id integer primary key,
    student_id integer,
    course_id integer,
    grade decimal(2, 1),        # when not enrolled, grade will be from 0.0 to 4.0
    enrolled integer,           # 1 - Yes, 0 - No
    foreign key (student_id) references students (id),
    foreign key (course_id) references courses (id)
);
