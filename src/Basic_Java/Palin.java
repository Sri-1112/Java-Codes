import java.util.*;
public class Palin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check:");
		int num=scan.nextInt();
		SuperClass Obj=new SuperClass();
		Obj.Palindrome(num);
		scan.close();
	}

}
