package University;

import java.util.Scanner;

public class Aplication {
	
	Student[] students = new Student[100];
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	public void addStudentToCourse(Student[] students, Scanner sc){
	for (int i = 0; i < students.length; i++) {
		System.out.println("Enter name: ");
		String firstName = sc.next();
		System.out.println("Enter secondName: ");
		String secondName = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		students[i]=new Student(firstName, secondName, age);
		System.out.println("You whon to add one more student y/n?");
		String ansver = sc.next();
		if(ansver.equals("n")){
			return;
		}
		}
	}
	
	public void print(Student[] students){
		try {
			for (Student student : students) {
				System.out.println(student.toString());
				}
		} catch (NullPointerException e) {
			System.out.println("Groupe is not full");
		}
		
	}
	

	
	}

