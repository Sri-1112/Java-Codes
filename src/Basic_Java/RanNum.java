import java.util.*;
public class RanNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=scan.nextInt();
		SuperClass Obj=new SuperClass();
		Obj.Roll(limit);
		scan.close();
	}
}
