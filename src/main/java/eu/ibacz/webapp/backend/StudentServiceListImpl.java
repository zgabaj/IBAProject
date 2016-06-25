/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.backend;

import eu.ibacz.webapp.entities.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
public class StudentServiceListImpl implements StudentService {

    static Map<Long, Student> students = getMapOfStudents();

    public StudentServiceListImpl() {
        if(students == null){
            students = new HashMap<Long, Student>();
        }
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student.getId());
    }

    public void updateStudent(Student student) {
        students.put(student.getId(), student);
    }

    public List showAllStudents() {
        return  new ArrayList(students.values());
    }

    public Student getById(Long id) {
        return students.get(id);
    }

    static Map<Long, Student> getMapOfStudents() {
        return students;
    }
    
    

 

}
