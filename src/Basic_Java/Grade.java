import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		String ch="y";
		double phy, chem, bio, mat, comp;
		Scanner scanner=new Scanner(System.in);
		while(ch.equals("y")){
			System.out.print("Enter your mark in physics: ");
			phy=scanner.nextDouble();

			System.out.print("Enter your mark in chemistry: ");
			chem=scanner.nextDouble();

			System.out.print("Enter your mark in biology: ");
			bio=scanner.nextDouble();

			System.out.print("Enter your mark in mathematics: ");
			mat=scanner.nextDouble();

			System.out.print("Enter your mark in computer: ");
			comp=scanner.nextDouble();

			double total=phy+chem+bio+mat+comp;
			double percent=total/5;
		
			if(90<=percent&&percent<=100){
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE A\n");
			}else if(80<=percent&&percent<=90){
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE B\n");
			}else if(70<=percent&&percent<=80){
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE C\n");
			}else if(60<=percent&&percent<=70){
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE D\n");
			}else if(40<=percent&&percent<=60){
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE E\n");
			}else{
				System.out.print("Your percentage is"+" "+percent+" "+"with GRADE F\n");
			}
		
			System.out.print("Would you like to calculate another [y/n]: ");
			ch=scanner.nextLine();
			System.out.print("\n");
			scanner.close();
		}
	}
}
