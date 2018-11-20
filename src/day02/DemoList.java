package day02;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * List本身不能实例化，使用子类来实现
 * @author root
 *
 */
public class DemoList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add(1);//不建议添加不同类型的对象
		System.out.println("集合中的元素数量：" + list.size());
		System.out.println(list);
		System.out.println(list.toString());
		
		list.clear();
		System.out.println("清空后集合中的元素数量：" + list.size());
		System.out.println("集合是空的吗？" + list.isEmpty());

		
	}

}
