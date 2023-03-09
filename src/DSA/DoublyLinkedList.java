import java.util.*;
public class DoublyLinkedList<T> implements Iterable<T> {

		Node head;
		Node tail;
		class Node{
			T data;
			Node next;
			Node prev;
			Node(T val){
				data=val;
				prev=null;
				next=null;
			}
		}
		DoublyLinkedList(){
			head=null;
			tail=null;
		}
		public void insertAtBeginning(T val) {
			Node newnode=new Node(val);
			newnode.next=head;
			if(head==null) {
				tail=newnode;
			}
			else {
				head.prev=newnode;
			}
			head=newnode;
		}
		public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("\n");
		}
		public void displayRev() {
			Node temp=tail;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}
			System.out.println("\n");
		}
		public void insertAtPos(int pos, T val) {
			Node newnode=new Node(val);
			Node temp=head;
			if(pos==0) {
				insertAtBeginning(val);
			}
			else{
				for(int i=1;i<pos;i++) {
					temp=temp.next;
				}
			}
				newnode.prev=temp;
				newnode.next=temp.next;
			if(temp==tail) {
				tail=newnode;
			}
			else
				temp.next.prev=newnode;
			temp.next=newnode;
		}
		public void dltAtPos(int pos) {
			if(pos==0) {
				if(head==null){
					head=head.next;
				}
				else {
					head.prev=null;
				}
			}
			else {
				Node temp=head;
				Node prev=null;
				for(int i=1;i<=pos;i++) {
					prev=temp;
					temp=temp.next;
				}
				prev.next=temp.next;
				if(temp.next==null) {
					dltAtEnd();
				}
				else {
				temp.next.prev=prev;
				}
				}
				
			}
		public int search(T val) {
			Node temp=head;
			int i=0;
			while(temp!=null) {
				if(temp.data==val) {
					break;
				}
				else {
					i++;
					temp=temp.next;
				}
			}
			return i;
		}		
		public void get(int pos) {
			Node temp=head;
			int i=0;
			while(i<=pos) {
				if(i==pos) {
					System.out.println(temp.data);
					break;
				}
				else {
					i++;
					temp=temp.next;
				}			
			}
		}
		public void update(int pos,T val) {
			Node temp=head;
			for(int i=0;i<=pos;i++) {
				if(i==pos) {
					temp.data=val;
				}
				else {
					temp=temp.next;
				}
			}
		}
		public void dltAtEnd() {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			
		}
	  	public int length() {
			Node temp=head;
			int i=1;
			while(temp.next!=null) {
				i++;
				temp=temp.next;
			}
			return i;
		}
		public void insertAtLast(T val) {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			Node newnode=new Node(val);
			newnode.prev=temp;
			newnode.next=null;
			temp.next=newnode;		
		}
		public boolean contain(T val) {
			Node temp=head;
			while(temp.next!=null) {
				if(temp.data==val) {
					return true;
				}
				else {
					temp=temp.next;
				}
			}
			return false;
		}
		
		public Iterator<T> iterator(){
			return new Iterator<T>() {
				Node temp=head;
				 public boolean hasNext() {
					 return temp!=null;
				 }
				 public T next() {
					 T val = temp.data;
					 temp=temp.next;
					 return val;
				 }
			};
		}
	}
