package eu.ibacz.webapp.backend.dao;

import eu.ibacz.webapp.entities.Student;
import java.util.List;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
public interface StudentDAO {
       
    /**
     * Add new student to the list; 
     * 
     * @param student the student to be added to the list.
    **/
    public void addStudent(Student student);

    /**
     * Return student with given id
     * 
     * @param id uniqe id of student
     * @return student with given id or null if sutch student does
     * not exist
     */
    public Student getById(Long id);
    
    
    /**
     * Remove student from the list; 
     * 
     * @param student the student to be removed from the list.
    **/
    public void removeStudent(Student student);

    /**
     * Update student in the list; 
     * 
     * @param student the student to be updated in the list.
    **/
    public void updateStudent(Student student);
    
    
    /**
     * Retuns all students stored in list; 
     * 
     * @return list of all students
    **/
    public List showAllStudents();
        
    
}
