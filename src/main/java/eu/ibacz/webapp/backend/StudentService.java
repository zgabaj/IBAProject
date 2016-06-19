/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.backend;
import eu.ibacz.webapp.entities.Student;
import java.util.Map;

/**
 *
 * @author Marek
 */
public interface StudentService {
    
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
    public Map<Long, Student> showAllStudents();
        
}
