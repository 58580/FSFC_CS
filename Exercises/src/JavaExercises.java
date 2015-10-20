import java.util.*;
public class JavaExercises {
public static void main(String[] args)
{
	checkEligibility();

}
static void checkEligibility(){
	int age;
	Scanner sc=new Scanner (System.in);
	System.out.print("What is your age?");
    age=sc.nextInt();
    if (age>=18)
	        System.out.println("lets get married.");
    else
	        System.out.println("Hmmmmm, aren't you a bit too young?");
}
}
