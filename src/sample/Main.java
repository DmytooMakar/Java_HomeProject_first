package sample;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		Group group = new Group("group-1", students);
		Student student1 = new Student("Dima", "Makar", Gender.Male , 1, "group-1");
		Student student2 = new Student("Misha", "Petrov", Gender.Male , 2, "group-1");
		Student student3 = new Student("Misha", "Ivanov", Gender.Male , 3, "group-1");
		Student student4 = new Student("Misha", "Shevchenko", Gender.Male , 4, "group-1");
		Student student5 = new Student("Misha", "Val`ko", Gender.Male , 5, "group-1");
		Student student6 = new Student("Misha", "Procyshun", Gender.Male , 6, "group-1");
		Student student7 = new Student("Misha", "Ivasyk", Gender.Male , 7, "group-1");
		Student student8 = new Student("Misha", "Denus", Gender.Male , 8, "group-1");
		Student student9 = new Student("Misha", "Makov", Gender.Male , 9, "group-1");
		Student student10 = new Student("Misha", "Markiv", Gender.Male , 10, "group-1");
		Student student11 = new Student("Misha", "Masov", Gender.Male , 11, "group-1");
		
		try {
			group.addStudent(student2);
			group.addStudent(student1);
			group.addStudent(student3);
			group.addStudent(student4);
			group.addStudent(student5);
			group.addStudent(student6);
			group.addStudent(student7);
			group.addStudent(student8);
			group.addStudent(student9);
			System.out.println(group.searchStudentByLastName("Makov"));
			System.out.println(group.removeStudentByID(5));
			System.out.println(group.removeStudentByID(5));
		} catch (StudentNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(group.toString());
	}

}
