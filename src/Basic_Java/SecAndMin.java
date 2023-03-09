
import java.util.Scanner;

public class SecAndMin{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int option;
        long min, sec;
        System.out.println("Enter mode (minutes and seconds-1/seconds only-2):");
        option=scan.nextInt();

        if(option==1){
            System.out.println("Enter minutes and seconds:");
            min=scan.nextLong();
            sec=scan.nextLong();
            System.out.println(getDurationString(min,sec));
        } else if (option==2) {
            System.out.println("Enter seconds:");
            sec=scan.nextLong();
            System.out.println(getDurationString(sec));
        }
        
scan.close();
    }

    public static String getDurationString(long m, long s){
        String result;
        if(m<0 || (s<=0||s>=59)){
            return "Invalid input";
        }
        else{
            long hour = m/60;
            long min = m%60;
            result="Duration: "+0+hour+"hrs "+0+min+"mins "+0+s+"secs ";

        }
        return result;
    }

    public static String getDurationString(long s){
        String result;
        if(s>0){
            long min=s/60;
            long sec=s%60;
            result=getDurationString(min,sec);
        }
        else{
            return "Invalid input";
        }
        return result;
    }

}
