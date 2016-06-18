/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.web;

import eu.ibacz.webapp.entities.Student;
import java.text.SimpleDateFormat;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

/**
 *
 * @author Marek
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    
    private final String INPUT_JSP = "studentInput";
    private final String OUTPUT_JSP = "studentOutput";
    private final String DATE_FORMAT = "dd/MM/yyyy";

    @RequestMapping(method = RequestMethod.GET)
    public String student(ModelMap model){
        model.addAttribute("student", new Student());
        return INPUT_JSP;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String addStudnet(ModelMap model,
            @Valid @ModelAttribute("student") Student student,
            BindingResult result) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        
        if(result.hasErrors()){
            return INPUT_JSP;
        }
        model.addAttribute("name", student.getName());
        model.addAttribute("surname", student.getSurname());
        model.addAttribute("bornDate", dateFormat.format(student.getBornDate()));
        model.addAttribute("gender", student.getGender());
        return OUTPUT_JSP;

    }
    
}