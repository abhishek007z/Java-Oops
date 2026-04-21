// ==========================================
// TOPIC: INHERITANCE vs COMPOSITION
// ==========================================


// ==========================================
// 🔹 1. INHERITANCE
// ==========================================

// 👉 Definition:
// Ek class dusri class ke properties aur methods use karti hai using 'extends'

// 💡 Simple:
// IS-A relationship

// 🌍 Example:
// Dog IS-A Animal


// ==========================================
// 💻 INHERITANCE CODE
// ==========================================

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// 🔹 2. COMPOSITION
// ==========================================

// 👉 Definition:
// Ek class dusri class ka object use karti hai

// 💡 Simple:
// HAS-A relationship

// 🌍 Example:
// Car HAS-A Engine


// ==========================================
// 💻 COMPOSITION CODE
// ==========================================

class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

class Car {

    Engine engine = new Engine();   // HAS-A

    void startCar() {
        engine.start();
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class InheritanceVsCompositionNotes {

    public static void main(String[] args) {

        // ------------------------------------------
        // INHERITANCE
        // ------------------------------------------

        Dog d = new Dog();

        d.sound();   // from parent
        d.bark();    // from child

        // Output:
        // Animal makes sound
        // Dog barks


        // ------------------------------------------
        // COMPOSITION
        // ------------------------------------------

        Car c = new Car();

        c.startCar();

        // Output:
        // Engine starts
    }
}


// ==========================================
// 🧠 MAIN DIFFERENCE
// ==========================================

// Inheritance:
// 👉 IS-A relationship
// 👉 Uses 'extends'
// 👉 Tight coupling
// 👉 Less flexible

// Composition:
// 👉 HAS-A relationship
// 👉 Uses object
// 👉 Loose coupling
// 👉 More flexible


// ==========================================
// 🔥 WHEN TO USE
// ==========================================

// ✔ Use Inheritance:
// Strong IS-A relation
// Example: Dog → Animal

// ✔ Use Composition:
// Flexible design
// Example: Car → Engine


// ==========================================
// ⚠️ INTERVIEW TRAP
// ==========================================

// ❓ Car extends Engine — sahi hai?

// 👉 Answer:
// Technically correct, but logically wrong
// Car is not an Engine, it has an Engine


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is inheritance?
// 👉 IS-A relationship


// ❓ What is composition?
// 👉 HAS-A relationship


// ❓ Which is better?
// 👉 Composition (more flexible)


// ❓ Why composition preferred?
// 👉 Loose coupling


// ❓ Real example?
// 👉 Car has Engine


// ==========================================
// 🧠 SHORT INTERVIEW ANSWER
// ==========================================

// 👉 Inheritance represents IS-A relationship
// 👉 Composition represents HAS-A relationship
// 👉 Composition is preferred due to flexibility


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ Inheritance = reuse via extends
// ✔ Composition = reuse via object
// ✔ Composition > Inheritance (most cases)