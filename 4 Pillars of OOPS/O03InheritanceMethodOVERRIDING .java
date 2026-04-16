// ==========================================
// 🔥 METHOD OVERRIDING (DEEP UNDERSTANDING)
// ==========================================

// 👉 Same method name + same parameters (parent & child)
// 👉 Runtime decision (we'll study in polymorphism)

// Example:

// class Animal2 {

//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog2 extends Animal2 {

//     // Overriding
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// Usage:
// Animal2 a = new Dog2();
// a.sound();   👉 Dog barks (runtime decision 🔥)


// ==========================================
// 🔥 SUPER KEYWORD (VERY IMPORTANT ⭐)
// ==========================================

// 👉 'super' refers to parent class object

// ------------------------------------------
// 1. Call parent method
// ------------------------------------------

// class Animal3 {

//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog3 extends Animal3 {

//     void eat() {
//         super.eat();   // 👉 calling parent method
//         System.out.println("Dog is eating");
//     }
// }


// ------------------------------------------
// 2. Access parent variable
// ------------------------------------------

// class Animal4 {
//     String type = "Animal";
// }

// class Dog4 extends Animal4 {
//     String type = "Dog";

//     void printType() {
//         System.out.println(type);        // Dog
//         System.out.println(super.type); // Animal
//     }
// }


// ------------------------------------------
// 3. Call parent constructor
// ------------------------------------------

// class Animal5 {

//     Animal5() {
//         System.out.println("Animal constructor");
//     }
// }

// class Dog5 extends Animal5 {

//     Dog5() {
//         super();   // 👉 calls parent constructor
//         System.out.println("Dog constructor");
//     }
// }


// ==========================================
// 🎯 INTERVIEW QUESTIONS (ADVANCED)
// ==========================================

// ❓ What is method overriding?
// 👉 Same method in parent & child with same signature


// ❓ When does overriding happen?
// 👉 At runtime (dynamic method dispatch)


// ❓ Can we override static method?
// 👉 No (it's method hiding, not overriding)


// ❓ What is 'super' keyword?
// 👉 Refers to parent class object


// ❓ Where is 'super' used?
// 👉 1. Call parent method
// 👉 2. Access parent variable
// 👉 3. Call parent constructor


// ❓ What happens if we don’t use super()?
// 👉 Java automatically calls default parent constructor


// ❓ Can we use both this() and super() together?
// 👉 No, both must be first statement (only one allowed)


// ❓ Difference between this and super?

// this:
// 👉 Refers to current class object

// super:
// 👉 Refers to parent class object



// ==========================================
//SIMPLE FULL CODE 

class Animal2 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Dog barks");
    }
}

// -------------------------

class Animal3 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog3 extends Animal3 {
    void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}

// -------------------------

class Animal4 {
    String type = "Animal";
}

class Dog4 extends Animal4 {
    String type = "Dog";

    void printType() {
        System.out.println(type);
        System.out.println(super.type);
    }
}

// -------------------------

class Animal5 {
    Animal5() {
        System.out.println("Animal constructor");
    }
}

class Dog5 extends Animal5 {
    Dog5() {
        super();
        System.out.println("Dog constructor");
    }
}

// -------------------------

public class O03InheritanceMethodOVERRIDING {

    public static void main(String[] args) {

        Animal2 a = new Dog2();
        a.sound();

        Dog3 d3 = new Dog3();
        d3.eat();

        Dog4 d4 = new Dog4();
        d4.printType();

        Dog5 d5 = new Dog5();
    }
}








// ==========================================
// 🔥 @Override ANNOTATION (IMPORTANT)
// ==========================================

// 👉 @Override ensures method is correctly overriding parent method

// class AnimalOverride {

//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class DogOverride extends AnimalOverride {

//     @Override
//     void sound() {   // ✅ Correct override
//         System.out.println("Dog barks");
//     }
// }


// ❌ Without @Override (Danger)

// void Sound() { }  // Wrong method, no error without annotation

// 👉 Always use @Override for safety









// ❓ What is @Override?
// 👉 Annotation used to indicate method overriding


// ❓ Is @Override mandatory?
// 👉 No, but highly recommended


// ❓ What happens if we don’t use it?
// 👉 Code runs, but errors may go unnoticed


// ❓ Advantage of @Override?
// 👉 Compile-time checking













// ==========================================
// 🔹 THIS vs SUPER (IMPORTANT)
// ==========================================

// 👉 this → refers to current class object
// 👉 super → refers to parent class object


// ==========================================
// 🔹 THIS KEYWORD
// ==========================================

// class Student {

//     String name;

//     Student(String name) {
//         this.name = name;  // differentiate variable
//     }
// }


// ==========================================
// 🔹 SUPER KEYWORD
// ==========================================

// class Animal {
//     String type = "Animal";
// }

// class Dog extends Animal {

//     String type = "Dog";

//     void printType() {
//         System.out.println(type);        // Dog
//         System.out.println(super.type); // Animal
//     }
// }


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Difference between this and super?

// this:
// 👉 current class object

// super:
// 👉 parent class object


// ❓ Can we use both together?
// 👉 No (both must be first statement in constructor)


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ this → current object
// ✔ super → parent object
// ✔ Used in constructor & methods