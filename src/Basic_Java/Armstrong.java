import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SuperClass Obj=new SuperClass();
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		Obj.Armstrong(num);
		scan.close();
	}

}
