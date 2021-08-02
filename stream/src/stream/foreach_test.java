package stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class foreach_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void	forEach(Consumer<? super T> action) 遍历流
		Stream<String> s = Stream.of("张三","李四","王五","赵六");
		s.forEach((String name)->{
			System.out.println(name);
		});
		
		// Stream<T> filter(Predicate<? super T> predicate) 过滤器
		s = Stream.of("张三","李四","王五","赵六");
		s.filter((String name)->{
			return name.startsWith("张");
		});
		
		// <R> Stream<R> map(Function<? super T,? extends R> mapper) 转换格式
		s = Stream.of("1","2","3","4");
		s.map((String c)->{
			return Integer.parseInt(c);
		}).forEach((c)->{
			System.out.println(c);
		});
		
		// long	count() 返回个数
		s = Stream.of("1","2","3","4");
		long count = s.count();
		System.out.println(count);
		
		// Stream<T> limit(long maxSize) 截取个数
		s = Stream.of("张三","李四","王五","赵六");
		s.limit(2).forEach((String name)->{
			System.out.println(name);
		});
		
		// Stream<T> skip(long n) 跳过元素
		s = Stream.of("张三","李四","王五","赵六");
		s.skip(2).forEach((String name)->{
			System.out.println(name);
		});
		
		// static <T> Stream<T>	concat(Stream<? extends T> a, Stream<? extends T> b)
		// 用于流合并
		Stream<String> s1 = Stream.of("张三","李四","王五","赵六");
		Stream<String> s2 = Stream.of("1","2","3","4");
		Stream<String> stream = Stream.concat(s1, s2);
		stream.forEach((String name)->{
			System.out.println(name);
		});
		
	
	}

}
