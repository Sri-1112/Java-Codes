class myAnimal {
    void eat(){System.out.println("eating...");}  
}  
class MyDog extends myAnimal {
    void bark(){System.out.println("barking...");}  
}  
class Cat extends myAnimal {
    void meow(){System.out.println("meowing...");}  
}  
class HierarchicalInheritance{  
    public static void main(String args[]){  
        Cat c=new Cat();  
        c.meow();  
        c.eat();  
    }
}    