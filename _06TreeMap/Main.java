package _06TreeMap;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// HashMap��һ���Կռ任ʱ���ӳ�������ʵ��ԭ��������ڲ���Key������ģ�������HashMap��Keyʱ����˳���ǲ���Ԥ��ģ���ÿ��Key�������һ���ҽ�����һ�Σ���
		// ����һ��Map�������ڲ����Key������������Map����SortedMap��ע�⵽SortedMap�ǽӿڣ�����ʵ������TreeMap
		/*
		 * 			------- HashMap
		 * 			|
		 *  Map <----
		 * 			|
		 * 			------- SortedMap  <---- TreeMap
		 */
		// SortedMap��֤����ʱ��Key��˳���������������磬�����Key��"apple"��"pear"��"orange"��������˳��һ����"apple"��"orange"��"pear"����ΪStringĬ�ϰ���ĸ����
		Map<String, Integer> map = new TreeMap<>();
	    map.put("orange", 1);
	    map.put("apple", 2);
	    map.put("pear", 3);
	    for (String key : map.keySet()) {
	        System.out.println(key);
	    }
	    // apple, orange, pear
	    
	    // Comparable
	    // ʹ��TreeMapʱ�������Key����ʵ��Comparable�ӿڡ�String��Integer��Щ���Ѿ�ʵ����Comparable�ӿڣ���˿���ֱ����ΪKeyʹ�á���ΪValue�Ķ�����û���κ�Ҫ��
	    // �����ΪKey��classû��ʵ��Comparable�ӿڣ���ô�������ڴ���TreeMapʱͬʱָ��һ���Զ��������㷨
	    Map<Person, Integer> map1 = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map1.put(new Person("Tom"), 1);
        map1.put(new Person("Bob"), 2);
        map1.put(new Person("Lily"), 3);
        for (Person key : map1.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(map1.get(new Person("Bob"))); // 2
        // ע�⵽Comparator�ӿ�Ҫ��ʵ��һ���ȽϷ�����������Ƚϴ��������Ԫ��a��b�����a<b���򷵻ظ�����ͨ����-1�����a==b���򷵻�0�����a>b���򷵻�������ͨ����1��TreeMap�ڲ����ݱȽϽ����Key��������
        // ����������ִ�н����֪����ӡ��Keyȷʵ�ǰ���Comparator�����˳������ġ����Ҫ����Key����Value�����ǿ��Դ���һ��new Person("Bob")��ΪKey�����᷵�ض�Ӧ��Integerֵ2��
        // ���⣬ע�⵽Person�ಢδ��дequals()��hashCode()����ΪTreeMap��ʹ��equals()��hashCode()
        
        // ������Student�࣬���÷���score�������򣬸߷���ǰ
        Map<Student, Integer> map11 = new TreeMap<>(new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map11.put(new Student("Tom", 77), 1);
        map11.put(new Student("Bob", 66), 2);
        map11.put(new Student("Lily", 99), 3);
        for (Student key : map11.keySet()) {
            System.out.println(key);
        }
        System.out.println(map11.get(new Student("Bob", 66))); // null?  --null
        // ��forѭ���У�����ȷʵ�õ�����ȷ��˳�򡣵��ǣ�������������ͬ��Key��new Student("Bob", 66)���в���ʱ�����Ϊnull��
        // ����������У�TreeMap�������⣬ԭ����ʵ�������Comparator��
        // ��p1.score��p2.score����ȵ�ʱ�����ķ���ֵ����ȷ�ģ����ǣ���p1.score��p2.score��ȵ�ʱ������û�з���0�������ΪʲôTreeMap������������ԭ��TreeMap�ڱȽ�����Key�Ƿ����ʱ������Key��compareTo()��������Comparator.compare()������������Key���ʱ�����뷵��0����ˣ��޸Ĵ�������
        /*
         *  public int compare(Student p1, Student p2) {
			    if (p1.score == p2.score) {
			        return 0;
			    }
			    return p1.score > p2.score ? -1 : 1;
			}
         */
        // ����ֱ�ӽ���Integer.compare(int, int)Ҳ���Է�����ȷ�ıȽϽ��
        
        
	}
	

}
