package day3Homework;

public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("E�itmen Eklendi"+instructor.getFirstName()+instructor.getLastName());
	}
	
	public void updateInstructor(Instructor instructor) {
		System.out.println("E�itmen G�ncellendi"+instructor.getFirstName()+instructor.getLastName());
	}
	
	public void removeInstructor(Instructor instructor) {
		System.out.println("E�itmen Silindi"+instructor.getFirstName()+instructor.getLastName());
	}
	
	public void addCourse(String course) {
		System.out.println("Kurs Eklendi: "+course);
	}
	


}
