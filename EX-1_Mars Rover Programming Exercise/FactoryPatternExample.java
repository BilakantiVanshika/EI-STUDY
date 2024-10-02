// Animal Interface
interface Animal {
    void speak();
}

// Concrete classes
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory Class
class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }
}

// Main Class
public class FactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        dog.speak();

        Animal cat = factory.createAnimal("cat");
        cat.speak();
    }
}
