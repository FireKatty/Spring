package dao;

import entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicReference;


public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student){
        // save student
        AtomicReference<Integer> result = new AtomicReference<>((Integer) this.hibernateTemplate.save(student));
        return result.get();
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
