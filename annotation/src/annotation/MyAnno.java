package annotation;

public @interface MyAnno {
	
	int age();
	String name() default "张三";
	String[] str();
	
}
