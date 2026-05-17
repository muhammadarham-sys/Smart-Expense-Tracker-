package gui;

import service.ExpenseManager;
import model.Expense;

import javax.swing.*;
import java.util.List;

public class ViewExpenseFrame extends JFrame {

    public ViewExpenseFrame() {
        setTitle("View Expenses");
        setSize(400, 300);
        setLayout(null);

        JTextArea area = new JTextArea();
        area.setBounds(20, 20, 340, 200);
        area.setEditable(false);

        List<Expense> expenses = ExpenseManager.getAllExpenses();

        if (expenses.isEmpty()) {
            area.setText("No expenses found.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Expense e : expenses) {
                sb.append(e.toString()).append("\n");
            }
            area.setText(sb.toString());
        }

        add(area);
    }
}