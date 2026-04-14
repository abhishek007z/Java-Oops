// ===============================
// TOPIC: CLASS & OBJECT (OOPS)
// ===============================

// 👉 Class = Blueprint / Template
// It defines properties (variables) and behavior (methods)

class Car {

    // 👉 Variables (also called attributes or properties)
    String color;
    int speed;

    // 👉 Method (behavior of object)
    void drive() {
        System.out.println("Car is driving");
    }
}


// 👉 Main class (Execution starts from here)
public class O01ClassObjectNotes {

    public static void main(String[] args) {

        // ===============================
        // OBJECT CREATION
        // ===============================

        // Syntax:
        // ClassName referenceVariable = new ClassName();

        Car c1 = new Car();   // 👉 Object 1 created
        Car c2 = new Car();   // 👉 Object 2 created

        // ===============================
        // ASSIGN VALUES
        // ===============================

        c1.color = "Red";
        c1.speed = 120;

        c2.color = "Blue";
        c2.speed = 90;

        // ===============================
        // ACCESS METHODS
        // ===============================

        c1.drive();   // Output: Car is driving
        c2.drive();

        // ===============================
        // PRINT VALUES
        // ===============================

        System.out.println("Car 1 Color: " + c1.color);
        System.out.println("Car 1 Speed: " + c1.speed);

        System.out.println("Car 2 Color: " + c2.color);
        System.out.println("Car 2 Speed: " + c2.speed);


        // ===============================
        // MEMORY CONCEPT (IMPORTANT 🔥)
        // ===============================

        // 👉 c1 and c2 → stored in STACK
        // 👉 new Car() → object stored in HEAP

        // Each object has its own separate data


        // ===============================
        // INTERVIEW POINTS
        // ===============================

        // 1. One class can create multiple objects ✔
        // 2. Object stores actual data ✔
        // 3. Class does NOT occupy memory until object is created ✔

        //Class is a blueprint that defines properties and behavior, while an object is an instance of that class which occupies memory and contains actual data.


//🔥 Important Upgrade:
// Class memory leta hai jab JVM load karti hai      (Method Area)
// 👉 “Class does NOT occupy memory” → ❌ fully correct nahi
    }
}