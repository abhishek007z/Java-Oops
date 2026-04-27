// ==========================================
// TOPIC: ABSTRACT CLASS vs INTERFACE
// ==========================================


// ==========================================
// ABSTRACT CLASS
// ==========================================


abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// INTERFACE
// ==========================================

interface Animal2 {

    void sound();
}

class Cat implements Animal2 {

    public void sound() {
        System.out.println("Cat meows");
    }
}


// ==========================================
// MAIN CLASS
// ==========================================

public class AbstractVsInterfaceNotes {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();

        Animal2 b = new Cat();

        b.sound();
    }
}



// ✅ OUTPUT
// Dog barks
// Animal eats
// Cat meows

// ❓ Difference between abstract class and interface?

// Abstract:
// 👉 Partial abstraction
// 👉 Can have constructor

// Interface:
// 👉 Full abstraction
// 👉 No constructor


// ❓ Can abstract class have constructor?
// 👉 Yes


// ❓ Can interface have constructor?
// 👉 No


// ❓ Can interface have method body?
// 👉 Yes (default & static)


// ❓ Can we extend multiple classes?
// 👉 No


// ❓ Can we implement multiple interfaces?
// 👉 Yes


// ❓ Which is faster?
// 👉 No major difference (design choice)


// ❓ Real use of interface?
// 👉 Multiple inheritance + loose coupling

// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ Abstract = partial
// ✔ Interface = full abstraction
// ✔ Interface supports multiple inheritance





// ⚔️ MAIN DIFFERENCE (BOLNE WALA ANSWER 🔥)
// 🗣️ Hinglish (BEST ANSWER)

// Abstract class partial abstraction provide karti hai, jisme methods ka implementation ho sakta hai,
// jabki interface full abstraction provide karta hai aur mainly rules define karta hai.
// Abstract class me constructor ho sakta hai, lekin interface me nahi hota.
// Aur interface multiple inheritance support karta hai, jabki abstract class nahi karti.

// 🗣️ Easy English (INTERVIEW READY ⭐)

// An abstract class provides partial abstraction and can have both abstract and normal methods.
// An interface provides full abstraction and is mainly used to define rules.
// An abstract class can have a constructor, but an interface cannot.
// Also, interfaces support multiple inheritance, while abstract classes do not.




// 🔥 PARTIAL ABSTRACTION KYA HOTA HAI?

// 👉 Jab class me kuch methods abstract hote hain aur kuch methods normal (complete) hote hain
// 👉 Usko bolte hain Partial Abstraction



// abstract class Animal {

//     // Abstract method (no body)
//     abstract void sound();

//     // Normal method
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {

//     // Must override abstract method
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class PartialAbstractionDemo {
//     public static void main(String[] args) {

//         Animal a = new Dog();

//         a.sound(); // Dog barks
//         a.eat();   // Animal is eating
//     }
// }

