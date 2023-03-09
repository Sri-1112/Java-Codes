package Basic_Java;

import java.util.Scanner;

public class AreaCalc {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int length,breadth;
        double height;
        System.out.println("Enter length and breadth:");
        length= scan.nextInt();
        breadth=scan.nextInt();
        System.out.println("Enter Height:");
        height= scan.nextDouble();
        double sq_area, rect_area, tri_area;
        sq_area=area(length);
        rect_area=area(length, breadth);
        tri_area=area(length,breadth,height);
        System.out.println("Area of the Square:"+sq_area);
        System.out.println("Area of the Rectangle:"+rect_area);
        System.out.println("Area of the Triangle:"+tri_area);
        scan.close();
    }
    public static double area(int l){
        return l*l;
    }
    public static double area(int l,int b){
        return 2*(l+b);
    }
    public static double area (int l,int b, double h){
        return 0.5*l*b*h;
    }
    
}
