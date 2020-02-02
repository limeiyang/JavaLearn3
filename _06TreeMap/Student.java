package _06TreeMap;

public class Student {
	public String name;
	public int score;
	public Student(String name, int score) {
		this.name = name;
        this.score = score;
	}
	
	@Override
	public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}
