import java.util.*;
class revArrayList {
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
	{
		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
		for (int i = alist.size() - 1; i >= 0; i--) {
			revArrayList.add(alist.get(i));
		}
		return revArrayList;
	}
	public void printElements(ArrayList<Integer> alist)
	{
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}
	}
}

class reverse {
	public static void main(String[] args)
	{
		revArrayList obj = new revArrayList();
		Scanner myObj=new Scanner(System.in);
        System.out.println("Enter arraySize: ");
        int s = myObj.nextInt();
        int s1 = s;
        int x;
        x=s1;
		myObj.close();
		ArrayList<Integer> arrayli = new ArrayList<Integer>(s);
		for(s=0; s<x; s++) {
            System.out.println("Enter the element for index:"+ (s));
            int z = myObj.nextInt();
            arrayli.add(s, z);}

		System.out.print("Elements before reversing:");
		obj.printElements(arrayli);
		arrayli = obj.reverseArrayList(arrayli);
		System.out.print("\nElements after reversing:");
		obj.printElements(arrayli);
	}
}