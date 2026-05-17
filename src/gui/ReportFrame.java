package gui;

import model.Expense;
import service.ExpenseManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class ReportFrame extends JFrame {

    public ReportFrame() {
        setTitle("Interactive Expense Report");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // CENTER WINDOW
        setLocationRelativeTo(null);

        // MAIN PANEL (CENTERED LAYOUT)
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        JLabel title = new JLabel("EXPENSE REPORT DASHBOARD", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        // TABLE COLUMNS
        String[] columns = {"Date", "Category", "Description", "Amount"};

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        JTable table = new JTable(model);
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // LOAD DATA
        loadData(model);
    }

    private void loadData(DefaultTableModel model) {

        List<Expense> expenses = ExpenseManager.getAllExpenses();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for (Expense e : expenses) {

            String description = e.toString().split(" - ").length > 2
                    ? e.toString().split(" - ")[2]
                    : "";

            model.addRow(new Object[]{
                    sdf.format(e.getDate()),
                    e.getCategory(),
                    description,
                    e.getAmount()
            });
        }
    }
}