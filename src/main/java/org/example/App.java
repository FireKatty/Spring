package org.example;

import dao.StudentDao;
import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("testng.xml");
        StudentDao st = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student(11,"Katty","Kanpur");
        st.toString();

//        int r = st.insert(student);
//        System.out.println("Result updated " +r);
    }
}
