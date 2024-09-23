public class Animal {
    private String name;
    public void eat() {
        System.out.println(name + " is eating something");
    }

    public Animal(String name) {
        this.name = name;
    }

    class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }
}
