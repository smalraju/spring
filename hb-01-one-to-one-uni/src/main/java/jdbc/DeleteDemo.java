package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
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


            int theId=1;
            Instructor tempInstructor= session.get(Instructor.class,theId);
            System.out.println("Instructor found: " +tempInstructor);

            if(tempInstructor!=null){
                System.out.println("Deleting instructor" + tempInstructor);
                session.delete(tempInstructor);
            }
            session.getTransaction().commit();
            System.out.println("Done");

            session.close();

        }
        catch (Exception exc){
            factory.close();
            System.out.println("hi");
        }
    }
}
