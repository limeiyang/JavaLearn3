package _08Set;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//1 Set���
		// Map���ڴ洢key-value��ӳ�䣬���ڳ䵱key�Ķ����ǲ����ظ��ģ����ң�������Ҫ��ȷ��дequals()��������Ҫ��ȷ��дhashCode()������
		// �������ֻ��Ҫ�洢���ظ���key��������Ҫ�洢ӳ���value����ô�Ϳ���ʹ��Set
		/*
		 Set���ڴ洢���ظ���Ԫ�ؼ��ϣ�����Ҫ�ṩ���¼���������

			��Ԫ����ӽ�Set<E>��boolean add(E e)
			��Ԫ�ش�Set<E>ɾ����boolean remove(Object e)
			�ж��Ƿ����Ԫ�أ�boolean contains(Object e)
		 */
		Set<String> set = new HashSet<>();
		System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false�����ʧ�ܣ���ΪԪ���Ѵ���
        System.out.println(set.contains("xyz")); // true��Ԫ�ش���
        System.out.println(set.contains("XYZ")); // false��Ԫ�ز�����
        System.out.println(set.remove("hello")); // false��ɾ��ʧ�ܣ���ΪԪ�ز�����
        System.out.println(set.size()); // 2��һ������Ԫ��
        // Setʵ�����൱��ֻ�洢key�����洢value��Map�����Ǿ�����Set����ȥ���ظ�Ԫ��
        // ��Ϊ����Set��Ԫ�غ�Map��key���ƣ���Ҫ��ȷʵ��equals()��hashCode()�����������Ԫ���޷���ȷ�ط���Set��
        // ��õ�Setʵ������HashSet��ʵ���ϣ�HashSet�����Ƕ�HashMap��һ���򵥷�װ
        
        //2 set ����
        /*
		Set�ӿڲ�����֤���򣬶�SortedSet�ӿ���֤Ԫ��������ģ�
		
		HashSet������ģ���Ϊ��ʵ����Set�ӿڣ���û��ʵ��SortedSet�ӿڣ�
		TreeSet������ģ���Ϊ��ʵ����SortedSet�ӿڡ�       

		 * 			------- HashSet
		 * 			|
		 *  Set <----
		 * 			|
		 * 			------- SortedSet  <---- TreeSet
		 */
         
        //3 Set ���
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("pear");
        set1.add("orange");
        for (String s : set1) {
            System.out.print(" "+s);
            //  banana orange apple pear
        }
        // ע�������˳��Ȳ�����ӵ�˳��Ҳ����String�����˳��
        // ��HashSet����TreeSet���ڱ���TreeSetʱ�������������ģ����˳����Ԫ�ص�����˳��
        // ʹ��TreeSet��ʹ��TreeMap��Ҫ��һ������ӵ�Ԫ�ر�����ȷʵ��Comparable�ӿڣ����û��ʵ��Comparable�ӿڣ���ô����TreeSetʱ���봫��һ��Comparator����
         
        
	}
}
