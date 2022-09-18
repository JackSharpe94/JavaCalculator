package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	public static void main(String[] args)
		throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number");
		int number1 = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter second number");
		int number2 = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter operand, +. - . / or *");
		char operand = reader.readLine().charAt(0);
		
		
		int result = calculateNumber(number1, number2, operand);
		System.out.println(number1 + " " + operand + " " + number2 + " = " + result);
	}

	public static int calculateNumber(int num1, int num2, char operand) {
		if (operand == '+') {
			return num1 + num2;
		} 
		else if(operand == '-') {
			return num1 - num2;
		}
		else if(operand == '/') {
			return num1 / num2;
		}
		else if(operand == '*') {
			return num1 * num2;
		}
		else {
			return 0;
		}
	}
}
