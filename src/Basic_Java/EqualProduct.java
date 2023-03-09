import java.util.*;
public class EqualProduct {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers to verify:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(hasEqualProduct(a,b,c));
        scan.close();
    }
    public static boolean hasEqualProduct(int a, int b, int c){
        return a * b == c;
    }
}
