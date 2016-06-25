package eu.ibacz.webapp.backend;

import eu.ibacz.webapp.backend.dao.StudentDAO;
import eu.ibacz.webapp.entities.GenderEnum;
import eu.ibacz.webapp.entities.Student;
import java.util.Date;

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

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    
    @Transactional
    public void addStudent(Student student) {
        valide(student);
        studentDAO.addStudent(student);
    }
    
    @Transactional
    public Student getById(Long id) {
        if(id == null){
            throw new IllegalArgumentException("Id is null.");
        }
        return studentDAO.getById(id);
    }

    @Transactional
    public void removeStudent(Student student) {
        valide(student);
        studentDAO.removeStudent(student);
    }

    @Transactional
    public void updateStudent(Student student) {
        valide(student);
        studentDAO.updateStudent(student);
    }

    @Transactional
    public List showAllStudents() {
        return studentDAO.showAllStudents();
    }

    private void valide(Student student) {
        
        if(student == null){
            throw new IllegalArgumentException("Studen is null.");
        }
        
        Date bornDate = student.getBornDate();
        String name = student.getName();
        String surname =student.getSurname();
        GenderEnum gender = student.getGender();
        
        if(bornDate == null || bornDate.after(new Date())){
            throw new IllegalEntityException("Invalid born Date.");
        }
        
        if(name == null || name.length() > 60 || name.length() < 1){
            throw new IllegalEntityException("Invalid name");
        }
        
        if(surname == null || surname.length() > 60 || surname.length() < 1){
            throw new IllegalEntityException("Invalid surname");
        }
        
        if(gender == null){
            throw new IllegalEntityException("Invalid gender");
        }
    }

}
