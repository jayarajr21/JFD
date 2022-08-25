package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositary.StudentRepositary;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepositary studentRepositary;

    public void add(Student student) {
          studentRepositary.save(student);
    }
  public void update(Student student) {
        studentRepositary.save(student);
  }
  public List<Student> view() {
       return studentRepositary.findAll();
  }
  public void delete(int id) {
        for (Student student : studentRepositary.findAll())
            if(student.getId() == id) {
                studentRepositary.delete(student);
            }
  }
}
