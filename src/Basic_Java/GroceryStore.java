import java.util.Scanner;

public class GroceryStore {
    private String customerName;
    private int customerID;
    GroceryStore(String customerName,int customerID){
        setCustomerName(customerName);
        setCustomerID(customerID);
    }
    private String phoneNumber;
    private double accBal;
    private String cusAddress;

    public void setCustomerName(String Name){
        customerName=Name;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerID(int ID){
        customerID=ID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public void setPhoneNumber(String phNo){
        phoneNumber=phNo;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setAccBal(double bal){
        accBal=bal;
    }
    public double getAccBal(){
        return accBal;
    }
    public void setAddress(String address){
        cusAddress=address;
    }
    public String getCusAddress(){
        return cusAddress;
    }
    public void shop(double amount){
        if (accBal>=amount){
            double remBal=accBal-amount;
            System.out.println("Thank you for shopping...your remaining balance is Rs."+remBal+"/-");
            accBal=remBal;
        }
        else{
            System.out.println("Insufficient balance!!!");
        }
    }
    public void recharge(double amount){
        accBal=amount+accBal;
        System.out.println("Recharge done successfully...your new balance is Rs."+accBal+"/-");
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name= scan.nextLine();
        System.out.println("Enter your Customer ID:");
        int Id=scan.nextInt();
        GroceryStore myAcc=new GroceryStore(name,Id);
        myAcc.setAccBal(1000);
        myAcc.setPhoneNumber("9159076607");
        myAcc.setAddress("10/89, 4th cross, Vellore-9.");
        myAcc.shop(750);
        myAcc.shop(650);
        myAcc.recharge(500);
        myAcc.shop(650);
        scan.close();
    }
}

