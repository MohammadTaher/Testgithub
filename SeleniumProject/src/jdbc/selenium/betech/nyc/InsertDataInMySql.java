package jdbc.selenium.betech.nyc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class InsertDataInMySql {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/betechdb";
        String uName ="root";
        String pwd = "password";
        Connection conn=null;
 
        try {
            Class.forName(Driver).newInstance();
            conn = DriverManager.getConnection(url, uName, pwd);
            Statement st= conn.createStatement();
//            String sql="insert into student values('Maksud Chowdhury','236598655','maksudchowdhury@gmail.com')";
            String sql="update student set studentName = 'Jahangir Majumder', email='jmajumder@noakhali.com' where cellNumber = '1254358'";
            
            st.executeUpdate(sql);
            System.out.println("Data Inserted sucessfully");
 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
    }
 
}