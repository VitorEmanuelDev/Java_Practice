//Class related to the Student.java class. Program that implements the quick sort algorithm

public class QuickSortGrades {
	
	public static void main(String[] args) {
		//I chose Lamar as the pivot and placed him as our last element on the list		
		Student Lamar = new Student("Jamal", 88);
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
				new Student("Gabriela", 94),
				new Student("Ahmed", 80),
				new Student("Sophia", 84),
				new Student("Park", 90),
				Lamar
			
		};
		
		sort(students, 0, students.length);
		//before the loop that shows the list on the console, I call the sort function
		//so when I reach the loop, it reads a sorted array
		
		for(int current = 0; current < students.length; current++) {
			
			Student student = students[current];
			System.out.println(student.getName() + " " + student.getGrade());
			
		}
		
	}

	private static int partition(Student[] students, int start, int end) {
	//this function allow to know how many people have a lower grade so we can divide the array by using
		//a pivot or point of reference
		
		int studentsWithLowerGrades = 0;
		//this variable will count the number of students who had grades lower than Lamar's
		//this will allow us to know where Lamar should be placed as a pivot with classmates having lower grades
		//on the left and classmates having higher grades on the right
		
		Student pivotStudent = students[end - 1];
		// this is Lamar's initial position before the algorithm starts to execute it's steps
		
		for(int current = 0; current < end - 1; current++) {
			
			Student currentStudent = students[current];// isolate current student as a variable so we can analyze it
			
			if(currentStudent.getGrade() <= pivotStudent.getGrade()) {
				//if the current student being analyzed has a grade lower than Lamar's
				
				swap(students, current, studentsWithLowerGrades);//put that student to the left of Lamar starting 
				//with the current position held for studentsWithLowerGrades.
				studentsWithLowerGrades++;
				//after the swap, increment the variable studentsWithLowerGrades by one
				
			}
		
		}
	
		swap(students, end - 1, studentsWithLowerGrades);
		//when this iteration ends, place Lamar right after all the students that had worst grades than him
		
		return studentsWithLowerGrades;
		//The value contained by the variable studentsWithLowerGrades now corresponds to Lamar's place on the list

		
	}
	
	private static void swap(Student[] students, int from, int to) {
		
		Student student1 = students[from];
		Student student2 = students[to];
		students[to] = student1;
		students[from] = student2;
	
	}
	
	private static void sort(Student[] students, int from, int to) {
		//after partitioning and sorting the students by grade, it's time to sort them in ascending order
		
		int elements = to - from;// by doing this, we will always be able to get the relative position from where
		//our analysis is going to run up until where it stops, but we have to make sure that subtraction is always
		//going to be above one, otherwise, it would mean we have no element to analyze on the left 
		
		if(elements > 1) {
			
			int newPivot = partition(students, from, to);
			sort(students, from, newPivot);
			sort(students, newPivot + 1, to);
		
		}
		
	}
	
}
