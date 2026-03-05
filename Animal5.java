//abstract class program

abstract class Animal5 {
    abstract void sound();   // abstract method

    void eat() {             // concrete method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal5
 {
    void sound() 
{
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal5 a = new Dog();   // Upcasting
        a.sound();
        a.eat();
    }
}