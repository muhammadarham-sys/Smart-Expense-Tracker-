package service;

public class ReportManager {
    public static String generateReport() {
        return "Total Expense: " + ExpenseManager.getTotal();
    }
}