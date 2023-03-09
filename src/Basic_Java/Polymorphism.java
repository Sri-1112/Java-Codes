class Myanimal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Myanimal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class dog extends Myanimal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    Myanimal myAnimal = new Myanimal();
    Myanimal myPig = new Pig();
    Myanimal myDog = new dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}