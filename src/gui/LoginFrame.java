package gui;

import service.UserManager;

import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel uLabel = new JLabel("Username:");
        uLabel.setBounds(20, 20, 100, 25);
        add(uLabel);

        JTextField userField = new JTextField();
        userField.setBounds(120, 20, 120, 25);
        add(userField);

        JLabel pLabel = new JLabel("Password:");
        pLabel.setBounds(20, 60, 100, 25);
        add(pLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 60, 120, 25);
        add(passField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(90, 110, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            if (UserManager.login(userField.getText(), new String(passField.getPassword()))) {
                new DashboardFrame().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });
    }
}