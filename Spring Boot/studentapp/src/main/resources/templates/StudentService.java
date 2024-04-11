package templates;

import com.codegym.studentjpa.studentjpa.model.Student;
import com.codegym.studentjpa.studentjpa.repository.IStudentRepository;
import com.codegym.studentjpa.studentjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{
    @Autowired
    private IStudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
