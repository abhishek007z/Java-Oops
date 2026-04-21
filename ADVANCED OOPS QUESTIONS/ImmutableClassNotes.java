// ==========================================
// 🧊 TOPIC: IMMUTABLE CLASS (FULL NOTES)
// ==========================================

// 👉 Immutable = object cannot be changed after creation


// ==========================================
// 🧠 WHY IMMUTABLE?
// ==========================================

// ✔ Security
// ✔ Thread-safe
// ✔ Safe sharing


// ==========================================
// 🔥 RULES TO MAKE IMMUTABLE CLASS
// ==========================================

// 1. Class should be final
// 2. Variables should be private final
// 3. No setter methods
// 4. Only getter methods
// 5. No modification of data


// ==========================================
// 💻 IMMUTABLE CLASS EXAMPLE
// ==========================================

final class Student {

    private final String name;
    private final int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class ImmutableClassNotes {

    public static void main(String[] args) {

        Student s = new Student("Rahul", 20);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        // ❌ Not allowed:
        // s.name = "Aman";   // Error
    }
}


// ==========================================
// 🧠 STRING IMMUTABILITY (IMPORTANT)
// ==========================================

class StringExample {

    public static void main(String[] args) {

        String s1 = "Rahul";

        s1.concat(" Sharma");

        System.out.println(s1);

        // Output:
        // Rahul
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What is immutable class?
// 👉 Object cannot be changed after creation


// ❓ Example?
// 👉 String


// ❓ How to make immutable class?
// 👉 final class + private final variables + no setters


// ❓ Why String is immutable?
// 👉 Security + performance


// ❓ Can we modify immutable object?
// 👉 No


// ❓ What happens when we modify String?
// 👉 New object is created


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ Immutable = no change
// ✔ Use final class
// ✔ Use private final variables
// ✔ No setters
// ✔ Only getters