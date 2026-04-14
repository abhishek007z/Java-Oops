// ==========================================
// TOPIC: CONSTRUCTORS IN JAVA (FULL NOTES)
// ==========================================

// 👉 Constructor = Special method used to initialize object

// 💡 KEY POINTS:
// 1. Same name as class
// 2. No return type (not even void ❌)
// 3. Automatically called when object is created

class Car {

    String color;
    int speed;

    // ------------------------------------------
    // 1. DEFAULT CONSTRUCTOR
    // ------------------------------------------
    Car() {
        System.out.println("Default constructor called");
    }

    // ------------------------------------------
    // 2. PARAMETERIZED CONSTRUCTOR
    // ------------------------------------------
    Car(String c, int s) {
        color = c;
        speed = s;
    }

    // ------------------------------------------
    // METHOD
    // ------------------------------------------
    void display() {
        System.out.println(color + " " + speed);
    }
}


public class O03ConstructorNotes {

    public static void main(String[] args) {

        // 👉 Calls default constructor
        Car c1 = new Car();

        // 👉 Calls parameterized constructor
        Car c2 = new Car("Red", 120);

        c2.display();
    }
}


// ==========================================
// 🔥 INTERVIEW QUESTIONS (VERY IMPORTANT)
// ==========================================

// ❓ Difference: Method vs Constructor

// Method:
// 👉 Used to perform task
// 👉 Has return type
// 👉 Called manually

// Constructor:
// 👉 Used to initialize object
// 👉 No return type
// 👉 Called automatically


// ❓ Can constructor be overloaded?
// 👉 YES (multiple constructors with different parameters)


// ❓ What happens if we don’t create constructor?
// 👉 Java provides default constructor automatically


// ❓ Can constructor be private?
// 👉 Yes (used in Singleton pattern)


// ==========================================
// 🧠 COMMON MISTAKE (IMPORTANT)
// ==========================================

// ❌ Wrong (This is NOT constructor)
// void Car() { }

// 👉 Because it has return type (void)
// 👉 So it's treated as a method


// ==========================================
// 🧪 MINI PRACTICE
// ==========================================

// 👉 Create class Student:

// Variables: name, age
// Constructor: initialize values
// Method: display

// Example:

// class Student {

//     String name;
//     int age;

//     // Constructor
//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void display() {
//         System.out.println(name + " " + age);
//     }
// }

// Try in main:
// Student s1 = new Student("Rahul", 20);
// s1.display();





// Constructor chaining:
// this();   // same class
// super();  // parent class
// ❗ Hidden Rule:

// 👉 First line of constructor:

// either this() OR super() (auto hota hai)