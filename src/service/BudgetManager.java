package service;

import model.Budget;

public class BudgetManager {
    private static Budget budget = new Budget(10000);

    public static Budget getBudget() {
        return budget;
    }
}