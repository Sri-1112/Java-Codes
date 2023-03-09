import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		System.out.print("Welcome to calculator\n");
		String opt;
		opt = "y";

		while(opt.equals("y")){	
			Scanner scanner=new Scanner(System.in);
			double num1, num2;
			
			System.out.print("Enter first number:");
			num1=scanner.nextDouble();

			System.out.print("Enter second number:");
			num2=scanner.nextDouble();

			System.out.print("Enter your preferred operation (+,_, *, /):");
			char operator=scanner.next().charAt(0);

			double output=0;

			switch(operator)
			{
				case'+':
					output=num1+num2;
					break;

				case'-':
					output=num1-num2;
					break;
				case'*':
					output=num1*num2;
					break;
				case'/':
					output=num1/num2;
					break;
				default:
					System.out.printf("you have entered a wrong operator!!!");
					
			}
			System.out.print(num1+" "+operator+" "+num2+" "+"="+" "+output+"\n");
			
			System.out.print("Would you like to do another calculation [y/n]:\n");
			opt=scanner.nextLine();
			
		}

	}
}

