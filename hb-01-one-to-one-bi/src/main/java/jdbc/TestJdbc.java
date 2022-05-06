package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args){

       // String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimeZone=UTC";
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/hb-01-one-to-one-uni?useSSL=false&serverTimeZone=UTC";
        String user="hbstudent";
        String pass="Hbstudent@123";
        try{
            System.out.println("connecting to : "+ jdbcURL);
            Connection connection = DriverManager.getConnection(jdbcURL,user,pass);
            System.out.printf("Connection successful");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
