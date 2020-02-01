package _03Map;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		//1 Map的高效查询
		Student s =new Student("Xiao Ming", 99);
		Map<String, Student> map = new HashMap<>();
		map.put("Xiao Ming", s); // 将"Xiao Ming"和Student实例映射并关联
		Student target = map.get("Xiao Ming"); // 通过key查找并返回映射的Student实例
        System.out.println(target == s); // true，同一个实例
        System.out.println(target.getScore()); // 99
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null
        
        //2 Map详解
        // 和List类似 Map也是一个接口，最常用的实现类是HashMap。
        // 如果只是想查询某个key是否存在，可以调用boolean containsKey(K key)方法。
        // 如果我们在存储Map映射关系的时候，对同一个key调用两次put()方法，分别放入不同的value，会有什么问题呢？
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 123);
        map1.put("pear", 456);
        System.out.println(map1.get("apple")); // 123
        map1.put("apple", 789); // 再次放入apple作为key，但value变为789
        System.out.println(map1.get("apple")); // 789
		// Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
        // 但是value可重复
        
        //3 遍历Map
        // 对Map来说，要遍历key可以使用for each循环遍历Map实例的keySet()方法返回的Set集合，它包含不重复的key的集合
        Map<String, Integer> map11 = new HashMap<>();
        map11.put("apple", 123);
        map11.put("pear", 456);
        map11.put("banana", 789);
        for (String key : map11.keySet()) {
            Integer value = map11.get(key);
            System.out.println(key + " = " + value);
        }
        // 同时遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射
        Map<String, Integer> map111 = new HashMap<>();
        map111.put("apple", 123);
        map111.put("pear", 456);
        map111.put("banana", 789);
        for (Map.Entry<String, Integer> entry : map111.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        // 遍历Map时，不可假设输出的key是有序的！
	}
}
