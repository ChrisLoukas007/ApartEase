/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package apartease;
import java.sql.*;



public interface DBConnection
{
    default Statement connectdata() throws Exception
    {
        try{  
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3307/aparteasedb", "root", "Andra2012@");  //here master is database name, root is username and password  
                Statement stmt=con.createStatement();  
                return stmt;
            }
        catch(Exception e)
        {
            throw e;
        }  
    }
    static Connection getConnection()
    {
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/aparteasedb", "root", "Andra2012@");
		}catch(Exception e){System.out.println(e);}
		return con;
    }
}
