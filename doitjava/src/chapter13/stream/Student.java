package chapter13.stream;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override // Comparable 인터페이스의 추상 메소드
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
	}

}