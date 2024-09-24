public class Animal {
    private String name;
//    public void eat() {
//        System.out.println(name + " is eating something");
//    }

    // final method. if a method declare as 'final' in a class, the subclass can not override that method
    public final void eat() {
        System.out.println(name + " is eating something");
    }


    public Animal(String name) {
        this.name = name;
    }

    public static void sound(Animal animal) {
        if (animal instanceof Dog)
            System.out.println("vagh vagh");
        else if (animal instanceof Cat)
            System.out.println("miooooo");
        else
            System.out.println("----------");
    }

    // create makeSound() in super class and subclasses for polymorphism definition
    public void makeSound() {
        System.out.println("---makeSound----");
    }
}


class Dog extends Animal {
    // we got error here because we do not have default constructor in Animal. so we need to write this code:
    //        public Dog(String name) {
    //            super(name);
    //        }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("vagh vagh vagh");
    }

    public void makeSound() {
        System.out.println("VAGH VAGH");
    }

    // final method. if a method declare as 'final' in a class, the subclass can not override that method
    // eat() method declare as 'final' in Animal class, and Dog class is subclass of Animal and can not override eat() method. so we have error here
//    public void eat() {
//        System.out.println(name + " is eating something");
//    }

}

class Cat extends Animal {
    // we got error here because we do not have default constructor in Animal. so we need to write this code:
    //        public Cat(String name) {
    //            super(name);
    //        }
    public Cat(String name) {
        super(name);
    }

//    public void mioo() {
//        System.out.println("miooooooooo");
//    }

    public void makeSound() {
        System.out.println("MIOOOOOOOOO");
    }

}

// final class (final class can not be inheritances)
final class Dog2 extends Animal {
    public Dog2(String name) {
        super(name);
    }

}
// final class can not be inheritances. Dog2 is a final class and can not be inheritances in Horse class, and we have error here
class Horse extends Dog2 { // error

}

