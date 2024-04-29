import java.sql.*;
class jdbcupdate
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
			Statement stmt=conn.createStatement();
			String UQuery="update annamacharya999 set name='sunny' where rnum='101'";
			int i=stmt.executeUpdate(UQuery);
			if(i>0)
			{
				System.out.println(i+"record updated");
			}
			else
			{
				System.out.println("no record updated,update operation unsuccessfully");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
