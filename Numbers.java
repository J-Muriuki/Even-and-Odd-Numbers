package eat;

import java.util.Scanner;

public class Numbers {
	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = scanner.nextInt();
		
		
		{
	
			if(a%2==0) {
			System.out.print(a + "  is an even number" );	
			}
			else
			{
				System.out.print( a + "  is an odd number");
			}
			
		}
	}

}
