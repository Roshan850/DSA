public class abstraction {
    public static void main(String args[]) {
        // Horse h = new Horse();
        // h.eat();
        // h.leg();
        // h.animalcolor();
        // Hen h2 = new Hen();
        // h2.eat();
        // h2.leg();
        // h2.animalcolor();
        Mustang m = new Mustang(); //SHOWING THE HERERICAL PHENOMENON OF ABSTRACTION CONSTRUCTOR
        //Animal -> Horse ->Mustang
        
        
    }
    
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called.");
        
    }
    // Animal() {
    //     color = "red";
    //     System.out.println("Animal color is :" + color);

    // }
    void eat() {

        System.out.println("Animal is eating.");
    }

    abstract void leg();

}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called.");
    }

    void animalcolor() {
        color = "Dark Brown ";
        System.out.println("Animal color is :" + color);
    }

    void leg() {
        System.out.println("Horse has 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called.");
    }
}

class Hen extends Animal {
    void animalcolor() {
        color = "Yellow ";
        System.out.println("Animal color is :" + color);
    }
    void leg() {
        System.out.println("Hen has 2 legs.");
    }
}

