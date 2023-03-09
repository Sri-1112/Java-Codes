import java.util.Scanner;

public class hasSharedDigit {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("The two numbers have shared digits: "+ hasShareddigit(num1,num2));
        scan.close();
    }
    public static boolean hasShareddigit(int a, int b){
        int dig1=0,dig2=0;
        boolean res=false;
            if((a>=10&&a<100)&&(b>=10&&b<100)){
                dig1=a%10;
                dig2=b%10;
                a/=10;
                b/=10;
                if(dig1==dig2||dig1==b||dig2==a||a==b){
                    res= true;
                }
            }

        return res;
    }
}
