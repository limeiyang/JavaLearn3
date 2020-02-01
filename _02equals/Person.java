package _02equals;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	public Person(String name) {
		this.name = name;
	}
	
	
	
	// ��дequals���� --��Person��name��age�����
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person) o;
			//return this.name.equals(p.name) && this.age == p.age;
			// ���������ֶαȽϣ�����ʹ��equals()�����ڻ��������ֶεıȽϣ�����ʹ��==
			// �������this.nameΪnull����ôequals()�����ᱨ����ˣ���Ҫ������д����
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
	
	// ���Person�кü����������͵��ֶΣ������д����̫�����ˡ�Ҫ���������͵ıȽϣ�����ʹ��Objects.equals()��̬����
	public boolean equalss(Object o) {
	    if (o instanceof Person) {
	        Person p = (Person) o;
	        return Objects.equals(this.name, p.name) && this.age == p.age;
	    }
	    return false;
	}
	// ʹ��Objects.equals()�Ƚ��������������Ƿ���ȵ�Ŀ����ʡȥ���ж�null���鷳�������������Ͷ���nullʱ����Ҳ����ȵ�
	
}
