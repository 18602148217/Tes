package day02;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * List������ʵ������ʹ��������ʵ��
 * @author root
 *
 */
public class DemoList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add(1);//��������Ӳ�ͬ���͵Ķ���
		System.out.println("�����е�Ԫ��������" + list.size());
		System.out.println(list);
		System.out.println(list.toString());
		
		list.clear();
		System.out.println("��պ󼯺��е�Ԫ��������" + list.size());
		System.out.println("�����ǿյ���" + list.isEmpty());

		
	}

}
