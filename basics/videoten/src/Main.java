public class Main{
    public static void main(String[] args) {
        
        Cat cuteCat = new Cat();
        Cat cc = new Cat();;

        cuteCat.eat("fish");
        cuteCat.makeSound("meow");

        // tell which class the object is associated with
        System.out.println(cuteCat.getClass());

        // Class-name@HASHCODE
        System.out.println(cuteCat.toString());

        // Check if the objects are same
        System.out.println(cuteCat.equals(cc));

        cuteCat.SetName("chimps");
        System.out.println(cuteCat.getName());

        Dog strongDog = new Dog();
        strongDog.eat("chicken");
        strongDog.makeSound("bow");
    }

    
}

class Animal{
    private String name;

    public String getName(){
        return this.name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println("I ate "+food);
    }

    public void makeSound(String sound){
        System.out.println("I make "+sound+" sound");
    }
}

class Cat extends Animal{
    public Cat(){
        
    }

}

class Dog extends Animal{
    public Dog(){

    }
}