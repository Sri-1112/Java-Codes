import java.util.*;
public class SuperClass {
	Scanner scan = new Scanner(System.in);
	static int n1=0,n2=1,n3;
	public void Fibonacci(int size) {
		if (size-2>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			Fibonacci(size-1);
		}
	}
	public boolean isPrime(int n) {
		int a=0;
		if(n==1||n==0) {
			//System.out.println(n+" is not a prime number.");
			return false;
		}
		else if(n==2||n==3){
			return true;
		}
		else{
			a=((n*n)-1)%24;
			return a == 0;
		}

	}	
	public void Palindrome(int n) {
		int sum=0;
		int r=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) {System.out.println(temp+" is a palindrome number.");}
		else {System.out.println(temp+ " is not a palindrome number.");}
	}
	public int Factorial(int n) {
		if(n==0) {return 1;}
		else {return(n*Factorial(n-1));}
	}
	public void Armstrong(int n) {
		int temp=n;
		int arm=0;
		while(n>0) {
			int r=n%10;
			arm=arm+r*r*r;
			n=n/10;
		}
		if(arm==temp) {System.out.println("The given is armstrong number.");}
		else {System.out.println("The given is not armstrong number.");}
	}
	public void Roll(int n) {
		Random ran = new Random();
		System.out.println("The random number between 0 to "+n+" is "+ran.nextInt(n+1));
	}
	
}
