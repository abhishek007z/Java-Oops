// ==========================================
// ⭐ TOPIC: OUTPUT BASED QUESTIONS
// ==========================================


// ==========================================
// 🔹 1. STRING IMMUTABILITY
// ==========================================

class Test1 {

    public static void main(String[] args) {

        String s = "Hello";

        s.concat(" World");

        System.out.println(s);
    }
}

// 👉 OUTPUT:
// Hello

// 👉 WHY:
// String immutable hai → new object bana but assign nahi kiya



// ==========================================
// 🔹 2. STRING WITH ASSIGNMENT
// ==========================================

class Test2 {

    public static void main(String[] args) {

        String s = "Hello";

        s = s.concat(" World");

        System.out.println(s);
    }
}

// 👉 OUTPUT:
// Hello World

// 👉 WHY:
// New object bana aur assign ho gaya



// ==========================================
// 🔹 3. == vs equals()
// ==========================================

class Test3 {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

// 👉 OUTPUT:
// false
// true

// 👉 WHY:
// == → reference compare
// equals() → value compare



// ==========================================
// 🔹 4. METHOD OVERLOADING
// ==========================================

class Test4 {

    void show(int a) {
        System.out.println("int");
    }

    void show(double a) {
        System.out.println("double");
    }

    public static void main(String[] args) {

        Test4 t = new Test4();

        t.show(5);
    }
}

// 👉 OUTPUT:
// int

// 👉 WHY:
// int exact match mil gaya



// ==========================================
// 🔹 5. METHOD OVERRIDING
// ==========================================

class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog");
    }
}

class Test5 {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}

// 👉 OUTPUT:
// Dog

// 👉 WHY:
// Runtime pe child method call hota hai



// ==========================================
// 🔹 6. STATIC METHOD
// ==========================================

class Test6 {

    static void show() {
        System.out.println("Static");
    }

    public static void main(String[] args) {

        Test6 t = new Test6();
        t.show();
    }
}

// 👉 OUTPUT:
// Static

// 👉 WHY:
// Static method class ka hota hai



// ==========================================
// 🔹 7. CONSTRUCTOR CALL ORDER
// ==========================================

class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        System.out.println("B");
    }
}

class Test7 {

    public static void main(String[] args) {

        B obj = new B();
    }
}

// 👉 OUTPUT:
// A
// B

// 👉 WHY:
// Parent constructor first call hota hai



// ==========================================
// 🔹 8. THIS KEYWORD
// ==========================================

class Test8 {

    int x = 10;

    void show(int x) {
        System.out.println(this.x);
    }

    public static void main(String[] args) {

        Test8 t = new Test8();
        t.show(20);
    }
}

// 👉 OUTPUT:
// 10

// 👉 WHY:
// this.x → instance variable



// ==========================================
// 🔥 KEY POINTS (VERY IMPORTANT)
// ==========================================

// ✔ String immutable
// ✔ == vs equals()
// ✔ Overloading = compile time
// ✔ Overriding = runtime
// ✔ Parent constructor first
// ✔ this → current object