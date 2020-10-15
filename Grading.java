
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter quiz1 marks out of 10: ");
		double quiz1 = scanner.nextDouble();
		System.out.println("Enter quiz2 marks out of 10: ");
		double quiz2 = scanner.nextDouble();
		System.out.println("Enter quiz3 marks out of 10: ");
		double quiz3 = scanner.nextDouble();
		
		
		System.out.println("Enter Mid-Term exam marks out of 100: ");
		double midTerm = scanner.nextDouble();
		System.out.println("Enter final-Term exam marks out 100: ");
		double finalTerm = scanner.nextDouble();
		
		//now finding grade where 40% final, 35% of midTerma and 25% of quiz
		double quizes = ((quiz1 +quiz2 + quiz3) / 30 )*25;
		double finalExam = finalTerm * .40;
		double midExam = midTerm * .35;
		
		double totalGrade = quizes + finalExam + midExam;
		//showing output

		System.out.printf("\n\n%-20s %.2f/10\n","Quiz1 Score = ", quiz1);
		System.out.printf("%-20s %.2f/10\n","Quiz2 Score = ", quiz2);
		System.out.printf("%-20s %.2f/10\n","Quiz3 Score = ", quiz3);
		System.out.printf("%-20s %.2f/100\n","Mid-Term Score = ", midTerm);
		System.out.printf("%-20s %.2f/100\n","Final-Exam Score = ", finalTerm);
		System.out.printf("%-20s\n",showGrade(totalGrade));
		double marksObtained = quiz1 + quiz2 + quiz3 + finalTerm + midTerm;
		System.out.printf("%-20s %.2f/230\n","Total marks obtained = ",marksObtained );
		
	
	}
	
	
	static String showGrade(double totalGrade) {

		if (totalGrade >=90 ) {
			return "Grade A";
		}
		else if(totalGrade >= 80) {
			return "Grade B";
		}
		else if(totalGrade >= 70) {
			return "Grade C";
		}
		else if(totalGrade >= 60) {
			return "Grade D";
		}
		else {
			return "Grade F";
		}
		
	}
	
	

}
