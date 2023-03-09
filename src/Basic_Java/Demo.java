import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.insertAtBeginning(1);
		list.insertAtBeginning(2);	
		list.insertAtPos(2,10);
		list.insertAtPos(3,12);
		list.insertAtPos(2,14);
		list.display();
		int index=list.search(12);
		System.out.println("index:"+index+"\n");
		list.get(4);
		System.out.println("");
		list.update(4, 9);
		list.display();
		System.out.println(list.length()+"\n");
		list.dltAtEnd();
		list.display();
		list.insertAtLast(12);
		list.display();
		System.out.println(list.contain(134));
		list.reverse();
		list.display();
		Iterator <Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
