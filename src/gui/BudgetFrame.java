package gui;

import model.Budget;
import service.BudgetManager;
import utils.Constants;

import javax.swing.*;

public class BudgetFrame extends JFrame {

    public BudgetFrame() {
        setTitle("Budget Manager");
        setSize(350, 200);
        setLayout(null);

        JLabel label = new JLabel("Set Budget:");
        label.setBounds(20, 20, 100, 25);

        JTextField budgetField = new JTextField();
        budgetField.setBounds(120, 20, 150, 25);

        JButton setBtn = new JButton("Set");
        setBtn.setBounds(120, 60, 80, 30);

        JLabel current = new JLabel("Current: " + BudgetManager.getBudget().getLimit());
        current.setBounds(20, 100, 250, 25);

        add(label);
        add(budgetField);
        add(setBtn);
        add(current);

        setBtn.addActionListener(e -> {
            try {
                double value = Double.parseDouble(budgetField.getText());
                BudgetManager.getBudget().setLimit(value);
                current.setText("Current: " + value);
                JOptionPane.showMessageDialog(this, "Budget Updated");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }
        });
    }
}