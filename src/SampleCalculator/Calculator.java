package SampleCalculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		n1 = input.nextDouble();
		System.out.println("Input second number: ");
		n2 = input.nextDouble();
		
		double sum = n1+n2;
		double diff = n1-n2;
		double mul = n1*n2;
		double div = n1/n2;
		double mod = n1%n2;
		
		System.out.println("Sum: "+sum+"\nDifference: "+diff+"\nMultiplication: "+mul+
				"\nDivision: "+div+"\nReminder: "+mod);

	}

}
