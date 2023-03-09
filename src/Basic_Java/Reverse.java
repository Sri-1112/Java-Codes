import java.util.*;

public class Reverse {
	public static void main(String[] args)
	{
		RevArrayList obj = new RevArrayList();
		Scanner myObj=new Scanner(System.in);
        System.out.println("Enter arraySize: ");
        int s = myObj.nextInt();
        int s1 = s;
        int x;
        x=s1;
		myObj.close();
		ArrayList<Integer> arrayli = new ArrayList<Integer>(s);
		for(s=0; s<x; s++) {
            System.out.println("Enter the element for index:"+ (s));
            int z = myObj.nextInt();
            arrayli.add(s, z);}

		System.out.print("Elements before reversing:");
		obj.printElements(arrayli);
		arrayli = obj.reverseArrayList(arrayli);
		System.out.print("\nElements after reversing:");
		obj.printElements(arrayli);
		myObj.close();
	}
}