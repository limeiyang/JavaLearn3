package _02equals;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	public Person(String name) {
		this.name = name;
	}
	
	
	
	// 编写equals方法 --即Person的name和age都相等
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person) o;
			//return this.name.equals(p.name) && this.age == p.age;
			// 对于引用字段比较，我们使用equals()，对于基本类型字段的比较，我们使用==
			// 但是如果this.name为null，那么equals()方法会报错，因此，需要继续改写如下
			boolean nameEquals = false;
			if(this.name == null && p.name == null) {
				nameEquals = true;
			}
			if(this.name != null) {
				nameEquals = this.name.equals(p.name);
			}
			return nameEquals && this.age == p.age;
		}
		return false;
	}
	
	// 如果Person有好几个引用类型的字段，上面的写法就太复杂了。要简化引用类型的比较，我们使用Objects.equals()静态方法
	public boolean equalss(Object o) {
	    if (o instanceof Person) {
	        Person p = (Person) o;
	        return Objects.equals(this.name, p.name) && this.age == p.age;
	    }
	    return false;
	}
	// 使用Objects.equals()比较两个引用类型是否相等的目的是省去了判断null的麻烦。两个引用类型都是null时它们也是相等的
	
}
