package _02equals;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		//1 list 回顾
		// List内部按照放入元素的先后顺序存放，并且每个元素都可以通过索引确定自己的位置。
		// List还提供了boolean contains(Object o)方法来判断List是否包含某个指定元素。
		// int indexOf(Object o)方法可以返回某个元素的索引，如果元素不存在，就返回-1
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.contains("C")); // true
        System.out.println(list.contains("X")); // false
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("X")); // -1
        // 这里我们注意一个问题，我们往List中添加的"C"和调用contains("C")传入的"C"是不是同一个实例？
        // 如果这两个"C"不是同一个实例，这段代码是否还能得到正确的结果？我们可以改写一下代码测试一下：
        System.out.println(list.contains(new String("C"))); // true or false? ---true
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?  ---2
        // 因为我们传入的是new String("C")，所以一定是不同的实例。结果仍然符合预期，这是为什么呢？
        // 因为List内部并不是通过==判断两个元素是否相等，而是使用equals()方法判断两个元素是否相等，例如contains()方法可以实现如下
        // 要正确使用List的contains()、indexOf()这些方法，放入的实例必须正确覆写equals()方法，否则，放进去的实例，查找不到。我们之所以能正常放入String、Integer这些对象，是因为Java标准库定义的这些类已经正确实现了equals()方法。
        
        //2 equals
        List<Person> l1 = new ArrayList();
        l1.add(new Person("xiao ming"));
        l1.add(new Person("Xiao Hong"));
        l1.add(new Person("Bob"));
        System.out.println(l1.contains(new Person("Bob")));//false
        // 虽然放入了new Person("Bob")，但是用另一个new Person("Bob")查询不到，原因就是Person类没有覆写equals()方法
        // 现在在Person类中编写equals方法
        
	}
}
