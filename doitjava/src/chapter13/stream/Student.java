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

	@Override // Comparable �������̽��� �߻� �޼ҵ�
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
	}

}