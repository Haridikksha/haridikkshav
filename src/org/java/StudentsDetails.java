package org.java;
import org.eclipseproject.NextBatchStudents;
public class StudentsDetails {

private void noOfStudents() {
	System.out.println("No of Students are 10");

}
private void nameOfStudents() {
	System.out.println("Name of Student is Meera");

}
	
public static void main(String[] args) {
	
	StudentsDetails stu = new StudentsDetails();
	stu.noOfStudents();
	stu.nameOfStudents();
	
	JavaProgramming javaPro = new JavaProgramming();
	javaPro.classOne();
	javaPro.classPurpose();
	
	NextBatchStudents gree = new NextBatchStudents();
	gree.greensTechnologieStudents();
}
}

