# Enrollment table must be dropped first because of the foreign keys
drop table if exists enrollment;
drop table if exists courses;
drop table if exists students;


create table students(
	id integer primary key,
	first_name varchar(100),
    last_name varchar(100),
    age integer
);

alter table students add email varchar(100);


create table courses(
	id integer primary key,
    title varchar(100)
);


# through (join) table
create table enrollment(
	id integer primary key,
    student_id integer,
    course_id integer,
    foreign key (student_id) references students (id),
    foreign key (course_id) references courses (id)
);
