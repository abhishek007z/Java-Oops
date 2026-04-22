// TOPIC: ASSOCIATION / AGGREGATION / COMPOSITION (OOP RELATIONSHIPS)

// ---

// 1. ASSOCIATION

// Definition:
// Association ek relationship hai jisme do classes ek dusre ko use karti hain.

// Simple Meaning:
// Uses-A relationship (ek class dusri ko use karti hai)

// Key Idea:

// * No ownership
// * No dependency
// * Sirf connection hota hai

// Real-Life Example:
// Teacher teaches Student

// Code Example:

// class Student {
// String name;

// ```
// Student(String name) {
//     this.name = name;
// }
// ```

// }

// class Teacher {

// ```
// void teach(Student s) {
//     System.out.println("Teaching " + s.name);
// }
// ```

// }

// Explanation:

// * Teacher class ke paas Student permanently nahi hai
// * Sirf method me use ho raha hai
// * Dono objects independently exist kar sakte hain

// Conclusion:
// Association = loose connection + temporary usage

// ---

// 2. AGGREGATION

// Definition:
// Aggregation ek weak HAS-A relationship hai jisme ek class dusri class ka object rakhti hai, lekin wo object independently exist kar sakta hai.

// Simple Meaning:
// HAS-A (but independent)

// Key Idea:

// * Weak ownership
// * Objects independent hote hain

// Real-Life Example:
// Department has Students

// Code Example:

// class Student2 {
// String name;

// ```
// Student2(String name) {
//     this.name = name;
// }
// ```

// }

// class Department {

// ```
// Student2 student;

// Department(Student2 student) {
//     this.student = student;
// }

// void show() {
//     System.out.println("Student: " + student.name);
// }
// ```

// }

// Explanation:

// * Student object bahar create hota hai
// * Department usko receive karta hai
// * Student independently exist kar sakta hai

// Conclusion:
// Aggregation = HAS-A + independent objects

// ---

// 3. COMPOSITION

// Definition:
// Composition ek strong HAS-A relationship hai jisme ek object dusre par fully depend hota hai.

// Simple Meaning:
// HAS-A (strong and dependent)

// Key Idea:

// * Strong ownership
// * Dependent objects
// * Lifecycle same hota hai

// Real-Life Example:
// Car has Engine

// Code Example:

// class Engine {

// ```
// void start() {
//     System.out.println("Engine starts");
// }
// ```

// }

// class Car {

// ```
// Engine engine = new Engine();

// void startCar() {
//     engine.start();
// }
// ```

// }

// Explanation:

// * Engine object Car ke andar hi create ho raha hai
// * Bahar se pass nahi ho raha
// * Engine independently exist nahi karta

// Conclusion:
// Composition = strong HAS-A + dependency

// ---

// 4. DIFFERENCE TABLE

// ## Feature            Association        Aggregation         Composition

// Relation           Uses-A            HAS-A (weak)        HAS-A (strong)
// Ownership          No                Weak                Strong
// Dependency         No                No                  Yes
// Object Life        Independent       Independent         Dependent

// ---

// 5. KEY UNDERSTANDING (IMPORTANT)

// Association:

// * Sirf connection hota hai
// * No ownership

// Aggregation:

// * Object rakha hota hai
// * But independently exist karta hai

// Composition:

// * Object fully depend karta hai
// * Owner ke bina exist nahi karta

// ---

// 6. MEMORY TRICK

// Association:
// "Bas use kar raha hai"

// Aggregation:
// "Mere paas hai but independent"

// Composition:
// "Mere bina tu kuch nahi"

// ---

// 7. INTERVIEW QUESTIONS

// Q: What is association?
// A: Relationship between two classes where one uses another

// Q: What is aggregation?
// A: Weak HAS-A relationship where objects are independent

// Q: What is composition?
// A: Strong HAS-A relationship where objects are dependent

// Q: Difference between aggregation and composition?

// Aggregation:

// * Independent objects

// Composition:

// * Dependent objects

// Q: Example of aggregation?
// A: Department has Student

// Q: Example of composition?
// A: Car has Engine

// ---


// 8. FINAL SUMMARY

// Association = Uses-A (no ownership)
// Aggregation = HAS-A (weak, independent)
// Composition = HAS-A (strong, dependent)

// ---

// 9. GOLDEN INTERVIEW LINE

// Association is a general relationship, aggregation is a weak HAS-A relationship with independent objects, and composition is a strong HAS-A relationship with dependent objects.
