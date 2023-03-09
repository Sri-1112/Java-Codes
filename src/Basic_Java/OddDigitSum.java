import java.util.Scanner;

public class OddDigitSum {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        System.out.println("The sum of the Odd Digits is "+getOddDigitSum(num));
        scan.close();
    }
    public static int getOddDigitSum(int num){
        int sum=0;
        if (num<0){
            return -1;
        }
        while(num!=0){
            if((num%10)%2==1){
                sum+=num%10;
            }
            num/=10;
        }
        return sum;
    }
}
