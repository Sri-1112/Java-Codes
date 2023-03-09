package DSA;

import java.util.Scanner;

class BinarySearch {
    public int binSearch(int arr[], int left, int right, int target){
        if (right>=left){
            int mid=left+(right-left)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]>target) return binSearch(arr,left, mid-1,target);
            else return binSearch(arr,mid+1,right,target);
            }
        else return -1;
        }
}
public class BinSearch {
    public static void main(String[] args) {
        BinarySearch test=new BinarySearch();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int right=arr.length-1;
        int left=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter element to search:");
        int target= scan.nextInt();
        int res= test.binSearch(arr,left,right,target);
        if (res==-1) System.out.println("Element not found");
        else System.out.println("The element "+target+" is found at index: "+res);
        scan.close();
    }

}
