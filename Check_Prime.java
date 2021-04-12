package basicsjava;

import java.util.Scanner;
public class Check_Prime {

	public static void main(String[] args) {
		int n , count = 0 , temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check : ");
		n = sc.nextInt();
		temp = n ;
		System.out.println("You entered : "+n);
		
		for(int i = 1 ; i<=n ; i++){
			
			if(n%i==0)
			{
				count++;
			}
			
		}
		
		if(count==2)
		{
			System.out.println("The number "+temp+" is Prime number");
		}
		else{
			System.out.println("The number "+temp+" is not a Prime number");
		}

	}

}
