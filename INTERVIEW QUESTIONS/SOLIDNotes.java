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

