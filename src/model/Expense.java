package model;

import java.io.Serializable;
import java.util.Date;

public abstract class Expense implements Serializable {
    protected String id;
    protected double amount;
    protected Date date;
    protected Category category;
    protected String description;

    public Expense(String id, double amount, Date date, Category category, String description) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public double getAmount() { return amount; }
    public Category getCategory() { return category; }
    public Date getDate() { return date; }

    public String toString() {
        return category + " - " + amount + " - " + description;
    }
}