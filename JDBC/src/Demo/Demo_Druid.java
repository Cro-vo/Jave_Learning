package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo_Druid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		InputStream is = Demo_Druid.class.getClassLoader().getResourceAsStream("druid.properties");
		pro.load(is);
		
		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
		
		Connection con = ds.getConnection();
		System.out.println(con);
	}

}
