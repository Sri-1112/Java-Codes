
public class DLLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> list=new DoublyLinkedList<Integer>();
		list.insertAtBeginning(1);
		list.insertAtBeginning(2);
		list.display();
		list.displayRev();
		list.insertAtPos(2,10);
		list.insertAtPos(3,12);
		list.insertAtPos(2,14);
		list.display();
		list.insertAtPos(5, 11);
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
		list.displayRev();
		list.display();
		
	}

}
