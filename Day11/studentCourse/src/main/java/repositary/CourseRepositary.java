package repositary;

import model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositary extends JpaRepository<Course, Integer> {
}
