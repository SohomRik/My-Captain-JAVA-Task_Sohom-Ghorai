package basicsjava;
import java.util.Scanner;
public class Voting_Eligibility {

	public static void main(String[] args) {
	int age , dif ;
	String usr;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your Name :  ");
	usr = sc.nextLine();
	System.out.println("Enter your age : ");
	age = sc.nextInt();
	
	dif = 18-age;
	
	if (age>=18)
	{
		System.out.println("Congratulations "+usr+ " You are eligible for voting . ");
		
	}
	else if(dif == 1)
	{
		System.out.println("Hey "+usr+" Sorry you are not yet eligible , you have to wait "+dif+" year only.");
	}
	else
	{
		System.out.println("Hey "+usr+" Sorry you are not yet eligible , you have to wait "+dif+" more years.");
	}
	}

}
