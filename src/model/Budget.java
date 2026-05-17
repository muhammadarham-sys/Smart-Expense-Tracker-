package model;

public class Budget {
    private double limit;

    public Budget(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}