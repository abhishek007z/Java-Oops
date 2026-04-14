// ==========================================
// TOPIC: METHODS IN JAVA (FULL NOTES)
// ==========================================

// 👉 Method = A block of code that performs a specific task
// 👉 It helps in code reusability and readability

class Calculator {

    // ------------------------------------------
    // 1. Method WITHOUT parameter & WITHOUT return
    // ------------------------------------------
    void sayHello() {
        System.out.println("Hello!");
    }

    // ------------------------------------------
    // 2. Method WITH parameter
    // ------------------------------------------
    void greet(String name) {
        System.out.println("Hello " + name);
    }

    // ------------------------------------------
    // 3. Method WITH return type
    // ------------------------------------------
    int add(int a, int b) {
        return a + b;
    }
}


public class O02MethodNotes {

    public static void main(String[] args) {

        // 👉 Object creation
        Calculator calc = new Calculator();

        // ------------------------------------------
        // METHOD CALLING
        // ------------------------------------------

        calc.sayHello();              // No parameter
        calc.greet("Aman");           // Passing argument

        int result = calc.add(10, 20);
        System.out.println("Sum: " + result);
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS (IMPORTANT)
// ==========================================

// ❓ What is a method signature?
// 👉 Method name + parameters
// Example: add(int a, int b)

// ❓ Difference between parameter & argument?

// 👉 Parameter:
// Variables in method definition
// Example: int a, int b

// 👉 Argument:
// Actual values passed during method call
// Example: add(10, 20)

// ❓ Can a method return multiple values?
// 👉 No (only one), but we can use array/object

// ❓ Can we overload methods?
// 👉 Yes (same name, different parameters) (we'll study later)




// 🔥 Extra Points (INTERVIEW GOLD)
// Method signature = name + parameters (NOT return type)

// Java me:

// add(int a, int b)  ✔
// ❗ Important:
// int add(int a, int b)
// double add(int a, int b) ❌

// 👉 Return type change karke overloading allowed nahi