package eu.ibacz.webapp.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import eu.ibacz.webapp.rest.JsonDateDeserializer;
import eu.ibacz.webapp.rest.JsonDateSerializer;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
@JsonAutoDetect
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "[a-zA-Z]*")
    @Length(min = 1, max = 60)
    @NotNull
    private String name;

    @Pattern(regexp = "[a-zA-Z]*")
    @Length(min = 1, max = 60)
    @NotNull
    private String surname;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    @Past
    private Date bornDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    public Student() {
    }

    public Student(Long id, String name, String surname,
            Date bornDate, GenderEnum gender) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
        this.gender = gender;
    }

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

    @JsonSerialize(using=JsonDateSerializer.class)    
    public Date getBornDate() {
        return bornDate;
    }

    @JsonDeserialize(using=JsonDateDeserializer.class)    
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
