package Basic_Java;

import java.util.Scanner;

public class larEle {

	public static void main(String[] args) {
		ArrProb arr1=new ArrProb();
		Scanner scan=new Scanner(System.in);
		int arr[],firLar,secLar;
		System.out.println("Enter the size of the array(0 to size-1):");
		int size=scan.nextInt();
		arr=arr1.createArr(size);
		firLar=arr1.max1(arr);
		secLar=arr1.max2(arr);
		System.out.println("The first largest element is "+firLar+".\nThe second largest element is "+secLar+".");
		scan.close();
	}

}
