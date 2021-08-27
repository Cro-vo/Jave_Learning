package Demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.*;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo_C3P0 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DataSource ds = new ComboPooledDataSource();
		
		Connection con = ds.getConnection();
		System.out.println(con);
//		Statement stmt = con.createStatement();
//		String sql = "select * from account";
//		ResultSet rs = stmt.executeQuery(sql);
//		System.out.println(rs.next());
//		System.out.println(con);
	}

}
