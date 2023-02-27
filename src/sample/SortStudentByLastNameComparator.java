package sample;

import java.util.Comparator;

public class SortStudentByLastNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student stud1 = (Student) o1;
		Student stud2 = (Student) o2;

		if(stud1.getLastName().compareTo(stud2.getLastName()) > 0) {
			return 1;
		}
		if(stud1.getLastName().compareTo(stud2.getLastName()) < 0) {
			return -1;
		}
		
		return 0;
	}
	
}
