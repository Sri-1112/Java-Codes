import java.util.Scanner;

public class sumOfLargestPrime {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scan.nextInt();
        System.out.println("The sum of largest prime factors from 2 to "+num+"is "+sumLargestPrime(num));
        
scan.close();
    }

    public static int sumLargestPrime(int num){
        int temp=0,sum=0;
        SuperClass superClass=new SuperClass();
        for(int i=0;i<=num;i++){
            for(int j=1;j<=i/2;j++){
                boolean b = i % j == 0 && j > temp && superClass.isPrime(j);
                if(b) {
                    temp = j;
                }
            }
            sum=sum+temp;
        }
        return sum;
    }
}
