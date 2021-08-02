package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassTest {
	
	// 在所有方法之前会执行
	@Before
	public void init()
	{
		System.out.println("init...");
	}
	
	// 在所有方法之后会执行
	@After
	public void clost()
	{
		System.out.println("close...");
	}
	
	// 可以使非main函数执行，用于测试
	@Test
	public void testprint()
	{
		System.out.println("Hello world!");
	}
}
