/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.backend;

import eu.ibacz.webapp.entities.GenderEnum;
import eu.ibacz.webapp.entities.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
public class StudentBulider {
    
    private Long id;
    private String name;
    private String surname;
    private Date bornDate;
    private GenderEnum gender;
    
    public StudentBulider id(Long id){
        this.id  = id;
        return this;
    }
    
    public StudentBulider name(String name){
        this.name  = name;
        return this;
    }
    
    public StudentBulider surname(String surname){
        this.surname  = surname;
        return this;
    }
    
    public StudentBulider bornDate(Date bornDate){
        this.bornDate = bornDate;
        return this;
    }
    
    public StudentBulider bornDate(String bornDate) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.bornDate = dateFormat.parse(bornDate);
        return this;
    }
    
    public StudentBulider gender(GenderEnum gender){
        this.gender = gender;
        return this;
    }
    
    public Student build(){
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSurname(surname);
        student.setBornDate(bornDate);
        student.setGender(gender);
        return student;
    }
     
}
