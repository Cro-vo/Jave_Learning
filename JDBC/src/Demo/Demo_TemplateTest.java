package Demo;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo_TemplateTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		pro.load(Demo_TemplateTest.class.
				getClassLoader().
				getResourceAsStream("druid.properties"));
		JdbcTemplate template = new JdbcTemplate(
				DruidDataSourceFactory.createDataSource(pro));
		
		// 修改语句
		String sql = "update account set balance = ? where id = ?";
		template.update(sql, 3200, 4);
		
		// 查询语句-Map
//		String sql = "select * from account where id = ?";
//		Map<String, Object> map = template.queryForMap(sql, 1);
//		System.out.println(map);
		
		// 查询语句-List
//		String sql = "select * from account where id = ? or id = ?";
//		List<Map<String, Object>>list = template.queryForList(sql,1 ,2);
//		System.out.println(list);
		
		// 查询语句-JavaBean对象
//		String sql = "select * from account";
//		List<Emp1>list = template.query(sql, new BeanPropertyRowMapper<Emp1>(Emp1.class));
//		System.out.println(list);
		
		// 查询语句-封装为对象Object
//		String sql = "select count(id) from account";
//		Long cnt = template.queryForObject(sql, Long.class);
//		System.out.println(cnt);
	}

}
