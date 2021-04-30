import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.firstName="kubilay";
		student.lastName="tuncbas";
		student.chosenCourse="java";
		Student student2=new Student();
		student2.firstName="Ebru";
		student2.lastName="Gulluoglu";
		student2.chosenCourse="C#";
		
		Instructor instructor=new Instructor();
		instructor.firstName="Ahmet";
		instructor.lastName="Altın";
		instructor.courseName="Java";
		Instructor instructor2=new Instructor();
		instructor2.firstName="Helin";
		instructor2.lastName="Kapılı";
		instructor2.courseName="C#";
		
		
		
		
		
		UserManager userManager=new UserManager();
		userManager.Add(student);
		userManager.Add(instructor);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.AddCourse(instructor);
		instructorManager.AddCourse(instructor2);
		
		
		Instructor[] instructors= {instructor,instructor2};
		
		for(var course:instructors) {
			System.out.println(course.courseName);
			
		}
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.JoinTheCourse(student);
		studentManager.JoinTheCourse(student2);
		
		
		
		
		
		

	}

}
