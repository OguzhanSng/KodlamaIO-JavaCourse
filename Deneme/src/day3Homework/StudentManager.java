package day3Homework;

public class StudentManager {
	
	public void addStudent(Student student) {
		System.out.println("��renci Eklendi "+student.getFirstName()+student.getLastName());
	}
	
	public void updateStudent (Student student) {
		System.out.println("��renci G�ncellendi "+student.getFirstName()+student.getLastName());
	}
	
	public void deleteStudent (Student student) {
		System.out.println("��renci Silindi "+student.getFirstName()+student.getLastName());
	}
	
	


}
