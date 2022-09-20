package sept19;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student's name.");
		Student s1 = new Student();
		s1.setName(sc.next());
		
		System.out.println("Enter the student's first grade.");
		s1.setGrade1(sc.nextInt());
		
		System.out.println("Enter the student's second grade.");
		s1.setGrade2(sc.nextInt());
		
		System.out.println("Enter the student's third grade.");
		s1.setGrade3(sc.nextInt());

		System.out.println(s1.getName() + " " +  s1.average(s1.getGrade1(), s1.getGrade2(), s1.getGrade3()));
	
		
	}
}

class Student {
	private String name;
	private int grade1;
	private int grade2;
	private int grade3;

	// Methods
	public String average(int g1, int g2, int g3) {
		int avg = (g1 + g2 + g3) / 3;

		if (avg >= 50) {
			return "passed";
		} else {
			return "failed";
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	}

