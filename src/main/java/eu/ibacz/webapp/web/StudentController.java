/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.web;

import eu.ibacz.webapp.backend.StudentService;
import eu.ibacz.webapp.entities.Student;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final String INPUT_JSP = "studentInput";
    private final String OUTPUT_JSP = "studentOutput";
    private final String EDIT_JSP = "studentEdit";
    private final String STUDENT_LIST_JSP = "studentsList";
    private final String DATE_FORMAT = "dd/MM/yyyy";

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String student(ModelMap model) {
        model.addAttribute("students", studentService.showAllStudents());
        return STUDENT_LIST_JSP;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String inputStudnet(ModelMap model) {
        model.addAttribute("student", new Student());
        return INPUT_JSP;

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudnet(ModelMap model,
            @Valid @ModelAttribute("student") Student student,
            BindingResult result) {

        if (result.hasErrors()) {
            return INPUT_JSP;
        }
        studentService.addStudent(student);
        model.addAttribute("students", studentService.showAllStudents());
        return STUDENT_LIST_JSP;

    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editStudnet(ModelMap model,
            @RequestParam("id") Long id) {
        formateStudent(model, id);
        return EDIT_JSP;
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public String viewStudnet(ModelMap model,
            @RequestParam("id") Long id) {
        formateStudent(model, id);
        return OUTPUT_JSP;
    }

    @RequestMapping(value = "/store", method = RequestMethod.POST, params = {"id"})
    public String storeStudnet(ModelMap model,
            @RequestParam("id") Long id,
            @Valid @ModelAttribute("student") Student student,
            BindingResult result) {

        if (result.hasErrors()) {
            return EDIT_JSP;
        }
        studentService.updateStudent(student);
        model.addAttribute("students", studentService.showAllStudents());

        return STUDENT_LIST_JSP;

    }

    private void formateStudent(ModelMap model, Long id) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        Date bornDate = studentService.getById(id).getBornDate();

        model.addAttribute("student", studentService.getById(id));
        model.addAttribute("bornDate", dateFormat.format(bornDate));
    }

}
