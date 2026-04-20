// ==========================================
// TOPIC: OBJECT CLASS (toString, equals, hashCode)
// ==========================================

// 👉 Every class in Java extends Object class
// 👉 Important methods:
// 1. toString()
// 2. equals()
// 3. hashCode()


// ==========================================
// 📦 CLASS
// ==========================================

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    // ------------------------------------------
    // 🔥 toString() (PRINT OBJECT)
    // ------------------------------------------

    @Override
    public String toString() {
        return "Student name: " + name;
    }

    // ------------------------------------------
    // 🔥 equals() (COMPARE VALUES)
    // ------------------------------------------

    @Override
    public boolean equals(Object obj) {

        // Step 1: same object check
        if (this == obj) return true;

        // Step 2: null check
        if (obj == null) return false;

        // Step 3: class type check
        if (getClass() != obj.getClass()) return false;

        // Step 4: casting
        Student s = (Student) obj;

        // Step 5: compare data
        return this.name.equals(s.name);
    }
    // @Override
    // public boolean equals(Object obj) {

    //     // Step 1: same object check
    //     if (this == obj) return true;

    //     // Step 2: null check
    //     if (obj == null) return false;

    //     // Step 3: class type check
    //     if (getClass() != obj.getClass()) return false;

    //     // Step 4: casting
    //     Student s = (Student) obj;

    //     // Step 5: compare data
    //     return this.name.equals(s.name);
    // }

    // ------------------------------------------
    // 🔥 hashCode() (IMPORTANT)
    // ------------------------------------------

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O03ObjectClassDeepNotes {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Aman");

        // ------------------------------------------
        // toString()
        // ------------------------------------------

        System.out.println(s1);
        // Output: Student name: Rahul


        // ------------------------------------------
        // equals()
        // ------------------------------------------

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false


        // ------------------------------------------
        // hashCode()
        // ------------------------------------------

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // 👉 same hashcode (important)
    }
}


// ==========================================
// 🧠 CORE CONCEPT (VERY IMPORTANT)
// ==========================================

// 👉 Default behavior:

// equals() → compares reference (memory address)
// ==       → compares reference

// After overriding:

// equals() → compares values


// ==========================================
// 🎯 INTERVIEW QUESTIONS (VERY IMPORTANT)
// ==========================================

// ❓ What is Object class?
// 👉 Root class of Java


// ❓ What does toString() do?
// 👉 Converts object to string (used in print)


// ❓ Why override toString()?
// 👉 To get meaningful output


// ❓ equals() vs == ?

// equals():
// 👉 Compares values

// ==:
// 👉 Compares references


// ❓ Why override equals()?
// 👉 To compare object data instead of memory


// ❓ Why override hashCode()?
// 👉 Because if equals() is true → hashCode must be same


// ❓ What is contract between equals() and hashCode()?
// 👉 If equals() returns true → hashCode must be same


// ❓ What happens if we override equals() but not hashCode()?
// 👉 Bug in collections (HashMap, HashSet)


// ❓ What is this line doing?
// Student s = (Student) obj;
// 👉 Type casting Object → Student


// ❓ What is getClass() check?
// 👉 Ensures both objects are of same class


// ==========================================
// ⚠️ INTERVIEW TRAPS
// ==========================================

// ❌ Comparing without casting → not possible

// ❌ Not checking null → NullPointerException

// ❌ Not overriding hashCode → wrong behavior in collections


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ toString() → print object
// ✔ equals() → compare values
// ✔ hashCode() → used in hashing
// ✔ Always override equals() + hashCode() together
// ✔ Use safe equals() method (null + type check)




// ==========================================
// 🔥 HASHCODE RULE (VERY IMPORTANT)
// ==========================================

// If equals() is true → hashCode MUST be same
// If equals() is false → hashCode can be same or different






// ==========================================
// 🔥 OBJECT CREATION FLOW
// ==========================================

// 1. Memory allocation (heap)
// 2. Constructor call
// 3. Reference assignment

// Example:
// Student s = new Student();

// Step 1 → object created in heap
// Step 2 → constructor runs
// Step 3 → reference assigned to s