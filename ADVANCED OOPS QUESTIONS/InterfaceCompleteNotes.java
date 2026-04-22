// ==========================================
// ⭐ TOPIC: INTERFACE (FULL NOTES)
// ==========================================

// 👉 Interface = Blueprint
// 👉 Sirf batata hai "kya karna hai"
// 👉 Implementation class deti hai


// ==========================================
// 🧠 BASIC INTERFACE
// ==========================================

interface Animal {

    void sound();   // by default public abstract
}


// ==========================================
// IMPLEMENTATION CLASS
// ==========================================

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// 🧠 DEFAULT + STATIC METHODS
// ==========================================

interface Animal2 {

    void sound();

    // Default method (body allowed)
    default void eat() {
        System.out.println("Animal eats");
    }

    // Static method
    static void info() {
        System.out.println("Animal interface");
    }
}


class Cat implements Animal2 {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}


// ==========================================
// 🧠 MULTIPLE INHERITANCE USING INTERFACE
// ==========================================

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("From A");
    }

    public void display() {
        System.out.println("From B");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class InterfaceCompleteNotes {

    public static void main(String[] args) {

        // ------------------------------------------
        // BASIC INTERFACE
        // ------------------------------------------

        Animal a = new Dog();

        a.sound();  
        // Output: Dog barks


        // ------------------------------------------
        // DEFAULT + STATIC METHOD
        // ------------------------------------------

        Animal2 obj = new Cat();

        obj.sound();   // Cat meows
        obj.eat();     // Animal eats

        Animal2.info();  // Static call


        // ------------------------------------------
        // MULTIPLE INHERITANCE
        // ------------------------------------------

        C multi = new C();

        multi.show();     // From A
        multi.display();  // From B
    }
}


// ==========================================
// 🧠 CORE UNDERSTANDING
// ==========================================

// ✔ Interface = 100% abstraction (mostly)
// ✔ Implementation class → actual logic deti hai
// ✔ Object → implementation class ka banta hai


// ==========================================
// ⚠️ IMPORTANT RULES
// ==========================================

// ✔ Methods → public abstract (by default)
// ✔ Variables → public static final
// ✔ Use 'implements'
// ✔ Multiple interfaces allowed
// ✔ Interface ka object nahi ban sakta


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is interface?
// 👉 Blueprint with abstract methods


// ❓ Can we create object of interface?
// 👉 No


// ❓ Why use interface?
// 👉 Abstraction + multiple inheritance


// ❓ Interface vs abstract class?

// Interface:
// 👉 Full abstraction
// 👉 Multiple inheritance

// Abstract class:
// 👉 Partial abstraction


// ❓ Can interface have method body?
// 👉 Yes (default & static methods)


// ❓ What is functional interface?
// 👉 Interface with only one abstract method


// ❓ Can a class implement multiple interfaces?
// 👉 Yes


// ❓ How to call static method of interface?
// 👉 InterfaceName.methodName()


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Interface = design / contract
// ✔ Class = implementation
// ✔ Default → body allowed
// ✔ Static → called by interface name
// ✔ Multiple inheritance possible



// ==========================================
// 🧠 FINAL UNDERSTANDING (NO CONFUSION)
// ==========================================


// 👉 Interface:

// Rule book 📘
// Implementation class:
// Real worker 👷

// 👉 Example:

// Animal a = new Dog();

// 👉 Matlab:

// Interface type → flexibility
// Object → actual behavior



// ==========================================
// 🔥 OUTPUT SUMMARY
// ==========================================

// Dog barks
// Cat meows
// Animal eats
// Animal interface
// From A
// From B