package as.java.l5;

public class Grade {
public static void main(String args[]){
	char grade = 'C';
	switch(grade)
	{
	case 'A':
		System.out.println("Excellent!");
		break;
	case 'B':
	case 'C':
		System.out.println("Well done");
		break;
	case 'D':
		System.out.println("you passed");
	case'F':
		System.out.println("Better try again");
		break;
		default:
			System.out.println("Invalid grade");
			}
	System.out.println("Your grade is" + grade);
}
}


