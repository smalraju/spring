package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorCourseDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try{

            System.out.println("Creating a session");
            session.beginTransaction();

            Instructor temp = session.get(Instructor.class,1);

            System.out.println("instructor is:" + temp);

            System.out.println("Courses:" + temp.getCourses());

            session.getTransaction().commit();
            System.out.println("Done");

            session.close();

        }
        finally{
            session.close();
            factory.close();
            System.out.println("hi");
        }
    }
}
