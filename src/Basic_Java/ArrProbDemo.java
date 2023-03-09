package Basic_Java;

import java.util.*;

public class ArrProbDemo {

	public static void main(String[] args) {
		char ch='y';
		int upArr[];
		ArrProb arr1=new ArrProb();
		Scanner scan=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size of the array(0 to size-1):");
		int size=scan.nextInt();
		arr=arr1.createArr(size);
		while(ch=='y') {
			System.out.println(arr.length);
			System.out.println("\nAvailable methods:\n");
			System.out.println("1. display an array\n");
			System.out.println("2. get index of an element\n");
			System.out.println("3. check the presence of an element\n");
			System.out.println("4. insert an element at the last position\n");
			System.out.println("5. insert an element at a specified position\n");
			System.out.println("6. delete an element from a position\n");
			System.out.println("Enter you choice: ");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Created array: "+Arrays.toString(arr));
					break;
				case 2:
					System.out.println("Enter the element to search: ");
					int val=scan.nextInt();
					boolean a=arr1.ifContains(arr, val);
					if(a==true)
						System.out.println("The element "+val+" is present in the index:"+arr1.getIndex(arr,val));
					else
						System.out.println("Enter the element present in the array"+Arrays.toString(arr));
					break;
				case 3:
					System.out.println("Enter the element to search: ");
					int search=scan.nextInt();
					boolean result=arr1.ifContains(arr,search);
					if(result==true)
						System.out.println("The element "+search+" is present in the array.");
					else
						System.out.println("The element "+search+" is not present in the array.");
					break;
				case 4:
					System.out.println("Enter the element to insert: ");
					int InstAtLast=scan.nextInt();
					upArr=arr1.instAtLast(arr,InstAtLast);
					System.out.println("Updated Array: "+Arrays.toString(upArr));
					break;
				case 5:
					System.out.println("Enter the position: ");
					int pos=scan.nextInt();
					System.out.println("Enter the element: ");
					int instAt=scan.nextInt();
					upArr=arr1.insertAt(arr,pos,instAt);
					System.out.println("Updated Array: "+Arrays.toString(upArr));
					break;
				case 6:
					System.out.println("Enter the position: ");
					int dltPos=scan.nextInt();
					upArr=arr1.dltAt(arr,dltPos);
					System.out.println("Updated Array: "+Arrays.toString(upArr));
					break;
				default:
					System.err.println("Invalid choice");
					break;}
			System.out.println("Do you want to continue...press y to continue: ");
			ch=scan.next().charAt(0);
			if(ch=='y')
				System.out.println("Do you want to continue with the same array...press 1 for yes: ");
				int arrCh=scan.nextInt();
				while(arrCh!=1) {
					System.out.println("Enter the size of the array(0 to size-1):");
					size=scan.nextInt();
					arr=arr1.createArr(size);}
			}
//		scan.close();
	}
}
