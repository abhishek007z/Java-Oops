// ==========================================
// TOPIC: KEYWORDS (static, final, this, super)
// ==========================================


// ==========================================
// 🔥 STATIC KEYWORD
// ==========================================

class Student {

    String name;
    static String college = "ABC";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + college);
    }

    static void show() {
        System.out.println("Static method");
    }
}


// ==========================================
// 🔥 FINAL KEYWORD
// ==========================================

final class A {
    // Cannot be inherited
}

class B {

    final int x = 10;

    final void show() {
        System.out.println("Final method");
    }
}


// ==========================================
// 🔥 THIS KEYWORD
// ==========================================

class TestThis {

    String name;

    TestThis(String name) {
        this.name = name;
    }
}


// ==========================================
// 🔥 SUPER KEYWORD
// ==========================================

class Parent {

    String name = "Parent";

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    String name = "Child";

    void display() {

        System.out.println(name);        // Child
        System.out.println(super.name);  // Parent

        super.show();
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O02KeywordsNotes {

    public static void main(String[] args) {

        // STATIC
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Aman");

        s1.display();
        s2.display();

        Student.show();

        // SUPER
        Child c = new Child();
        c.display();
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is static?
// 👉 Belongs to class, shared by all objects


// ❓ What is final?
// 👉 Constant / cannot change


// ❓ What is this?
// 👉 Refers to current object


// ❓ What is super?
// 👉 Refers to parent object


// ❓ static vs non-static?

// static:
// 👉 class level

// non-static:
// 👉 object level


// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ static → shared
// ✔ final → constant
// ✔ this → current object
// ✔ super → parent object








// ==========================================
// 🔥 PRACTICAL USAGE OF static & super
// ==========================================

// STATIC METHOD USAGE

// class StaticDemo {

//     static void show() {
//         System.out.println("Static method called");
//     }
// }

// Call:
// StaticDemo.show();


// SUPER KEYWORD USAGE

// class ParentDemo {

//     String name = "Parent";

//     void show() {
//         System.out.println("Parent method");
//     }
// }

// class ChildDemo extends ParentDemo {

//     String name = "Child";

//     void display() {

//         // Access parent variable
//         System.out.println(super.name);

//         // Call parent method
//         super.show();
//     }
// }





// ==========================================
// 🔥 FINAL KEYWORD TYPES
// ==========================================

// final variable → constant
// final method → cannot override
// final class → cannot inherit


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Can we make constructor final?
// 👉 ❌ No

// ❓ Can final variable change?
// 👉 ❌ No (once assigned)