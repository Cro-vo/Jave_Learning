package Demo;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.*;
import java.util.Properties;

public class Java_JDBCUtils {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /**
     * 文件的读取，只需要读取一次即可拿到这些值。使用静态代码块
     */
    static{
        //读取资源文件，获取值。

        try {
            //1. 创建Properties集合类。
            Properties pro = new Properties();

            //获取src路径下的文件的方式--->ClassLoader 类加载器
            ClassLoader classLoader = Java_JDBCUtils.class.getClassLoader();
            URL res  = classLoader.getResource("jdbc.properties");
            String path = res.getPath();
            // 防止URL编码的空格问题
            path = URLDecoder.decode(path);
//            System.out.println(URLDecoder.decode(path));
          
            pro.load(new FileReader(path));

            //3. 获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //4. 注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	
    public static Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(url, user, password);
    }
    
    public static void close(Statement stmt,Connection conn){
        if( stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if( conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void close(ResultSet rs, Statement stmt,Connection conn){
	    if( rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
        }
        if( stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if( conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
