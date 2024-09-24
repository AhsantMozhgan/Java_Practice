public class Animal {
    private String name;
    public void eat() {
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

