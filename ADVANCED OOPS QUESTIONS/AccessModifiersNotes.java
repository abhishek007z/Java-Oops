// ==========================================
// 🔐 TOPIC: ACCESS MODIFIERS (FULL NOTES)
// ==========================================

// 👉 Access modifiers control visibility of:
// class, variables, methods


// ==========================================
// 🧠 TYPES OF ACCESS MODIFIERS
// ==========================================

// 1. public
// 2. private
// 3. protected
// 4. default (no keyword)


// ==========================================
// 🔹 1. PUBLIC
// ==========================================

// 👉 Accessible everywhere

class PublicExample {

    public int x = 10;
}


// ==========================================
// 🔹 2. PRIVATE
// ==========================================

// 👉 Accessible only within same class

class PrivateExample {

    private int x = 20;

    void show() {
        System.out.println(x); // ✔ allowed
    }
}


// ==========================================
// 🔹 3. PROTECTED
// ==========================================

// 👉 Same package + child class

class ProtectedExample {

    protected int x = 30;
}


// ==========================================
// 🔹 4. DEFAULT (NO KEYWORD)
// ==========================================

// 👉 Same package only

class DefaultExample {

    int x = 40;   // default
}


// ==========================================
// 🚀 MAIN CLASS
// ==========================================

public class AccessModifiersNotes {

    public static void main(String[] args) {

        PublicExample p = new PublicExample();
        System.out.println(p.x);   // ✔ public

        PrivateExample pr = new PrivateExample();
        // System.out.println(pr.x); ❌ private not accessible

        ProtectedExample pt = new ProtectedExample();
        System.out.println(pt.x);  // ✔ same package

        DefaultExample d = new DefaultExample();
        System.out.println(d.x);   // ✔ same package
    }
}


// ==========================================
// 🧠 ACCESS TABLE (VERY IMPORTANT)
// ==========================================

// Modifier      Same Class   Same Package   Child Class   Different Package
// ------------------------------------------------------------------------
// public           ✔              ✔             ✔               ✔
// protected        ✔              ✔             ✔               ❌
// default          ✔              ✔             ❌               ❌
// private          ✔              ❌             ❌               ❌


// ==========================================
// 🎯 PRIVATE vs PROTECTED (IMPORTANT)
// ==========================================

// 👉 PRIVATE: Only same class
// 👉 PROTECTED: Same package + inheritance


// ==========================================
// 💻 CODE: PRIVATE vs PROTECTED
// ==========================================

class Parent {

    private int a = 10;
    protected int b = 20;

    void showParent() {
        System.out.println(a); // ✔
        System.out.println(b); // ✔
    }
}

class Child extends Parent {

    void showChild() {

        // System.out.println(a); ❌ private not accessible

        System.out.println(b); // ✔ protected accessible
    }
}


// ==========================================
// 🚀 TEST CLASS
// ==========================================

class TestAccess {

    public static void main(String[] args) {

        Child c = new Child();

        c.showChild();

        // Output:
        // 20
    }
}


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ What are access modifiers?
// 👉 Control visibility of variables/methods


// ❓ Types?
// 👉 public, private, protected, default


// ❓ Difference private vs protected?

// private:
// 👉 Only same class

// protected:
// 👉 Same package + child class


// ❓ Most restrictive?
// 👉 private


// ❓ Most open?
// 👉 public


// ==========================================
// 🔥 KEY POINTS (REVISION)
// ==========================================

// ✔ public → everywhere
// ✔ private → class only
// ✔ protected → package + child
// ✔ default → package only