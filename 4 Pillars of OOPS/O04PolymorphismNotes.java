// ==========================================
// TOPIC: POLYMORPHISM (FULL NOTES)
// ==========================================

// 👉 Polymorphism = One object, many forms


// ==========================================
// 🔥 METHOD OVERLOADING (COMPILE TIME)
// ==========================================

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


// ==========================================
// 🔥 METHOD OVERRIDING (RUNTIME)
// ==========================================

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog barking");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O04PolymorphismNotes {

    public static void main(String[] args) {

        // ------------------------------------------
        // OVERLOADING
        // ------------------------------------------

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));


        // ------------------------------------------
        // OVERRIDING + DYNAMIC METHOD DISPATCH
        // ------------------------------------------

        Animal a = new Dog();

        a.sound();   // 👉 Dog barks

        // a.bark(); ❌ ERROR (reference type = Animal)
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is polymorphism?
// 👉 One object, many forms


// ❓ Types?
// 👉 Compile-time & Runtime


// ❓ Overloading vs Overriding?

// Overloading:
// 👉 Compile-time
// 👉 Same class
// 👉 Different parameters

// Overriding:
// 👉 Runtime
// 👉 Parent-child
// 👉 Same method


// ❓ What is dynamic method dispatch?
// 👉 Runtime method call based on object


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Overloading → compile-time
// ✔ Overriding → runtime
// ✔ Parent reference → child object
// ✔ Runtime decides method













// ==========================================
// TOPIC: POLYMORPHISM (DEEP UNDERSTANDING)
// ==========================================

// 👉 MOST IMPORTANT CONCEPT 🔥
// Reference type vs Object type


// ==========================================
// 📦 CLASS DEFINITIONS
// ==========================================

// class Animal {

//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }

//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

// public class PolymorphismDeepNotes {

//     public static void main(String[] args) {

        // ==========================================
        // 🔥 CORE EXAMPLE
        // ==========================================

        // Animal a = new Dog();

        // 👉 Reference type = Animal
        // 👉 Object type = Dog

        // ------------------------------------------
        // ✅ ALLOWED METHOD
        // ------------------------------------------

        // a.sound();   // ✔ Works
        // 👉 Because sound() exists in Animal
        // 👉 But Dog overrides it → Dog version runs


        // ------------------------------------------
        // ❌ NOT ALLOWED METHOD
        // ------------------------------------------

        // a.bark();   // ❌ ERROR

        // 👉 Reason:
        // bark() method Animal class me exist nahi karta
        // Compiler reference type dekhta hai


        // ==========================================
        // 🔥 SOLUTION 1: DIRECT OBJECT
        // ==========================================

        // Dog d1 = new Dog();
        // d1.bark();   // ✔ Works


        // ==========================================
        // 🔥 SOLUTION 2: TYPE CASTING
        // ==========================================

        // Animal a2 = new Dog();

        // Dog d2 = (Dog) a2;   // Downcasting
        // d2.bark();           // ✔ Works


        // Short form:
        // ((Dog) a2).bark();


        // ==========================================
        // ⚠️ INTERVIEW TRAP
        // ==========================================

        // Animal a3 = new Animal();

        // Dog d3 = (Dog) a3;   // ❌ Runtime Error
        // 👉 Because object actually Dog nahi hai


        // ==========================================
        // 🧪 PRACTICE
        // ==========================================

        // Animal ref = new Dog();

        // ref.sound();        // 👉 Dog barks

        // Try yourself:
        // ((Dog) ref).bark();
//     }
// }


// ==========================================
// 🧠 CORE CONCEPT (VERY IMPORTANT)
// ==========================================

// 👉 Java 2 cheez dekhta hai:

// 1. Reference Type → kya access kar sakte ho
// 2. Object Type → kaunsa method chalega


// ==========================================
// 🔥 RULE (YAAD KAR LE)
// ==========================================

// ✔ Reference decides accessible methods
// ✔ Object decides method implementation


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Why can't we call child methods using parent reference?
// 👉 Because reference type decides accessible methods


// ❓ What is polymorphism?
// 👉 One object, many forms


// ❓ What is upcasting?
// 👉 Dog → Animal (automatic)


// ❓ What is downcasting?
// 👉 Animal → Dog (manual)


// ❓ What will happen?

// Animal a = new Dog();
// ((Dog) a).bark();   👉 Works


// ❓ What will happen?

// Animal a = new Animal();
// Dog d = (Dog) a;   👉 Runtime error


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Parent reference → child object allowed
// ✔ Child methods → not accessible via parent reference
// ✔ Use casting to access child methods
// ✔ Runtime decides method execution


// ==========================================
// 💡 GOLDEN LINE (INTERVIEW)
// ==========================================

// 👉 "Reference type determines method accessibility,
//     object type determines method execution"




// ==========================================
// 🔹 METHOD RULES (ADVANCED - INTERVIEW)
// ==========================================


// ==========================================
// 🔥 METHOD OVERRIDING RULES
// ==========================================

// 1. Same method name
// 2. Same parameters
// 3. Must be in parent-child relation

// ------------------------------------------
// 🔹 RULE 1: Cannot reduce visibility
// ------------------------------------------

// Parent → public
// Child → cannot be private ❌


// ------------------------------------------
// 🔹 RULE 2: Return type (Covariant allowed)
// ------------------------------------------

// Allowed if child returns subtype

class A {
    A get() {
        return this;
    }
}

class B extends A {
    B get() {   // ✔ covariant return
        return this;
    }
}


// ------------------------------------------
// 🔹 RULE 3: static methods
// ------------------------------------------

// static methods are NOT overridden
// 👉 It is method hiding


// ------------------------------------------
// 🔹 RULE 4: final methods
// ------------------------------------------

// final method cannot be overridden


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Can we override static method?
// 👉 No (method hiding happens)

// ❓ What is covariant return type?
// 👉 Child can return subclass type

// ❓ Can we reduce access modifier?
// 👉 No


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ Overriding → runtime
// ✔ static → not overridden
// ✔ final → cannot override
// ✔ return type → can be subclass