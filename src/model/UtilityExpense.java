package model;

import java.util.Date;

public class UtilityExpense extends Expense {
    public UtilityExpense(String id, double amount, Date date, String description) {
        super(id, amount, date, Category.UTILITY, description);
    }
}