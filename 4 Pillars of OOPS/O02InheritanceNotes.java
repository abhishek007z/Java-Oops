// ==========================================
// TOPIC: INHERITANCE (FULL NOTES)
// ==========================================

// 👉 Inheritance = One class uses properties of another class
// 👉 Achieved using 'extends' keyword


// ==========================================
// 📦 PARENT CLASS
// ==========================================

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}


// ==========================================
// 📦 CHILD CLASS
// ==========================================

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

    // ------------------------------------------
    // METHOD OVERRIDING
    // ------------------------------------------

    void sound() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O02InheritanceNotes {

    public static void main(String[] args) {

        // ==========================================
        // OBJECT CREATION
        // ==========================================

        Dog d = new Dog();

        // 👉 Access parent method
        d.eat();

        // 👉 Access child method
        d.bark();

        // 👉 Overridden method
        d.sound();


        // ==========================================
        // 🧪 PRACTICE
        // ==========================================

        Cat c = new Cat();

        c.eat();    // from parent
        c.meow();   // from child
    }
}


// ==========================================
// 📦 ANOTHER CHILD CLASS (HIERARCHICAL)
// ==========================================

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is inheritance?
// 👉 One class acquiring properties of another


// ❓ What is 'extends'?
// 👉 Keyword used to inherit class


// ❓ Types of inheritance?
// 👉 Single, Multilevel, Hierarchical


// ❓ Why multiple inheritance not supported?
// 👉 Because of ambiguity (Diamond problem)


// ❓ What is method overriding?
// 👉 Same method in parent & child


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Use 'extends'
// ✔ Child can access parent methods
// ✔ Promotes code reuse
// ✔ Supports overriding












// ==========================================
// 🔥 METHOD OVERRIDING (DEEP UNDERSTANDING)
// ==========================================

// 👉 Same method name + same parameters (parent & child)
// 👉 Runtime decision (we'll study in polymorphism)

// Example:

class Animal2 {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog2 extends Animal2 {

    // Overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

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

class Animal3 {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog3 extends Animal3 {

    void eat() {
        super.eat();   // 👉 calling parent method
        System.out.println("Dog is eating");
    }
}


// ------------------------------------------
// 2. Access parent variable
// ------------------------------------------

class Animal4 {
    String type = "Animal";
}

class Dog4 extends Animal4 {
    String type = "Dog";

    void printType() {
        System.out.println(type);        // Dog
        System.out.println(super.type); // Animal
    }
}


// ------------------------------------------
// 3. Call parent constructor
// ------------------------------------------

class Animal5 {

    Animal5() {
        System.out.println("Animal constructor");
    }
}

class Dog5 extends Animal5 {

    Dog5() {
        super();   // 👉 calls parent constructor
        System.out.println("Dog constructor");
    }
}
