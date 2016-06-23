package eu.ibacz.webapp.backend.dao;

import eu.ibacz.webapp.entities.Student;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *
 * @author Marek Zgabaj marek.zgabaj@gmail.com
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory session;
	
    @Override
    public void addStudent(Student student) {
        session.getCurrentSession().save(student);
    }

    @Override
    public Student getById(Long id) {
        return (Student) session.getCurrentSession().get(Student.class, id);
    }

    public void removeStudent(Student student) {
        session.getCurrentSession().delete(student);
    }

    @Override
    public void updateStudent(Student student) {
        session.getCurrentSession().update(student);
    }

    @Override
    public List showAllStudents() {
        return session.getCurrentSession().createQuery("from Student").list();
    }

}
