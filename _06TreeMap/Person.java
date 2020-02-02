package _06TreeMap;

public class Person {
	public String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{Person:"+name+"}";
	}
}
