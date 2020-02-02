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
	// ע�⵽String���Ѿ���ȷʵ����hashCode()�����������ڼ���Person��hashCode()ʱ������ʹ��31*h����������Ŀ����Ϊ�˾����Ѳ�ͬ��Personʵ����hashCode()���ȷֲ�������int��Χ��
	//��ʵ��equals()�����������������ƣ����firstName��lastNameΪnull���������빤�������ͻ���NullPointerException��Ϊ�˽��������⣬�����ڼ���hashCode()��ʱ�򣬾�������Objects.hash()�����㣺
    /*
	int hashCode() {
	    return Objects.hash(firstName, lastName, age);
	}
	*/
}
