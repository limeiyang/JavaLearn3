package _02equals;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		//1 list �ع�
		// List�ڲ����շ���Ԫ�ص��Ⱥ�˳���ţ�����ÿ��Ԫ�ض�����ͨ������ȷ���Լ���λ�á�
		// List���ṩ��boolean contains(Object o)�������ж�List�Ƿ����ĳ��ָ��Ԫ�ء�
		// int indexOf(Object o)�������Է���ĳ��Ԫ�ص����������Ԫ�ز����ڣ��ͷ���-1
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.contains("C")); // true
        System.out.println(list.contains("X")); // false
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("X")); // -1
        // ��������ע��һ�����⣬������List����ӵ�"C"�͵���contains("C")�����"C"�ǲ���ͬһ��ʵ����
        // ���������"C"����ͬһ��ʵ������δ����Ƿ��ܵõ���ȷ�Ľ�������ǿ��Ը�дһ�´������һ�£�
        System.out.println(list.contains(new String("C"))); // true or false? ---true
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?  ---2
        // ��Ϊ���Ǵ������new String("C")������һ���ǲ�ͬ��ʵ���������Ȼ����Ԥ�ڣ�����Ϊʲô�أ�
        // ��ΪList�ڲ�������ͨ��==�ж�����Ԫ���Ƿ���ȣ�����ʹ��equals()�����ж�����Ԫ���Ƿ���ȣ�����contains()��������ʵ������
        // Ҫ��ȷʹ��List��contains()��indexOf()��Щ�����������ʵ��������ȷ��дequals()���������򣬷Ž�ȥ��ʵ�������Ҳ���������֮��������������String��Integer��Щ��������ΪJava��׼�ⶨ�����Щ���Ѿ���ȷʵ����equals()������
        
        //2 equals
        List<Person> l1 = new ArrayList();
        l1.add(new Person("xiao ming"));
        l1.add(new Person("Xiao Hong"));
        l1.add(new Person("Bob"));
        System.out.println(l1.contains(new Person("Bob")));//false
        // ��Ȼ������new Person("Bob")����������һ��new Person("Bob")��ѯ������ԭ�����Person��û�и�дequals()����
        // ������Person���б�дequals����
        
	}
}
