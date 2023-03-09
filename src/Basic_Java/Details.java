import java.util.*;
 
public class Details {
	public static void main(String args[]) {
		String name;
		int age;
		long roll, phone;
		String ch="y";  
		Scanner myObj=new Scanner(System.in);
		while(ch.equals("y")){   
			System.out.print("Enter Roll Number: ");
			roll=myObj.nextLong();
				myObj.nextLine();
			System.out.print("Enter Name: ");
			name=myObj.nextLine();
			System.out.print("Enter phone number: ");
			phone=myObj.nextLong();
			System.out.print("Enter age: ");
			age=myObj.nextInt();
			System.out.println("\nSTUDENT DETAIL:\n--------------\nRoll Number: " + roll +"\nName: "+name+ "\nAge: " + age + "\nPhone number: " + phone);
        
		
           	System.out.print("\nWould you like to enter another data [y/n]: ");
           	ch=myObj.nextLine();
			myObj.close();
        	}  
	}
          
}