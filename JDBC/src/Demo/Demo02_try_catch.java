package Demo;

import java.sql.*;


public class Demo02_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
//			String sql = "INSERT INTO account VALUES(NULL, '赵六', 3000)"; //新增
			String sql = "UPDATE account SET balance = 2400 WHERE id=2"; // 修改
//			String sql = "DELETE FROM account WHERE id=5"; // 删除
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			if (count>0)
			{
				System.out.println("操作成功");
			}
			else
			{
				System.out.println("操作失败");
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
