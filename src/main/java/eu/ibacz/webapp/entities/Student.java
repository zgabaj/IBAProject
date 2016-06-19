
package eu.ibacz.webapp.entities;

import java.util.Date;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Marek 
 */
public class Student {
    
    @Min(value = 0)
    @Digits(integer = 10, fraction = 0)
    @NotNull
    private Long id;
    
    @Pattern(regexp = "[a-zA-Z]*")
    @Length(min = 1, max = 60)
    private String name;
    
    @Pattern(regexp = "[a-zA-Z]*")
    @Length(min = 1, max = 60)
    private String surname;
    
    @DateTimeFormat(pattern="dd-MM-yyyy")
    @NotNull
    @Past
    private Date bornDate;
    
    @NotNull
    private GenderEnum gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    
    
    
}
