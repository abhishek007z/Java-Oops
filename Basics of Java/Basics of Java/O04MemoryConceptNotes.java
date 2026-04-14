// ==========================================
// TOPIC: STACK vs HEAP MEMORY (FULL NOTES)
// ==========================================

// 👉 This topic is VERY IMPORTANT for interviews 🔥
// 👉 It explains how Java stores objects and variables

// ==========================================
// 🧠 CORE CONCEPT (SIMPLE LANGUAGE)
// ==========================================

// 🔹 STACK MEMORY:
// 👉 Stores:
// - Reference variables
// - Method calls
// - Local variables

// Example:
// Student s1;  👉 stored in STACK


// 🔹 HEAP MEMORY:
// 👉 Stores:
// - Actual objects
// - Instance variables

// Example:
// new Student("Rahul", 20); 👉 stored in HEAP


// ==========================================
// 📦 CLASS DEFINITION
// ==========================================

class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}


// ==========================================
// 🚀 MAIN CLASS (EXECUTION STARTS HERE)
// ==========================================

public class O04MemoryConceptNotes {

    public static void main(String[] args) {

        // ==========================================
        // 🔥 OBJECT CREATION
        // ==========================================

        // 👉 When this line runs:
        // Student s1 = new Student("Rahul", 20);

        Student s1 = new Student("Rahul", 20);

        // 📌 Step 1:
        // s1 → created in STACK

        // 📌 Step 2:
        // Object created in HEAP
        // name = Rahul
        // age = 20

        // 📌 Step 3:
        // s1 → points to that object (reference)

        s1.display();


        // ==========================================
        // 🔥 MULTIPLE OBJECTS
        // ==========================================

        Student s2 = new Student("Aman", 22);

        s2.display();


        // ==========================================
        // ⚠️ INTERVIEW TRAP (VERY IMPORTANT)
        // ==========================================

        Student s3 = new Student("Rohit", 25);
        Student s4 = s3;   // 👉 Both refer SAME object

        s4.name = "Changed Name";

        // 👉 Output will surprise beginners
        s3.display();   // 👉 Changed Name 25


        // ==========================================
        // 🧪 PRACTICE (TRY YOURSELF)
        // ==========================================

        Student p1 = new Student("Rahul", 20);
        Student p2 = p1;

        p2.name = "Aman";

        // ❓ Guess output before running
        p1.display();   // 👉 Aman 20
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS (VERY IMPORTANT)
// ==========================================

// ❓ Difference between Stack & Heap?

// STACK:
// 👉 Stores reference variables
// 👉 Fast memory
// 👉 Smaller size

// HEAP:
// 👉 Stores objects
// 👉 Slower than stack
// 👉 Larger memory


// ❓ Where are objects stored?
// 👉 Heap memory


// ❓ Where are reference variables stored?
// 👉 Stack memory


// ❓ What is reference variable?
// 👉 Variable that stores address of object


// ❓ Can two references point to same object?
// 👉 YES (very important)


// ==========================================
// 💡 REAL-LIFE ANALOGY
// ==========================================

// 👉 Stack = Remote control
// 👉 Heap = TV

// 👉 Remote (reference) controls TV (object)


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Object → Heap
// ✔ Reference → Stack
// ✔ One object → multiple references possible
// ✔ Changing via one reference affects all



// 🧠 Deep Understanding:
// 👉 Important Correction:
// Reference variable stack me hota hai ✔
// Object heap me ✔

// BUT…

// 👉 Instance variables (inside object) → Heap
// 👉 Local variables → Stack

// 🔥 VERY IMPORTANT INTERVIEW TRAP
// Student s1 = new Student("Rahul", 20);
// Student s2 = new Student("Rahul", 20);

// System.out.println(s1 == s2); // ❓

// 👉 Answer: false

// ✔ Because:

// Different objects in heap