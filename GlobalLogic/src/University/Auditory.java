package University;

public class Auditory {

	private Cours cours;
	
	private Teacher teacher;
	
	private int auditoryNumber;

	public Auditory(Cours cours, Teacher teacher) {
		this.cours = cours;
		this.teacher = teacher;
	}
	

	public int getAuditoryNumber() {
		return auditoryNumber;
	}


	public String getTeacherName(Object arg0) {
		return teacher.getFirstName();
	}


	public String getFirstName() {
		return teacher.getFirstName();
	}


	public void setFirstName(String firstName) {
		teacher.setFirstName(firstName);
	}


	public String getSecondName() {
		return teacher.getSecondName();
	}


	public void setSecondName(String secondName) {
		teacher.setSecondName(secondName);
	}


	public int getAge() {
		return teacher.getAge();
	}


	public void setAge(int age) {
		teacher.setAge(age);
	}


	public void setAuditoryNumber(int auditoryNumber) {
		this.auditoryNumber = auditoryNumber;
	}


	public int getNumber() {
		return cours.getNumber();
	}

	public Student[] getStudents() {
		return cours.getStudents();
	}

	public int hashCode() {
		return cours.hashCode();
	}

	public void setNumber(int number) {
		cours.setNumber(number);
	}

	public void setStudents(Student[] students) {
		cours.setStudents(students);
	}

	public String toString() {
		return cours.toString();
	}
	
	
	
	
}
