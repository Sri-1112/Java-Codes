import java.util.*;
public class BarkingDog {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the dog barking? (true/false):");
        boolean bark= scan.nextBoolean();
        System.out.println("Enter the time of the day: ");
        int time=scan.nextInt();
        if(time>=0 && time<=23){
            shouldWakeUp(bark,time);
        }
        else{
            System.out.println("Invalid time input!!!");
        }
        scan.close();
    }

    public static void shouldWakeUp(boolean barks, int time) {
        if (barks && (time<=8 || time>=22)){
            System.out.println("Wakeup and check.");
        }
        else{
            System.out.println("No issues...sleep peacefully.");
        }
    }
}
