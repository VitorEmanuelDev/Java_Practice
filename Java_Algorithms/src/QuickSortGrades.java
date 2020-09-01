//Class related to the Student.java class. Program that implements the quick sort algorithm
//Still working on it
public class QuickSortGrades {
	
	public static void main(String[] args) {
				
		Student Jamal = new Student("Jamal", 88);
		Student students[] = {
				new Student("Renae", 70),
				new Student("Waleed", 86),
				new Student("Luna", 89),
				new Student("Rafael", 92),
				new Student("Leonardo", 73),
				new Student("Akash", 78),
				new Student("Pogba", 71),
				new Student("Luka", 79),
				new Student("Fatou", 82),
				Jamal,
				new Student("Gabriela", 94),
				new Student("Ahmed", 80),
				new Student("Sophia", 84),
				new Student("Park", 90),
			
		};
		
		int lower = findSmaller(Jamal, students);
		
		System.out.println("There are " + lower + " lower grades.");
}
	
	private static int findSmaller(Student Jamal, Student[] students) {
		
		int lower = 0;
		
		for(Student student : students) {
						
			if(student.getGrade() < Jamal.getGrade()) {
				
				lower++;
				
			}
			
		}	
		
		return lower;
			
	}
	
}
