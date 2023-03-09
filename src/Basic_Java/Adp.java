package Basic_Java;

import java.util.*;

public class Adp {
	public double[] instAtLast(double arr[],double val) {
		int size=arr.length;
		size++;
		double[] arr1;
		arr1=Arrays.copyOf(arr, size);
		arr1[size-1]=val;

		return arr1;
	}
}
/*System.out.println("Enter the new powerplant weight in kg:");
						PowerPW=scan.nextDouble();
						OverallW=(PayloadW+CrewW+FuelW+PowerPW)/(1-EmptyRatioNpp);
						System.out.println("Overall Weight in"+i+"Iteration: "+ OverallW);
						i++;
						System.out.println("Do you wanna continue...press y...");
						ch=scan.next().charAt(0);*/
