// ==========================================
// TOPIC: CONSTRUCTOR DEEP DIVE (FULL NOTES)
// ==========================================

// 👉 Constructor chaining using this() and super()


// ==========================================
// 🧱 SAME CLASS CHAINING (this())
// ==========================================

class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        this("Default", 18);   // 👉 calls parameterized
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}


// ==========================================
// 🧱 PARENT CLASS
// ==========================================

class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}


// ==========================================
// 🧱 CHILD CLASS
// ==========================================

class Dog extends Animal {

    Dog() {
        super();   // 👉 calls parent constructor
        System.out.println("Dog constructor");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O01ConstructorDeepNotes {

    public static void main(String[] args) {

        // ------------------------------------------
        // this() example
        // ------------------------------------------

        Student s = new Student();

        // ------------------------------------------
        // super() example
        // ------------------------------------------

        Dog d = new Dog();
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is constructor chaining?
// 👉 Calling one constructor from another


// ❓ this() vs super()?

// this():
// 👉 Calls same class constructor

// super():
// 👉 Calls parent class constructor


// ❓ Can we use both together?
// 👉 No


// ❓ What if super() not written?
// 👉 Java calls it automatically


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ this() → same class
// ✔ super() → parent class
// ✔ Must be first line
// ✔ Only one allowed



// ==========================================
// ⚠️ IMPORTANT: super() AUTOMATIC CALL (INTERVIEW TRAP)
// ==========================================

// 👉 Even if we DO NOT write super()
// 👉 Java automatically calls parent constructor

// class Parent1 {

//     Parent1() {
//         System.out.println("Parent constructor");
//     }
// }

// class Child1 extends Parent1 {

//     Child1() {
//         // super();  ❌ not written
//         System.out.println("Child constructor");
//     }
// }

// 👉 Output:
// Parent constructor
// Child constructor


// ==========================================
// ❌ ERROR CASE (VERY IMPORTANT)
// ==========================================

// 👉 If parent does NOT have default constructor

// class Parent2 {

//     Parent2(String name) {
//         System.out.println("Parent parameterized");
//     }
// }

// class Child2 extends Parent2 {

//     Child2() {
//         // super();  // ❌ Java tries to call default constructor
//         System.out.println("Child constructor");
//     }
// }

// 👉 ❌ COMPILE-TIME ERROR
// 👉 Because Parent2 has NO default constructor


// ==========================================
// ✅ SOLUTION
// ==========================================

// class Child3 extends Parent2 {

//     Child3() {
//         super("Dog");   // ✔ explicitly calling parent constructor
//         System.out.println("Child constructor");
//     }
// }


// ==========================================
// 🎯 INTERVIEW QUESTIONS (IMPORTANT)
// ==========================================

// ❓ What happens if we don’t write super()?
// 👉 Java automatically inserts super()


// ❓ When will it fail?
// 👉 When parent class has NO default constructor


// ❓ Why parent constructor runs first?
// 👉 Because parent part must be initialized first


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ super() is automatically added by Java
// ✔ Parent constructor always executes first
// ✔ If no default constructor → error
// ✔ Must call parameterized constructor manually








// ==========================================
// 🔥 CONSTRUCTOR EXECUTION FLOW (INTERVIEW)
// ==========================================

// Order of execution:

// 1. Parent constructor
// 2. Child constructor

// Example:
// Dog d = new Dog();

// Output:
// Animal constructor
// Dog constructor





// ==========================================
// 🔥 STATIC IMPORTANT RULES
// ==========================================

// ❓ Can static method access non-static?
// 👉 ❌ No (directly)

// ❓ Can non-static access static?
// 👉 ✔ Yes

// ❓ Why static used?
// 👉 Memory saving (shared across objects)


// ==========================================
// 🔥 STATIC BLOCK (IMPORTANT)
// ==========================================

// static {
//     System.out.println("Static block runs first");
// }