package eu.ibacz.webapp.backend;

import eu.ibacz.webapp.backend.dao.StudentDAO;
import eu.ibacz.webapp.entities.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */

@Service
public class StudentServiceDBImpl implements StudentService {   
   
    @Autowired
    private StudentDAO studentDAO;
    
    @Transactional
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }
    
    @Transactional
    public Student getById(Long id) {
        return studentDAO.getById(id);
    }

    @Transactional
    public void removeStudent(Student student) {
        studentDAO.removeStudent(student);
    }

    @Transactional
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Transactional
    public List showAllStudents() {
        return studentDAO.showAllStudents();
    }

}
