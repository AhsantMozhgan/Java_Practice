public class Animal {
    private String name;
    public void eat() {
        System.out.println(name + " is eating something");
    }

    public Animal(String name) {
        this.name = name;
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
    }


}
