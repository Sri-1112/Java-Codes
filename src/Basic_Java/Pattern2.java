import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=scan.nextInt();
		int i,j;
		for(i=0; i<=rows; i++) {
			for(j=2*(rows-i);j>=0;j--) {
				System.out.print("");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println("");	
		}
	}
}
