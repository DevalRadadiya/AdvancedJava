package demo;
import java.sql.*;

public class Demo 
{
    public static void main(String[] args) 
	{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///java_Demo","root","");
            Statement s = con.createStatement();
            System.out.println("your data is updated."+s.executeUpdate("update info set city = 'Rajkot' where name ='Deval'"));
            System.out.println("Record deleted."+s.executeUpdate("delete from info where id='5'"));
            ResultSet Rs = s.executeQuery("select * from info");
            while(Rs.next()) 
            {
                System.out.printf("%3d",Rs.getInt(1));
                System.out.printf("%20s",Rs.getString(2));
                System.out.printf("%20s\n",Rs.getString(3));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}