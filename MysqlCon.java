package JDBC;
import java.sql.*;

public class MysqlCon {
    public static void main(String[] args) {
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","rodro@12");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from user");
    while(rs.next())
    {
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    }
    conn.close();
        }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }   
}
