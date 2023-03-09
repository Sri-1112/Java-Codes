import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=scan.nextInt();
		//int a=1;
		for(int i=0; i<=rows; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int x=rows;x>=4;x--) {
			for(int y=0;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
		
	}
	
}
