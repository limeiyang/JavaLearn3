package _01List;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		//1 ����
		// java���������������һ�����ݼ���
		String[] ss = new String[10]; // ���Գ���10��String����
		ss[0] = "Hello"; // ���Է���String����
		String first = ss[0]; // ���Ի�ȡString����
		//���Ǵ�����������
		/*
		 * �����ʼ�����С���ɱ䣻
		   ����ֻ�ܰ�����˳���ȡ��
		 */
		//����ҪCollection
		
		//2 Collection
		// Java��׼���Դ���java.util���ṩ�˼����ࣺCollection�����ǳ�Map����������������ĸ��ӿڡ�
		/*
		 * java��java.util��Ҫ�ṩ��
		 * List�� һ�������б�ļ��ϡ�
		 * Set��   һ�ֱ�֤û���ظ�Ԫ�صļ���
		 * Map��   һ��ͨ����ֵ(key-value)���ҵ�ӳ�����
		 * 
		 * Java���ϵ�����м����ص㣺
		 *     һ��ʵ���˽ӿں�ʵ���������
		 *     ���磺�����Ľӿ���List,�����ʵ������ArrayList LinkedList
		 *     ����֧�ַ��ͣ����ǿ���������һ��������ֻ�ܷ���ͬһ���������͵�Ԫ��
		 *     ���磺List<String> list = new ArrayList<>(); // ֻ�ܷ���String����
		 *     ����Java���ʼ�������ͨ��ͳһ�ķ�ʽ������������Iterator����ʵ�֣��������Եĺô���������֪�������ڲ�Ԫ���ǰ�ʲô��ʽ�洢�ġ�
		 *    
		 * 
		 * ������ʷ�����࣬��Ӧ�ñ�����ʹ�ã�
		 *  Hashtable��һ���̰߳�ȫ��Mapʵ�֣�
			Vector��һ���̰߳�ȫ��Listʵ�֣�
			Stack������Vectorʵ�ֵ�LIFO��ջ��
			
		   ����һС���ֽӿ��������ӿڣ�Ҳ��Ӧ�ü���ʹ�ã�
		  Enumeration<E>���ѱ�Iterator<E>ȡ����
		 */
		
		//3 List --��������
		//list����Ϊ�����鼸����ȫ��ͬ��Listʵ�����Ƿ�װ������Ļ���������
		// list ������ʵ��----1 ArrayList ͨ��������ʵ��  һ�������
		//					2 LinkedList ͨ��������ʵ��  ָ��λ�����/ɾ�� Ч�ʸ�
		/*
		 * һЩ�����ӿڷ��� -- List<E>
		 *     ��ĩβ���һ��Ԫ�أ�void add(E e)
			��ָ���������һ��Ԫ�أ�void add(int index, E e)
			ɾ��ָ��������Ԫ�أ�int remove(int index)
			ɾ��ĳ��Ԫ�أ�int remove(Object e)
			��ȡָ��������Ԫ�أ�E get(int index)
			��ȡ�����С������Ԫ�صĸ�������int size()
		 * 
		 */
		
		//4 ����list
		// 4.1 ������ArrayList��LinkedListֱ�Ӵ���
		List<String> l1 = new ArrayList();
		List<String> s1 = new LinkedList();
		// 4.2 ������ͨ��Of()�ӿڿ��ٴ���
		// List<Integer> list = List.of(1, 2, 5);// java9����
		
		//5 ����List
		// 5.1 ��forѭ�����get
		// List<String> list = List.of("apple", "pear", "banana");
		List<String> list = new ArrayList();
		list.add("apple");
		list.add("pear");
		list.add("banana");
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.print(" "+s);
        }
        // ���ֱ����������Ƽ�ʹ�� һ���������� ���������LinkedList�Ļ�Ч�ʵ�
        // 5.2 ���õ�����Iterator������list
        // Iterator����������������boolean hasNext() �ж��Ƿ�����һ��Ԫ��
        //						  E next() ������һ��Ԫ��
        for(Iterator<String> it = list.iterator(); it.hasNext();) {
        	String s = it.next();
        	System.out.print(" "+s);
        }
        // ͨ��Iterator����list��Զ�Ǹ�Ч�ķ���������iterator������˳��ã����ԣ���for each ����ͻ�ʹ��iterator
        /*
        for(String s1:list) {
        	System.out.print(s1);
        }
        */
        
        //6 List��Arrayת��
        // 6.1 List->Array ����toArray()ֱ�ӷ���һ��Object[]����
        Object[] array = list.toArray();
        // ���ַ����ᶪʧ������Ϣ������ʵ��Ӧ�ú���
        // 6.2 toArray(T[])����һ��������ͬ��Array List�ڲ��Զ���Ԫ�ظ��Ƶ������Array��
        Integer[] array1 = list.toArray(new Integer[3]); 
        // ���ǣ�������Ǵ������Ͳ�ƥ������飬���磬String[]���͵����飬����List��Ԫ����Integer�������޷�����String���飬����������׳�ArrayStoreException��
        // �����������鲻������ôList�ڲ��ᴴ��һ���µĸպù�������飬���󷵻أ��������������ListԪ�ػ�Ҫ�࣬��ô�����Ԫ�غ�ʣ�µ�����Ԫ��һ�����null��
        // ʵ���ϣ���õ��Ǵ���һ����ǡ�á���С������
        Integer[] array2 = list.toArray(new Integer[list.size()]);
        // 6.3 ��һ�ָ�����д����ͨ��List�ӿڶ����T[] toArray(IntFunction<T[]> generator)����
        // Integer[] array3 = list.toArray(Integer[]::new);
        // ���ֺ���ʽд��������ѧ
        // 6.4 Array->List
        Integer[] array3 = {1, 2, 3};
        // List<Integer> list3 = List.of(array3);
        List<Integer> list3 = Arrays.asList(array3);//jdk11 ֮ǰ�İ汾
        // Ҫע����ǣ����ص�List��һ������ArrayList����LinkedList����ΪListֻ��һ���ӿڣ�������ǵ���List.of()�������ص���һ��ֻ��List
        // list3.add(22) //UnsupportedOperationException
        // ��ֻ��List����add()��remove()�������׳�UnsupportedOperationException
	}
	
}
