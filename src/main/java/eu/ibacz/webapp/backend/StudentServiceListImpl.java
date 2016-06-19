/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.backend;

import eu.ibacz.webapp.entities.Student;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marek
 */
public class StudentServiceListImpl implements StudentService {

    private Map<Long, Student> students;

    public StudentServiceListImpl(Map<Long, Student> students) {
        this.students = students;
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

    public Map<Long, Student> showAllStudents() {
        return students;
    }

    public Student getById(Long id) {
        return students.get(id);
    }

 

}
