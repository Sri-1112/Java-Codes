import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		SuperClass Obj=new SuperClass();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter element to check:");
		int num=scan.nextInt();
		System.out.println(Obj.isPrime(num));
		scan.close();
	}

}
