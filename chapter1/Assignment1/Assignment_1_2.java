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
            PreparedStatement Ps = con.prepareStatement("insert into info(name,city) values(?,?)");
            Ps.setString(1, "Deval");
            Ps.setString(2, "Prabhatpur");
            System.out.println("Record inserted.: "+Ps.executeUpdate());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
