// // ==========================================
// // ⭐ TOPIC: SOLID PRINCIPLES (BASIC LEVEL)
// // ==========================================


// // ==========================================
// // 🧠 S — SINGLE RESPONSIBILITY PRINCIPLE
// // ==========================================

// // 👉 One class → one responsibility

// // ❌ WRONG

// class Report {

//     void generateReport() { }

//     void printReport() { }
// }

// // 👉 Same class doing multiple tasks


// // ✅ CORRECT

// class ReportGenerator {

//     void generateReport() { }
// }

// class ReportPrinter {

//     void printReport() { }
// }


// // ==========================================
// // 🧠 O — OPEN/CLOSED PRINCIPLE
// // ==========================================

// // 👉 Open for extension, closed for modification

// // ❌ WRONG

// class Discount {

//     void getDiscount(String type) {

//         if (type.equals("Diwali")) {
//             System.out.println("10%");
//         } else if (type.equals("NewYear")) {
//             System.out.println("20%");
//         }
//     }
// }

// // 👉 New type → code modify karna padega ❌


// // ✅ CORRECT

// interface Discount {
//     void getDiscount();
// }

// class DiwaliDiscount implements Discount {

//     public void getDiscount() {
//         System.out.println("10%");
//     }
// }

// class NewYearDiscount implements Discount {

//     public void getDiscount() {
//         System.out.println("20%");
//     }
// }
