import java.util.*;

public class arr2Ddemo {

	public static void main(String[] args) {
		twoDArr arr2=new twoDArr();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the row for mat1:");
		int row1=scan.nextInt();
		System.out.println("Enther the length of the column for mat1:");
		int column1=scan.nextInt();
		int mat1[][]=arr2.create2DArr(row1,column1);
		//System.out.println(Arrays.deepToString(arr2D));
		System.out.println("Enter the length of the row for mat2:");
		int row2=scan.nextInt();
		System.out.println("Enther the length of the column for mat2:");
		int column2=scan.nextInt();
		int mat2[][]=arr2.create2DArr(row2,column2);
		System.out.println("\nMat1:");
		for(int x[]:mat1) {
			System.out.println(Arrays.toString(x));}
		System.out.println("\nMat2:");
		for(int x[]:mat2) {
			System.out.println(Arrays.toString(x));}
		System.out.println("\n");
		System.out.println("operations available:\n");
		System.out.println("1. add to matrices(row1=row2&column1=column2).\n");
		System.out.println("1. multiply to matrices(column1=row2).\n");
		System.out.println("enter your choice 1 or 2:");
		int choice=scan.nextInt();
		switch(choice){
		case 1:{
			if (row1==row2&&column1==column2) {
				int result[][]=new int [row1][column1];
				result=arr2.add2D(mat2, mat2, row1, column1);
				for(int x[]:result) {
					System.out.println(Arrays.toString(x));}
			}			
		}
		}
		scan.close();
	}
}
