package Demo;

import java.sql.*;

import com.mysql.jdbc.Driver;

// 快速入门
public class Demo01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. 导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver"); //高版本MySQL的驱动是 "com.mysql.cj.jdbc.Driver"
//        DriverManager.registerDriver(new Driver());
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/db1", 
        		"root", 
        		"root");
        //4.定义sql语句
        String sql = "update stu set name = 'Lisa' where id = 1";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        stmt.executeUpdate(sql);
        
        //8.释放资源
        stmt.close();
        conn.close();
	}

}
