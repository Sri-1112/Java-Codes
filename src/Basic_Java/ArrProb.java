package Basic_Java;

import java.util.*;
public class ArrProb {
	Scanner scan=new Scanner(System.in);
	public int[] createArr(int size){
		int arr[] = new int[size];
		for (int i=0;i<size;i++) {
			System.out.println("Enter the element(0 or 1) for the index"+i);
			int ele=scan.nextInt();
			arr[i]=ele;}
		System.out.println("Created array: "+Arrays.toString(arr));
		return arr;}
	public int getIndex(int arr[],int val) {
		int len = arr.length;
		int i=0;
		while(i<len) {
			if(arr[i]==val)
				return i;
			else
				i+=1;
		}
		return -1;}			
	public boolean ifContains(int arr[],int val) {
		boolean result=false;
		for(int x:arr) {
			if(x==val) {
				result=true;
				break;}}
		return result;
	}
	public int[] insertAt(int arr[],int pos, int val) {
		int size=arr.length;
		size++;
		int arr1[] = new int[size];
		if(pos<size) {
			arr1=Arrays.copyOf(arr, size);
			for(int i=size-1; i>=pos;i--) {
				arr1[i]=arr1[i-1];
			}
			arr1[pos]=val;
		}
		else {
			System.out.println("Invalid position");
		}
		return arr1;
	}
	public double[] insertAtBeginning(double arr[], int val) {
		int size=arr.length;
		double arr1[]; 
		if(size==1) {
			arr1 = new double[size];
			arr1=Arrays.copyOf(arr, size);
			arr[0]=val;
			size++;
		}
		else {
			arr1 = new double[size];
			arr1=Arrays.copyOf(arr, size);
			for(int i=size-1; i>0;i--) {
			arr1[i]=arr1[i-1];
			}
			arr1[0]=val;
		}
		return arr1;
	}
	public int[] dltAt(int arr[], int pos) {
		int size=arr.length;
		int arr1[];
		for(int i=pos;i<size;i++) {
			arr[i-1]=arr[i];
		}
		arr1=Arrays.copyOf(arr, --size);
		return arr1;
	}
	public int[] instAtLast(int arr[],int val) {
		int size=arr.length;
		size++;
		int arr1[];
		arr1=Arrays.copyOf(arr, size);
		arr1[size-1]=val;
		return arr1;
	}
	public double[] instAtLast(double arr[],int val) {
		int size=arr.length;
		size++;
		double[] arr1;
		arr1=Arrays.copyOf(arr, size);
		arr1[size-1]=val;
		return arr1;
	}
	public int max2(int arr[]) {
		int first = Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>first) {
				second=first;
				first=x;
			}
			else if(x>second && x!=first){
				second=x;
			}
		}
		return second;
	}
	public int max1(int arr[]) {
		int first=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>first) {
				first=x;
			}
		}
		return first;
	}
	public int[] revArr(int arr[]) {
		int size=arr.length;
		int b[]=new int[size];
		int j=size;
		for(int x:arr) {
			b[j-1]=x;
			j--;
		}
		return b;
	}
	public void uniEle(int arr[]) {
		int n=arr.length;
	    for (int i = 0; i < n; i++) {
	    	boolean isUni=false;
	    	for (int j = 0; j < i; j++) {
	    		if (arr[i] == arr[j]) {
	    			isUni=true;
	    			break;
	    		}
	    	}
	    	if (!isUni) {
	    		System.out.print( arr[i] + " ");
	    	}
	    }
	}
	public int[] sept0n1(int arr[]) {
		int size=arr.length;
		int j=size;
		int a=0;
		int b[]=new int[size];
		for(int i=0;i<size;i++) {
			if(arr[i]==0) {
				b[a]=arr[i];
				a++;}
			else if(arr[i]==1) {
				b[j-1]=arr[i];
				j--;}
		}
		return b;
	}
}