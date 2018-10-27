package lab7;

public class Course {
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
		
	public Course(String courseName) {
		this.courseName = courseName;
		}
	
	public void addStudent(String student) {
	students[numberOfStudents] = student;
	numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
		}
	public String[] getStudents() {
		return students;
		}
	
	public int getNumberOfStudents() {
		return this.numberOfStudents;
		}
				
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if(student.equalsIgnoreCase(students[i])) {
				students[i] = null;
				while (i < numberOfStudents) {
					students[i] = students[i + 1];
					i++;
				}
				break;
				}
			}
	}
		public void clear() {
			students = new String[25];
			numberOfStudents = 0;
		}
		
		public Object clone() {
	        Course course = null;
	        try {
	            course = (Course)super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        course.students = students.clone();
	        course.courseName = new String(courseName);

	        return course;
	    }

	}
		
		

