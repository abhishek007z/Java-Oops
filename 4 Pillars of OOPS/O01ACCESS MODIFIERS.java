// ==========================================
// 🔹 TOPIC: ACCESS MODIFIERS
// ==========================================

// 👉 Controls visibility of class members

// 4 Types:

// 1. public
// 👉 Accessible everywhere

// 2. private
// 👉 Accessible only within same class

// 3. protected
// 👉 Accessible in same package + subclass

// 4. default (no keyword)
// 👉 Accessible only within same package


// ==========================================
// 📊 ACCESS TABLE (VERY IMPORTANT)
// ==========================================

// Modifier     Same Class   Same Package   Subclass   Other Package
// --------------------------------------------------------------
// public           ✔             ✔             ✔             ✔
// protected        ✔             ✔             ✔             ❌
// default          ✔             ✔             ❌             ❌
// private          ✔             ❌             ❌             ❌


// ==========================================
// 🎯 INTERVIEW QUESTIONS
// ==========================================

// ❓ Why private is used?
// 👉 To achieve encapsulation (data hiding)

// ❓ Difference: protected vs default?
// 👉 protected → accessible in subclass (even outside package)
// 👉 default → NOT accessible outside package

// ❓ Which is most restrictive?
// 👉 private

// ==========================================
// 🔥 KEY POINTS
// ==========================================

// ✔ Use private for variables
// ✔ Use public getter/setter
// ✔ Improves security