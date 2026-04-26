// ==========================================
// ⭐ TOPIC: SCENARIO QUESTIONS (DESIGN BASED)
// ==========================================


// ==========================================
// 🔹 SCENARIO 1: STUDENT CLASS
// ==========================================

// 👉 Requirement:
// name, age
// display method

class Student {

    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    void display() {
        System.out.println(name + " " + age);
    }
}


// ==========================================
// 🔹 SCENARIO 2: BANK ACCOUNT
// ==========================================

// 👉 Requirement:
// deposit, withdraw, balance

class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}


// ==========================================
// 🔹 SCENARIO 3: INHERITANCE (EMPLOYEE)
// ==========================================

class Employee {

    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {

    void manage() {
        System.out.println("Manager manages team");
    }
}


// ==========================================
// 🔹 SCENARIO 4: INTERFACE (PAYMENT SYSTEM)
// ==========================================

interface Payment {

    void pay();
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Paid using UPI");
    }
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class ScenarioQuestionsNotes {

    public static void main(String[] args) {

        // Student
        Student s = new Student("Rahul", 20);
        s.display();

        // Bank
        BankAccount b = new BankAccount(1000);
        b.deposit(500);
        b.withdraw(200);
        b.showBalance();

        // Inheritance
        Manager m = new Manager();
        m.work();
        m.manage();

        // Interface
        Payment p = new UPI();
        p.pay();
    }
}