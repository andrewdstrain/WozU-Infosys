select concat(st.first_name, ' ', st.last_name) as name, c.title
from enrollment as e
inner join courses as c, students as st where e.course_id = c.id and e.student_id = st.id;
