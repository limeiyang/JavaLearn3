package _01List;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		//1 数组
		// java数组可以用来处理一类数据集合
		String[] ss = new String[10]; // 可以持有10个String对象
		ss[0] = "Hello"; // 可以放入String对象
		String first = ss[0]; // 可以获取String对象
		//但是存在以下问题
		/*
		 * 数组初始化后大小不可变；
		   数组只能按索引顺序存取。
		 */
		//故需要Collection
		
		//2 Collection
		// Java标准库自带的java.util包提供了集合类：Collection，它是除Map外所有其他集合类的根接口。
		/*
		 * java的java.util主要提供：
		 * List： 一种有序列表的集合。
		 * Set：   一种保证没有重复元素的集合
		 * Map：   一种通过键值(key-value)查找的映射表集合
		 * 
		 * Java集合的设计有几个特点：
		 *     一：实现了接口和实现类相分离
		 *     例如：有序表的接口是List,具体的实现类有ArrayList LinkedList
		 *     二：支持泛型，我们可以限制在一个集合中只能放入同一种数据类型的元素
		 *     例如：List<String> list = new ArrayList<>(); // 只能放入String类型
		 *     三：Java访问集合总是通过统一的方式——迭代器（Iterator）来实现，它最明显的好处在于无需知道集合内部元素是按什么方式存储的。
		 *    
		 * 
		 * 几个历史遗留类，不应该被继续使用：
		 *  Hashtable：一种线程安全的Map实现；
			Vector：一种线程安全的List实现；
			Stack：基于Vector实现的LIFO的栈。
			
		   还有一小部分接口是遗留接口，也不应该继续使用：
		  Enumeration<E>：已被Iterator<E>取代。
		 */
		
		//3 List --有序链表
		//list的行为和数组几乎完全相同，List实际上是封装了数组的基本操作。
		// list 有两种实现----1 ArrayList 通过数组来实现  一般用这个
		//					2 LinkedList 通过链表来实现  指定位置添加/删除 效率高
		/*
		 * 一些基本接口方法 -- List<E>
		 *     在末尾添加一个元素：void add(E e)
			在指定索引添加一个元素：void add(int index, E e)
			删除指定索引的元素：int remove(int index)
			删除某个元素：int remove(Object e)
			获取指定索引的元素：E get(int index)
			获取链表大小（包含元素的个数）：int size()
		 * 
		 */
		
		//4 创建list
		// 4.1 可以用ArrayList和LinkedList直接创建
		List<String> l1 = new ArrayList();
		List<String> s1 = new LinkedList();
		// 4.2 还可以通过Of()接口快速创建
		// List<Integer> list = List.of(1, 2, 5);// java9新增
		
		//5 遍历List
		// 5.1 用for循环配合get
		// List<String> list = List.of("apple", "pear", "banana");
		List<String> list = new ArrayList();
		list.add("apple");
		list.add("pear");
		list.add("banana");
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.print(" "+s);
        }
        // 这种遍历方法不推荐使用 一来代码量大 二来如果是LinkedList的话效率低
        // 5.2 采用迭代器Iterator来访问list
        // Iterator对象有两个方法：boolean hasNext() 判断是否有下一个元素
        //						  E next() 返回下一个元素
        for(Iterator<String> it = list.iterator(); it.hasNext();) {
        	String s = it.next();
        	System.out.print(" "+s);
        }
        // 通过Iterator访问list永远是高效的方法，由于iterator遍历如此常用，所以，用for each 本身就会使用iterator
        /*
        for(String s1:list) {
        	System.out.print(s1);
        }
        */
        
        //6 List和Array转换
        // 6.1 List->Array 调用toArray()直接返回一个Object[]数组
        Object[] array = list.toArray();
        // 这种方法会丢失类型信息，所以实际应用很少
        // 6.2 toArray(T[])传入一个类型相同的Array List内部自动把元素复制到传入的Array中
        Integer[] array1 = list.toArray(new Integer[3]); 
        // 但是，如果我们传入类型不匹配的数组，例如，String[]类型的数组，由于List的元素是Integer，所以无法放入String数组，这个方法会抛出ArrayStoreException。
        // 如果传入的数组不够大，那么List内部会创建一个新的刚好够大的数组，填充后返回；如果传入的数组比List元素还要多，那么填充完元素后，剩下的数组元素一律填充null。
        // 实际上，最常用的是传入一个“恰好”大小的数组
        Integer[] array2 = list.toArray(new Integer[list.size()]);
        // 6.3 另一种更简洁的写法是通过List接口定义的T[] toArray(IntFunction<T[]> generator)方法
        // Integer[] array3 = list.toArray(Integer[]::new);
        // 这种函数式写法后面再学
        // 6.4 Array->List
        Integer[] array3 = {1, 2, 3};
        // List<Integer> list3 = List.of(array3);
        List<Integer> list3 = Arrays.asList(array3);//jdk11 之前的版本
        // 要注意的是，返回的List不一定就是ArrayList或者LinkedList，因为List只是一个接口，如果我们调用List.of()，它返回的是一个只读List
        // list3.add(22) //UnsupportedOperationException
        // 对只读List调用add()、remove()方法会抛出UnsupportedOperationException
	}
	
}
