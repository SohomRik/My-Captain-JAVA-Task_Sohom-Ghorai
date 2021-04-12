package basicsjava;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int n , a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit of Series : ");
		n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++){
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
				
		}

	}

}
