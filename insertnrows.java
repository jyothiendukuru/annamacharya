import java.sql.*;
import java.util.*;
class insertnrows
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.drive.OracleDrive");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		PreparedStatement pstmt=conn.prepareStatement("insert into annamacharya999 values(?,?,?)");
		Scanner in=new Scanner(System.in);
		int i=0;
		while(i<3)
		{
			System.out.println("enter record:"+i);
			System.out.println("enter student rnum");
			String rnum=in.nextLine();
			System.out.println("enter student name");
			String name=in.nextLine();
			System.out.println("enter student branch");
			String branch=in.nextLine();
			pstmt.setString(1,rnum);
			pstmt.setString(2,name);
			pstmt.setString(3,branch);
			pstmt.executeUpdate();
			i++;
		}
	}
}
