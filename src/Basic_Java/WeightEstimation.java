package Basic_Java;

import java.util.Scanner;
public class WeightEstimation {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			double PayloadW,CrewW,FuelRatio,EmptyRatioNpp,EmptyRatioPp,OverallW,Power,PWratio,PowerPW,FuelW,SFC;
			double RelDen=0.588;
			PayloadW=160.0;
			CrewW=160.0;
			FuelRatio=0.15;
			EmptyRatioPp=0.63;
			PWratio=0.1875;
			FuelW=0;
			PowerPW=0;
			EmptyRatioNpp=0;
			int i = 1;
			int size=1;
			char ch='y';
			double TotWeight[]=new double[size];
			Adp myobj=new Adp();
			while(ch=='y') {	
				while(i>0) {
					if(i!=1) {
						OverallW=(PayloadW+CrewW+FuelW+PowerPW)/(1-EmptyRatioNpp);
						System.out.println("Overall Weight in"+i+"Iteration: "+ OverallW);
						TotWeight=myobj.instAtLast(TotWeight,OverallW);
						Power=PWratio*OverallW*1.2;
						System.out.println("Approx. Power: "+Power+" hp");
						System.out.println("Enter the new powerplant weight in kg:");
						PowerPW=scan.nextDouble();
						System.out.println("Enter the Correct engine power in hp:");
						Power=scan.nextDouble();
						System.out.println("Enter the new SFC in lb/hp-hr:");
						SFC=scan.nextDouble();
						FuelW=((Power*Math.pow(RelDen, 1.2)*1500*SFC*1.2)/260)*0.454;
						System.out.println("Fuel Weight: "+FuelW);
						FuelRatio=FuelW/OverallW;
						EmptyRatioNpp=EmptyRatioPp-(PowerPW/OverallW);
						System.out.println("Fuel Ratio: "+FuelRatio+"\nEmpty Weight Ratio (Without power plant): "+EmptyRatioNpp);
						i++;
						System.out.println("Do you wanna continue...press y...");
						ch=scan.next().charAt(0);
					}
					else {
						OverallW=(PayloadW+CrewW)/(1-EmptyRatioPp-FuelRatio);
						System.out.println("Overall weight:"+OverallW+" kg");
						TotWeight=myobj.instAtLast(TotWeight,OverallW);
						Power=PWratio*OverallW*1.2;
						System.out.println("Approx. Power: "+Power+" hp");
						System.out.println("Enter the new powerplant weight in kg:");
						PowerPW=scan.nextDouble();
						System.out.println("Enter the Correct engine power in hp:");
						Power=scan.nextDouble();
						System.out.println("Enter the new SFC in lb/hp-hr:");
						SFC=scan.nextDouble();
						FuelW=((Power*Math.pow(RelDen, 1.2)*1500*SFC*1.2)/260)*0.454;
						System.out.println("Fuel Weight: "+FuelW);
						FuelRatio=FuelW/OverallW;
						EmptyRatioNpp=EmptyRatioPp-(PowerPW/OverallW);
						System.out.println("Fuel Ratio: "+FuelRatio+"\nEmpty Weight Ratio (Without power plant): "+EmptyRatioNpp);
						i++;
					}
				}
			}
			scan.close();
			int size1=TotWeight.length;
			for(int x=0;x<size1;x++) {
				System.out.println("Iteration number:"+(x+1)+"Overall Weight: "+TotWeight[x]);

			}
		}
	}
