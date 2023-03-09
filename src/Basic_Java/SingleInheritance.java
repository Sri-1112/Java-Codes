class MyAnimal{
	void eat(){System.out.println("eating...");}  
}  
class Dog1 extends MyAnimal {
	void bark(){System.out.println("barking...");}
}  
class SingleInheritance{  
	public static void main(String args[]){  
	Dog1 d=new Dog1();
	d.bark();  
	d.eat();
	}
}