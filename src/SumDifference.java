import java.util.Scanner;

public class SumDifference {
	public static void main (String[] arg)
	{
		Scanner input = new Scanner(System.in);
	
		int a;
		int b;
		int sum;
		int dif;
		int mul;
		int remDiv;
		int Div;
		
		System.out.print("Enter value: ");
		a = input.nextInt();
		System.out.print("Enter value: ");
		b = input.nextInt();
		sum = a + b;
		System.out.println("Sum = " + sum);
		
		dif = a - b;
		System.out.println("Difference = " + dif);
		
		mul = a * b;
		System.out.println("Multiplay = " + mul);
		
		remDiv = a % b;
		System.out.println("Remainder of Div = " + remDiv);
		
		Div = a / b;
		System.out.println("Division = " + Div);
		
		input.close();
		
	}

}
