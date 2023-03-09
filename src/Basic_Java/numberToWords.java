import java.util.ArrayList;
import java.util.Scanner;

public class numberToWords {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scan.nextInt();
        numberTowords(num);
        scan.close();
    }
    public static void numberTowords(int num){
        ArrayList<String> list=new ArrayList<>();
        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(num<0){
            System.out.println("-1");
            return;
        }
        int temp=num;
        while(temp!=0){
            list.add(arr[temp%10]);
            temp/=10;
        }
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
