package Basic_Java;

import java.util.*;

public class revArr {

	public static void main(String[] args) {
		ArrProb arr1=new ArrProb();
		Scanner scan=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size of the array(0 to size-1):");
		int size=scan.nextInt();
		arr=arr1.createArr(size);
		int upArr[]=arr1.sept0n1(arr);
		System.out.println("Updated array:"+Arrays.toString(upArr));
		scan.close();
	}

}
