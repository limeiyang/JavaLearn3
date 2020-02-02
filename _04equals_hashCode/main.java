package _04equals_hashCode;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		//1 hashMap
		Map<String, Student> map = new HashMap<>();
		map.put("a", new Student("Xiao Ming"));
		map.put("b", new Student("Xiao Hong"));
		map.put("c", new Student("Xiao Jun"));
		map.get("a"); // Student("Xiao Ming")
		map.get("x"); // null
		// HashMap之所以能根据key直接拿到value，原因是它内部通过空间换时间的方法，用一个大数组存储所有value，并根据key直接计算出value应该存储在哪个索引
		// 如果key的值为"a"，计算得到的索引总是1，因此返回value为Person("Xiao Ming")，如果key的值为"b"，计算得到的索引总是5，因此返回value为Person("Xiao Hong")，这样，就不必遍历整个数组，即可直接读取key对应的value。
		// 当我们使用key存取value的时候，就会引出一个问题：
		// 我们放入Map的key是字符串"a"，但是，当我们获取Map的value时，传入的变量不一定就是放入的那个key对象。
		// 换句话讲，两个key应该是内容相同，但不一定是同一个对象。
		String key1 = "a";
        Map<String, Integer> map1 = new HashMap<>();
        map1.put(key1, 123);

        String key2 = new String("a");
        map1.get(key2); // 123

        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
		// 因为在Map的内部，对key做比较是通过equals()实现的，这一点和List查找元素需要正确覆写equals()是一样的，即正确使用Map必须保证：作为key的对象必须正确覆写equals()方法。
        // 我们经常使用String作为key，因为String已经正确覆写了equals()方法。但如果我们放入的key是一个自己写的类，就必须保证正确覆写了equals()方法。
        // 我们再思考一下HashMap为什么能通过key直接计算出value存储的索引。相同的key对象（使用equals()判断时返回true）必须要计算出相同的索引，否则，相同的key每次取出的value就不一定对。
        // 通过key计算索引的方式就是调用key对象的hashCode()方法，它返回一个int整数。HashMap正是通过这个方法直接定位key对应的value的索引，继而直接返回value
        // 因此，正确使用Map必须保证:
        /*
	              作为key的对象必须正确覆写equals()方法，相等的两个key实例调用equals()必须返回true；
	
			作为key的对象还必须正确覆写hashCode()方法，且hashCode()方法要严格遵循以下规范：
			
			如果两个对象相等，则两个对象的hashCode()必须相等；
			如果两个对象不相等，则两个对象的hashCode()尽量不要相等。
			即对应两个实例a和b：
			
			如果a和b相等，那么a.equals(b)一定为true，则a.hashCode()必须等于b.hashCode()；
			如果a和b不相等，那么a.equals(b)一定为false，则a.hashCode()和b.hashCode()尽量不要相等。
			上述第一条规范是正确性，必须保证实现，否则HashMap不能正常工作。
			
			而第二条如果尽量满足，则可以保证查询效率，因为不同的对象，如果返回相同的hashCode()，会造成Map内部存储冲突，使存取的效率下降
         * 
         */
        // 对Person类编写equals方法和HashMap方法
		
	}
	
}
