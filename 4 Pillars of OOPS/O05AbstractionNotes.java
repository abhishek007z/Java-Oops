// ==========================================
// TOPIC: ABSTRACTION + INTERFACE (FULL NOTES)
// ==========================================

// 👉 Abstraction = Hiding implementation details
// 👉 Show only essential features


// ==========================================
// 🧱 ABSTRACT CLASS
// ==========================================

abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}


// ==========================================
// 🧱 CHILD CLASS
// ==========================================

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// 🧱 INTERFACE
// ==========================================

interface Animal2 {

    void sound();   // by default abstract
}


// ==========================================
// 🧱 IMPLEMENTATION CLASS
// ==========================================

class Cat implements Animal2 {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O05AbstractionNotes {

    public static void main(String[] args) {

        // ------------------------------------------
        // ABSTRACT CLASS USAGE
        // ------------------------------------------

        Animal a = new Dog();

        a.sound();
        a.eat();


        // ------------------------------------------
        // INTERFACE USAGE
        // ------------------------------------------

        Animal2 obj = new Cat();

        obj.sound();


        // ==========================================
        // 🧪 PRACTICE
        // ==========================================

        Animal test = new Dog();
        test.sound();
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is abstraction?
// 👉 Hiding implementation


// ❓ Abstract class vs Interface?

// Abstract:
// 👉 Partial abstraction

// Interface:
// 👉 Full abstraction


// ❓ Can we create object of abstract class?
// 👉 No


// ❓ Why interface?
// 👉 Multiple inheritance


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ Abstract class → can have normal + abstract methods
// ✔ Interface → mostly abstract methods
// ✔ Use extends (class)
// ✔ Use implements (interface)