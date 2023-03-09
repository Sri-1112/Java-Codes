import java.util.Scanner;

public class FirAndLast {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        System.out.println("The sum of the first and last digit is "+sumFirstAndLastDigit(num));
        scan.close();
    }
    public static int sumFirstAndLastDigit(int num){
        if(num<0){
            return -1;
        }
        int last=num%10;
        int first=0;
        num/=10;
        while(num!=0){
            if(num/10==0){
                first=num%10;
            }
            num/=10;
        }
        return first+last;
    }
}
