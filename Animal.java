class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }



    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();
        
        // Calling the speak method
        dog.speak(); // Output will be "Dog barks"
    }
}


