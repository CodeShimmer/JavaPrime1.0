import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class DatabaseConnection 
{
	
	Connection c;
	Statement s;
	PreparedStatement p;
	String name,password,gender;
	ResultSet r;
	CallableStatement cs;
	int number;
	int count=1;
	
	public void CreateConnection()
	{
		try
		{
			
			//Normal Statement
			

/*
               Class.forName("com.mysql.jdbc.Driver");
			   c=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	*/	 
	            //Driver(Predefined Class)
		/*	
		 
               Class.forName("oracle.jdbc.driver.OracleDriver");
			   c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			   s=c.createStatement();
			   s.execute("insert into bank values('john',21,'male')");
		
		*/
			   
			//  PreparedStatement
			
			/*
	        
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   //Class.forName("com.mysql.jdbc.Driver");
			   c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			   p=c.prepareStatement("insert into bank values(?,?,?)");
			   
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter name");
			   name=sc.next();
			   System.out.println("Enter age");
			   number=sc.nextInt();
			   System.out.println("Enter Gender");
			   gender=sc.next();
			   
			   p.setString(1,name);
			   p.setInt(2,number);
			   p.setString(3,gender);
			   p.executeUpdate();
			
		*/
			/*
			//calling stored procedure from java application
			   
		      
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		       c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		       cs=c.prepareCall("{CALL myprocedure}");
		       cs.execute();
		    */
		       /* commands for sql command prompt
				 * Create or replace procedure myprocedure as
				 * 2 begin
				 * 3 insert into bank values('varsha',21,'female');
				 * 4 end;
				 * 5 /
				*/
		       
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		    cs=c.prepareCall("{CALL myprocedure1(?)}");
		    //cs.setString(1,"rakesh");
			cs.setInt(1,42);
			cs.execute();
			
		       /* commands for sql command prompt
				 * Create or replace procedure myprocedure1(ag number) as
				 * 2 begin
				 * 3 insert into bank values('keerthi',ag,'female');
				 * 4 end;
				 * 5 /
				*/
			
			////calling in parameterized procedure
			///////
			/*
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		       c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		       cs=c.prepareCall("{CALL inprocedure(?)}");
			   cs.setInt(1,32);
			   //cs.setInt(1,1004);
			   cs.execute();
			   */
		     //////////////////////////////////////////////////////////////////////////  
			
		       
		       
			//Creating Normal ResultSet
		/*
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			s=c.createStatement();
			r=s.executeQuery("select * from bank");
			
			while(r.next())
			{
			   System.out.println(r.getString(1)+"   "+r.getInt(2)+"   "+r.getString(3));	
			}
			
		
		*/	
			// Creating Scrollable ResultSet
			
	/*
  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		r=s.executeQuery("select * from bank");
		System.out.println("Third Record");
		r.absolute(3);
		//r.updateInt(1,1010);
		//r.updateRow();
			   
		System.out.println(r.getString(1)+"  "+r.getInt(2)+"  "+r.getString(3));
		System.out.println("First Record");
		r.absolute(1);
		System.out.println(r.getString(1)+"  "+r.getInt(2)+"  "+r.getString(3));
		  
	 
	 */
			// Creating Updatable ResultSet
			
		
           /* 
			  Class.forName("oracle.jdbc.driver.OracleDriver");
		      c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		      s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		      r=s.executeQuery("select age from bank");
		      r.absolute(2);
		      r.updateInt(1,23);//here 1 stands for column index, since we have age in column 1 where column(0,2) are of string(varchar type) 
		      r.updateRow(); 
	        */
	   
	   
			  
		}
		catch(ClassNotFoundException cl)
		{
			System.out.println(cl.getMessage());
		}
		catch(SQLException sq)
		{
		   System.out.println(sq.getMessage());
		}
		
	}
	public static void main(String args[])
	{
		DatabaseConnection dc=new DatabaseConnection();
		dc.CreateConnection();
	}
	

}
