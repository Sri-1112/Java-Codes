package DSA;

import java.util.Scanner;

public class RecDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int fact,fib,pow;
        int[] arr={1,2,2,3,4,5,2,6,7,3,7,8};
        int size= arr.length;
        int i=0;
        System.out.print("Enter numbers to calculate Factorial, Fibonacci, Base, Power:");
        fact= scan.nextInt();
        fib= scan.nextInt();
        int base= scan.nextInt();
        pow= scan.nextInt();
        System.out.println("Enter number to find first occurrence:");
        int target1= scan.nextInt();
        System.out.println("Enter number to find last occurrence:");
        int target2= scan.nextInt();
        Recursion obj=new Recursion(fact,pow,fib,arr);
        System.out.println(obj.calcFact(fact));
        System.out.println(obj.calcPower(pow,base));
        System.out.println(obj.calcFib(fib));
        System.out.println(obj.firstOcc(arr,i,size,target1));
        System.out.println(obj.lastOcc(arr,size-1,size,target2));
        scan.close();
    }
}
