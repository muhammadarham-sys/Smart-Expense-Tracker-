package gui;

import service.ExpenseManager;

import javax.swing.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton addExpense = new JButton("Add Expense");
        addExpense.setBounds(100, 50, 200, 30);

        JButton viewReport = new JButton("View Report");
        viewReport.setBounds(100, 100, 200, 30);

        add(addExpense);
        add(viewReport);

        addExpense.addActionListener(e -> new AddExpenseFrame().setVisible(true));

        viewReport.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Total: " + ExpenseManager.getTotal()));
    }
}