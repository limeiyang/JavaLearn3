package _04equals_hashCode;

import java.util.Objects;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person) o;
			return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int h = 0;
        h = 31 * h + firstName.hashCode();
        h = 31 * h + lastName.hashCode();
        h = 31 * h + age;
        return h;
	}
	// 注意到String类已经正确实现了hashCode()方法，我们在计算Person的hashCode()时，反复使用31*h，这样做的目的是为了尽量把不同的Person实例的hashCode()均匀分布到整个int范围。
	//和实现equals()方法遇到的问题类似，如果firstName或lastName为null，上述代码工作起来就会抛NullPointerException。为了解决这个问题，我们在计算hashCode()的时候，经常借助Objects.hash()来计算：
    /*
	int hashCode() {
	    return Objects.hash(firstName, lastName, age);
	}
	*/
}
