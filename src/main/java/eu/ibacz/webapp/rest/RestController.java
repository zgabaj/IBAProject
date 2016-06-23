/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.rest;

import eu.ibacz.webapp.backend.StudentService;
import eu.ibacz.webapp.entities.Student;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
@Controller
public class RestController {

    @Autowired
    StudentService studentService;

    private final String GET_ALL_URL = "/student/all";
    private final String GET_STUDENT_URL = "/student/get/{id}";
    private final String UPDATE_STUDENT_URL = "/student/update";
    private final String DELETE_STUDENT_URL = "/student/delete/{id}";
    private final String ADD_STUDENT_URL = "/student/add";

    @RequestMapping(value = GET_ALL_URL, method = RequestMethod.GET)
    public @ResponseBody
    List<Student> getAllStudents() {
        return studentService.showAllStudents();
    }

    @RequestMapping(value = GET_STUDENT_URL, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getById(id);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(student);
    }

    @RequestMapping(value = ADD_STUDENT_URL, method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student,
            BindingResult result) {

        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        studentService.addStudent(student);
        return ResponseEntity.ok(student);
    }

    @RequestMapping(value = UPDATE_STUDENT_URL, method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student,
            BindingResult result) {

        if (result.hasErrors() || student.getId() == null || 
                studentService.getById(student.getId()) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        studentService.updateStudent(student);
        student = studentService.getById(student.getId());
        return ResponseEntity.ok(student);

    }

    @RequestMapping(value = DELETE_STUDENT_URL, method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id) {
        
        Student student = studentService.getById(id);
        
        if (student == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        studentService.removeStudent(student);
        return ResponseEntity.ok(student);
    }
}
