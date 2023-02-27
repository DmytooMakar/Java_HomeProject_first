package sample;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		Group group = new Group("group-1", students);
		Student student1 = new Student("Dima", "Makar", Gender.MALE , 1, "group-1");
		Student student2 = new Student("Misha", "Petrov", Gender.MALE , 2, "group-1");
		Student student3 = new Student("Misha", "Ivanov", Gender.MALE , 3, "group-1");
		Student student4 = new Student("Misha", "Shevchenko", Gender.MALE , 4, "group-1");
		Student student5 = new Student("Misha", "Val`ko", Gender.MALE , 5, "group-1");
		Student student6 = new Student("Misha", "Procyshun", Gender.MALE , 6, "group-1");
		Student student7 = new Student("Misha", "Ivasyk", Gender.MALE , 7, "group-1");
		Student student8 = new Student("Misha", "Dens", Gender.MALE, 8, "group-1");
		Student student9 = new Student("Misha", "Makov", Gender.MALE , 9, "group-1");
		Student student10 = new Student("Misha", "Markiv", Gender.MALE , 10, "group-1");
		Student student11 = new Student("Misha", "Masov", Gender.MALE , 11, "group-1");
		
		CreateStudent createStudent = new CreateStudent();
		Student student12 = createStudent.createStudent();
		
		try {
			group.addStudent(student12);
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
			//group.sortStudentByLastName(students);
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
