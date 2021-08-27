package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03_query {
	public static void main(String[] args) {
		Statement stmt = null;
		Connection con = null;
		
		try {
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			// 建立连接
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1",
					"root",
					"root");
			
			// 获取statement对象
			stmt = con.createStatement();
			
			// 定义mysql语句
			String sql = "SELECT * FROM account";
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+
						"-"+rs.getString(2)+
						"-"+rs.getDouble(3));				
			}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt != null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
