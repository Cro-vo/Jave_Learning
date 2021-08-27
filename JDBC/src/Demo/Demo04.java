package Demo;

import java.sql.*;
import java.util.*;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp>list = GetAll();
		System.out.println(list.size());
		System.out.println(list);
		
	}
	
	public static List<Emp> GetAll()
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Emp> list = new ArrayList<Emp>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/db1",
					"root",
					"root");
			stmt = con.createStatement();
			String sql = "select * from account";
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Emp emp = new Emp();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Double balance = rs.getDouble("balance");
				emp.setId(id);
				emp.setName(name);
				emp.setBalance(balance);
				list.add(emp);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
		
		return list;
	}

}


class Emp
{
	private int id;
	private String name;
	private double balance;
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
