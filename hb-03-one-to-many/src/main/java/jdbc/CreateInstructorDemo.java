package jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try{

           Instructor tempInstructor = new Instructor("shreya","malraju","shreya.rao@gmail.com");

           InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/smalraju","singing");

            tempInstructor.setInstructorDetail(tempInstructorDetail);

            System.out.println("Creating a session");
            session.beginTransaction();

            System.out.println("Saving instructor" + tempInstructor);
            session.save(tempInstructor);

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
