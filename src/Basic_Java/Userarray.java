import java.util.*;
public class Userarray {
    public static void main (String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter arraySize: ");
        int s = myObj.nextInt();
        Integer s1 =  s;
        Integer x;
        x=s1;
        myObj.close();
        ArrayList<Integer>user=new ArrayList<Integer>(s);
        for(s=0; s<x; s++) {
            System.out.println("Enter the element for index:"+ (s));
            int z = myObj.nextInt();
            user.add(s, z);}
        System.out.print("Array without any changes: " + user+"\n");
        ArrayList<Integer>user1=new ArrayList<Integer>(s);
        //user1=(ArrayList<Integer>) user.clone();
        System.out.println("Enter the element to scan:");
        int y = myObj.nextInt();
        if(user.contains(y)){
            System.out.print("The element "+y+" is present in the array.\n");
        }
        else{
            System.out.print("The element "+y+" is not in the array.\n");
        }
        if(x==1){
            System.out.print("Array of size 1 cannot be swapped!!! \n");}
	   else{
            System.out.print("This is array of length "+s+" enter the indices to swap:\nIndex 1:");
            int ind1 = myObj.nextInt();
            System.out.println("Index 2:");
            int ind2 = myObj.nextInt();
            Collections.swap(user, ind1, ind2);
            System.out.print("Array with 1st modification: " + user+"\n");
        }
        System.out.print("Enter a element to remove: ");
        int d = myObj.nextInt();
        if(user.contains(d)){
            user1.remove(d);
            System.out.print("Array with 2nd modification: " + user1);
        }else{
            System.out.println("Cannot remove element(absence of element)!!!");
            System.out.print("Array with 2nd modification: " + user1);
        }
    }    
}