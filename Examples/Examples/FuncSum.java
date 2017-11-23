
import java.sql.*;  
  
public class FuncSum {  
public static void main(String[] args) throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");  
  
CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");  
stmt.setInt(2,10);  
stmt.setInt(3,43);  
stmt.registerOutParameter(1,Types.INTEGER);  
stmt.execute();  
/*
 * create or replace function sum4  
*(n1 in number,n2 in number)  
*return number  
*is   
*temp number(8);  
*begin  
*temp :=n1+n2;  
*return temp;  
*end;  
*/
 
System.out.println(stmt.getInt(1));  
}

} 
