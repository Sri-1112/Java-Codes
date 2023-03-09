

class Stack{
    final int MAX=5;
    int top;
    int[] arr= new int[MAX];

    public Stack() {
        top=-1;
    }
    public void push(int ele){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else {
            arr[++top]=ele;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else{
            return arr[top--];
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else
            return arr[top];
    }
    public boolean isFull(){
        return top==MAX-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Element: "+s.pop());
        System.out.println("Element: "+s.pop());
        System.out.println("Peeked: "+s.peek());
        s.push(3);
        s.push(4);
        System.out.println("Peeked: "+s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.push(5);
    }
}
