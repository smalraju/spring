package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {
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

            int theId = 3;
            InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
            System.out.println("Temp instructor Detail" + tempInstructorDetail);
            System.out.println("Associated instructor is : " + tempInstructorDetail.getInstructor());

            System.out.println("Deleting tempInstructorDetail" + tempInstructorDetail);
            tempInstructorDetail.getInstructor().setInstructorDetail(null);
            session.delete(tempInstructorDetail);
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
