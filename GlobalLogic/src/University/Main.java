package University;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student[] students = new Student[100];
		
		Aplication apl = new Aplication();

		boolean isRun=true;
		
		while(isRun){
			System.out.println("1. Add student;");
			System.out.println("2. Print list student;");
			switch (sc.next()) {
			case "1":
				apl.addStudentToCourse(students, sc);
				break;
			case "2":
				apl.print(students);
				break;
			case "3":
				isRun=false;
				break;

			default:
				break;
			}
		}
}

}
