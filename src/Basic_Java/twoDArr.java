import java.util.Scanner;

public class twoDArr {
	Scanner scan=new Scanner(System.in);
	public int[][] create2DArr(int row,int column){
		int arr[][]=new int[row][column];
		for(int i=1; i<row+1;i++) {
			for(int j=1;j<column+1;j++) {
				System.out.println("Enter the element for a"+ i + j);
				arr[i-1][j-1]=scan.nextInt();
			}
		}
		return arr;
	}
	public int[][] add2D(int arr1[][],int arr2[][],int row,int column){
		int matRes[][]=new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				matRes[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return matRes;
	}
}
