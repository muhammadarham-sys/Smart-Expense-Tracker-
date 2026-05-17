package gui;

import model.Category;
import service.CategoryManager;

import javax.swing.*;

public class CategoryFrame extends JFrame {

    public CategoryFrame() {
        setTitle("Category Manager");
        setSize(350, 300);
        setLayout(null);

        JTextArea area = new JTextArea();
        area.setBounds(20, 20, 150, 200);

        JTextField newCategory = new JTextField();
        newCategory.setBounds(200, 20, 120, 25);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(200, 60, 80, 30);

        refresh(area);

        add(area);
        add(newCategory);
        add(addBtn);

        addBtn.addActionListener(e -> {
            try {
                Category category = Category.valueOf(newCategory.getText().toUpperCase());
                CategoryManager.addCategory(category);
                refresh(area);
                JOptionPane.showMessageDialog(this, "Added");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Category");
            }
        });
    }

    private void refresh(JTextArea area) {
        StringBuilder sb = new StringBuilder();
        for (Category c : CategoryManager.getAllCategories()) {
            sb.append(c).append("\n");
        }
        area.setText(sb.toString());
    }
}