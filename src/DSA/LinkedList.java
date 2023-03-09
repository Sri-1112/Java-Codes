import java.util.*;

public class LinkedList<T> implements Iterable<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
	}
	LinkedList(){
		head=null;
	}
	public void insertAtBeginning(T val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
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
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	public void dltAtPos(int pos) {
		Node temp=head;
		Node prev=null;
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}
	public void dltAtBeginning() {
		head=head.next;
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
		newnode.next=temp.next;
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
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next=head.next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
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
	
	