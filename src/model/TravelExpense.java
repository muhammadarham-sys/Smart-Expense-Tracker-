package model;

import java.util.Date;

public class TravelExpense extends Expense {
    public TravelExpense(String id, double amount, Date date, String description) {
        super(id, amount, date, Category.TRAVEL, description);
    }
}