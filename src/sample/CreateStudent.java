package sample;

import java.util.Scanner;

public class CreateStudent {
	
	public Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name student");
		String name = sc.nextLine();
		System.out.println("Enter lastname student");
		String lastname = sc.nextLine();
		System.out.println("Enter student gender");
		Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student group Name");
		String groupName = sc.nextLine();
		System.out.println("This all");
		return new Student(name, lastname, gender, id, groupName);
	}
}
