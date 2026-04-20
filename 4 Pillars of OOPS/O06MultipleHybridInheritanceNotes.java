// ==========================================
// TOPIC: MULTIPLE & HYBRID INHERITANCE (JAVA)
// ==========================================

// 👉 VERY IMPORTANT FOR INTERVIEWS 🔥


// ==========================================
// 🧠 CORE CONCEPT
// ==========================================

// ❌ Java DOES NOT support multiple inheritance using classes
// 👉 Because of DIAMOND PROBLEM (ambiguity)

// ✔ Java supports multiple inheritance using INTERFACES


// ==========================================
// 💎 DIAMOND PROBLEM
// ==========================================

//        A
//       / \
//      B   C
//       \ /
//        D

// 👉 If B and C both have same method
// 👉 D gets confused → which method to use?


// ==========================================
// ❌ MULTIPLE INHERITANCE USING CLASS (NOT ALLOWED)
// ==========================================

// class A { }
// class B { }

// class C extends A, B { }   // ❌ ERROR


// ==========================================
// ✅ MULTIPLE INHERITANCE USING INTERFACE
// ==========================================

interface A {

    void show();
}

interface B {

    void display();
}

class C implements A, B {

    @Override
    public void show() {
        System.out.println("From Interface A");
    }

    @Override
    public void display() {
        System.out.println("From Interface B");
    }
}


// ==========================================
// 🧱 HYBRID INHERITANCE
// ==========================================

// 👉 Combination of:
// Single + Multiple + Hierarchical

// 👉 Achieved using class + interface


class Parent {

    void parentMethod() {
        System.out.println("From Parent Class");
    }
}

interface X {
    void methodX();
}

interface Y {
    void methodY();
}


// Child class
class Child extends Parent implements X, Y {

    @Override
    public void methodX() {
        System.out.println("From Interface X");
    }

    @Override
    public void methodY() {
        System.out.println("From Interface Y");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O06MultipleHybridInheritanceNotes {

    public static void main(String[] args) {

        // ==========================================
        // MULTIPLE INHERITANCE TEST
        // ==========================================

        C obj1 = new C();

        obj1.show();
        obj1.display();


        // ==========================================
        // HYBRID INHERITANCE TEST
        // ==========================================

        Child obj2 = new Child();

        obj2.parentMethod(); // from class
        obj2.methodX();      // from interface
        obj2.methodY();      // from interface
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Does Java support multiple inheritance?
// 👉 No (with classes), Yes (with interfaces)


// ❓ Why multiple inheritance not supported in Java?
// 👉 Because of Diamond Problem (ambiguity)


// ❓ What is Diamond Problem?
// 👉 Same method from multiple parents → confusion


// ❓ How to achieve multiple inheritance in Java?
// 👉 Using interfaces


// ❓ What is hybrid inheritance?
// 👉 Combination of multiple types of inheritance


// ❓ Can a class extend multiple classes?
// 👉 No


// ❓ Can a class implement multiple interfaces?
// 👉 Yes


// ==========================================
// ⚠️ INTERVIEW TRAP
// ==========================================

// 👉 If two interfaces have same method name:

// interface A1 {
//     void show();
// }

// interface B1 {
//     void show();
// }

// class Test implements A1, B1 {

//     public void show() {
//         System.out.println("Common implementation");
//     }
// }

// 👉 No confusion, because class provides implementation


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Class → cannot support multiple inheritance
// ✔ Interface → supports multiple inheritance
// ✔ Hybrid = class + interface
// ✔ Diamond problem avoided using interface



