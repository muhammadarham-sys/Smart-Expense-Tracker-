package gui;

import model.FoodExpense;
import service.ExpenseManager;
import utils.DateUtil;
import utils.Validator;

import javax.swing.*;

public class AddExpenseFrame extends JFrame {

    public AddExpenseFrame() {
        setTitle("Add Expense");
        setSize(300, 250);
        setLayout(null);

        JTextField amountField = new JTextField();
        amountField.setBounds(100, 30, 120, 25);

        JTextField descField = new JTextField();
        descField.setBounds(100, 70, 120, 25);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(100, 120, 100, 30);

        add(new JLabel("Amount")).setBounds(20, 30, 80, 25);
        add(amountField);
        add(new JLabel("Desc")).setBounds(20, 70, 80, 25);
        add(descField);
        add(addBtn);

        addBtn.addActionListener(e -> {
            if (Validator.isValidAmount(amountField.getText())) {
                FoodExpense exp = new FoodExpense(
                        "1",
                        Double.parseDouble(amountField.getText()),
                        DateUtil.now(),
                        descField.getText()
                );

                ExpenseManager.addExpense(exp);
                JOptionPane.showMessageDialog(this, "Added!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid amount");
            }
        });
    }
}