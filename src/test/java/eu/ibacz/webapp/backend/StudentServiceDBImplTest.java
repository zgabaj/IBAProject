/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ibacz.webapp.backend;


import eu.ibacz.webapp.entities.GenderEnum;
import eu.ibacz.webapp.entities.Student;
import java.text.ParseException;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */

public class StudentServiceDBImplTest {
    
    private StudentServiceDBImpl studentService;
    
    @Before
    public void setUp() {
        studentService = new StudentServiceDBImpl();

    }
    
    private StudentBulider frStudentBuilder() throws ParseException{
        return new StudentBulider()
                .id(null)
                .bornDate("11/05/1999")
                .name("Marek")
                .surname("Zgabaj")
                .gender(GenderEnum.MALE);
                
    }
    @Test(expected = IllegalArgumentException.class)
    public void getNullId(){
        studentService.getById(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void addNullStudent(){
        studentService.addStudent(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void updateNullStudent(){
        studentService.updateStudent(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deleteNullStudent(){
        studentService.removeStudent(null);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void addInvalidDateStudent() throws ParseException{
        Student s = frStudentBuilder().bornDate("11/11/2050").build();
        studentService.addStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void addInvalidNameStudent() throws ParseException{
        Student s = frStudentBuilder().name("").build();
        studentService.addStudent(s);
    }
    
    
    @Test(expected = IllegalEntityException.class)
    public void addInvalidSurnameStudent() throws ParseException{
        Student s = frStudentBuilder().surname("").build();
        studentService.addStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void addNullGender() throws ParseException{
        Student s = frStudentBuilder().gender(null).build();
        studentService.addStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void updateInvalidDateStudent() throws ParseException{
        Student s = frStudentBuilder().bornDate("11/11/2050").build();
        studentService.updateStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void updateInvalidNameStudent() throws ParseException{
        Student s = frStudentBuilder().name("").build();
        studentService.updateStudent(s);
    }
    
    
    @Test(expected = IllegalEntityException.class)
    public void updateInvalidSurnameStudent() throws ParseException{
        Student s = frStudentBuilder().surname("").build();
        studentService.updateStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void updateNullGender() throws ParseException{
        Student s = frStudentBuilder().gender(null).build();
        studentService.updateStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void deleteInvalidDateStudent() throws ParseException{
        Student s = frStudentBuilder().bornDate("11/11/2050").build();
        studentService.removeStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void removeInvalidNameStudent() throws ParseException{
        Student s = frStudentBuilder().name("").build();
        studentService.removeStudent(s);
    }
    
    
    @Test(expected = IllegalEntityException.class)
    public void removeInvalidSurnameStudent() throws ParseException{
        Student s = frStudentBuilder().surname("").build();
        studentService.removeStudent(s);
    }
    
    @Test(expected = IllegalEntityException.class)
    public void removeNullGender() throws ParseException{
        Student s = frStudentBuilder().gender(null).build();
        studentService.removeStudent(s);
    }
    
    
    
}
