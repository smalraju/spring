package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try{

         //   Instructor tempInstructor = new Instructor("shreya","malraju","shreya.rao@gmail.com");

          //  InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/smalraju","singing");

            Instructor tempInstructor = new Instructor("Abhi","malraju","abhiram.rao@gmail.com");

            InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/abhimalraju","sleeping");

            tempInstructor.setInstructorDetail(tempInstructorDetail);

            System.out.println("Creating a session");
            session.beginTransaction();

            System.out.println("Saving instructor" + tempInstructor);
            session.save(tempInstructor);

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
