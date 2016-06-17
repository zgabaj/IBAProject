/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.web;

import eu.ibacz.webapp.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 *
 * @author Marek
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    
    private final String INPUT_JSP = "studentInput";
    private final String OUTPUT_JSP = "studentOutput";

    @RequestMapping(method = RequestMethod.GET)
    public String student(ModelMap model){
        model.addAttribute("student", new Student());
        return INPUT_JSP;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String addStudnet(ModelMap model,
            @ModelAttribute("student") Student student) {

        model.addAttribute("name", student.getName());
        model.addAttribute("surname", student.getSurname());
        model.addAttribute("bornDate", student.getBornDate());
        model.addAttribute("gender", student.getGender());
        return OUTPUT_JSP;

    }
    
}