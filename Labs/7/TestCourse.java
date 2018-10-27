package lab7;

public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("Software Development I");
		Course course2 = new Course("Introduction to Programming");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students in " + course1.getCourseName() + " "
				+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		
		System.out.println();
		System.out.print("Number of students in " + course2.getCourseName() + " "
				+ course2.getNumberOfStudents());
	}

}
