package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try{


            System.out.println("Creating a session");
            session.beginTransaction();

            int theId = 2;
            InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
            System.out.println("Temp instructor Detail" + tempInstructorDetail);
            System.out.println("Associated instructor is : " + tempInstructorDetail.getInstructor());

            session.getTransaction().commit();
            System.out.println("Done");

            session.close();

        }
        catch (Exception exc){

            System.out.println("hi");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
