package daodemo2;

import java.sql.*;

public class StudentDAOimpl implements StudentDAO{
	Connection conn;
	String query;

	public Student getStudent(int roll) throws Exception
	{
		Student s=new Student();
		String url="jdbc:mysql://localhost:3306/primarystudent";
		String user="surya";
		String pwd="surya123";
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,user,pwd);
		s.setRoll(roll);
		query="select * from student where sroll=?";
		PreparedStatement pst=conn.prepareStatement(query);
		pst.setInt(1,roll);
		ResultSet rs=pst.executeQuery();
	
		if(rs.next())
		{
			String sname=rs.getString(1);
			String sadd=rs.getString(3);
			s.setName(sname);
			s.setAddress(sadd);
		}
		else
		{
			System.out.println("no record found");
			
		}
		
		return s;
		
		

		
		
		
	}
	public void updateStudent(int rol)
	{
		
	}

}
