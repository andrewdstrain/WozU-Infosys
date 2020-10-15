# List of students classes
select concat(s.first_name, ' ', s.last_name) as 'Name', c.name as 'Class Name', c.description, c.credits
from students_courses as sc
inner join students as s, courses as c
where sc.student_id = s.id and sc.course_id = c.id
order by c.name, s.last_name, s.first_name;

# List students credits received and GPA
select s.last_name, s.first_name, sum(c.credits) as 'Total Credits', avg(sc.grade) as 'GPA'
from students_courses as sc
inner join students as s, courses as c
where sc.student_id = s.id and sc.course_id = c.id and sc.enrolled = 0
group by s.last_name, s.first_name;

