import java .util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		SuperClass Obj=new SuperClass();
		int fact=Obj.Factorial(num);
		System.out.println("The factorial of "+num+" :"+fact);
		scan.close();
	}

}
