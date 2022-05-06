package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {
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

            Course temp = session.get(Course.class,10);

            System.out.println("Deleting course:" + temp);
            session.delete(temp);

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
