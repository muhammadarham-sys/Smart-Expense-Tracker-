package model;

import java.util.Date;

public class FoodExpense extends Expense {
    public FoodExpense(String id, double amount, Date date, String description) {
        super(id, amount, date, Category.FOOD, description);
    }
}