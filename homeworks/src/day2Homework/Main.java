package day2Homework;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Kodlama io");
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�","S�f�rdan ileri seviyeye");
		Course course2=new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�","S�f�rdan ileri seviyeye");
		Course course3=new Course(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�","Ba�lang�� seviye");
		
		Category category1=new Category(1,"Programlama");
		Category category2=new Category(2,"Siber G�venlik");
					
		Course[] courses ={course1,course2,course3};
		Category[] categories= {category1,category2};
		
		System.out.println("-----------------Kurslar--------------");
		
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		System.out.println("-----------------Kategoriler--------------");
		
		for(Category category:categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("------------------------------------------");
		CourseManager courseManager =new CourseManager();
		courseManager.updateCourse(course2);
		courseManager.removeCourse(course3);		
	}	
}
