package service;

import model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private static List<Expense> expenses = new ArrayList<>();

    public static void addExpense(Expense e) {
        expenses.add(e);
    }

    public static List<Expense> getAllExpenses() {
        return expenses;
    }

    public static double getTotal() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }
}