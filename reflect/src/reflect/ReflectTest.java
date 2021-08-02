package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 创建Peoperties集合
		Properties pro = new Properties();
		
		// 获取src下的配置文件pro.properties
		//    获取当前文件的类加载器,通过加载器加载文件
		ClassLoader classLoader = ReflectTest.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("pro.properties");
		
		// 把数据加载到pro中
		pro.load(is);
		
		// 获取配置文件的信息
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		
		// 使用反射调用类的方法
		Class cls = Class.forName(className);
		Object obj = cls.getConstructor().newInstance();
		Method method = cls.getMethod(methodName);
		method.invoke(obj);
		
	}

}
