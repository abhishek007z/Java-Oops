// ==========================================
// TOPIC: ENCAPSULATION (FULL NOTES)
// ==========================================

// 👉 Encapsulation = Wrapping data + restricting direct access
// 👉 Achieved using private variables + getter/setter


// ==========================================
// 📦 CLASS
// ==========================================

class Student {

    // 🔒 PRIVATE VARIABLES (DATA HIDING)
    private String name;
    private int age;

    // ------------------------------------------
    // SETTER METHODS (SET VALUE)
    // ------------------------------------------

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {

        // 👉 VALIDATION (REAL POWER 🔥)
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // ------------------------------------------
    // GETTER METHODS (GET VALUE)
    // ------------------------------------------

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class O01EncapsulationNotes {

    public static void main(String[] args) {

        Student s1 = new Student();

        // ❌ Direct access not allowed
        // s1.name = "Rahul";

        // ✅ Use setter
        s1.setName("Rahul");
        s1.setAge(20);

        // ✅ Use getter
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // ==========================================
        // 🧪 PRACTICE
        // ==========================================

        Student s2 = new Student();

        s2.setName("Aman");
        s2.setAge(-5);   // Invalid case

        System.out.println(s2.getName());
        System.out.println(s2.getAge());  // Will show default 0
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is encapsulation?
// 👉 Wrapping data + restricting access using private


// ❓ Why private variables?
// 👉 To protect data and prevent direct access


// ❓ What are getter and setter?
// Getter → get value
// Setter → set value


// ❓ What is data hiding?
// 👉 Making variables private


// ❓ Advantage of encapsulation?
// 👉 Security, control, flexibility


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Use private variables
// ✔ Access via getter/setter
// ✔ Add validation inside setter
// ✔ Improves security