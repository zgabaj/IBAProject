/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.web;

import eu.ibacz.webapp.backend.StudentServiceListImpl;
import eu.ibacz.webapp.entities.Student;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import org.springframework.web.WebApplicationInitializer;


/**
 *
 * @author Marek
 */

public class StartupListener implements WebApplicationInitializer {
    
    private  Map<Long, Student> students = new HashMap<Long, Student>();
 
    @Override
    public void onStartup(ServletContext container) {
        StudentServiceListImpl studentManager= new  StudentServiceListImpl(students);
        container.setAttribute("studentManager", studentManager);
        
    }
    
}
