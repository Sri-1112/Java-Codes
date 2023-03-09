import java.util.*;

public class Unique {

	public static void main(String[] args)
	{   Scanner myObj=new Scanner (System.in);
        System.out.println("Enter arraySize: ");
        int s = myObj.nextInt();
        Integer s1 = s;
        Integer x;
        x=s1;
		myObj.close();
		ArrayList<Integer> ArrList = new ArrayList<Integer>(s);
		for (s=0; s<x; s++) {
            System.out.println("Enter the element for index:"+ (s));
            int Ele = myObj.nextInt();
            ArrList.add(s, Ele);}
		System.out.println("Original ArrayList is : "
						+ ArrList);
		HashSet<Integer> hset = new HashSet<Integer>(ArrList);
		System.out.println("ArrayList Unique Values is : "+ hset);
		
	}
}