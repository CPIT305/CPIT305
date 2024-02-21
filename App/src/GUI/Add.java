package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame {
    private JPanel panel1;
    private JPanel panel;
    private JButton backButton;
    private JButton incomeButton;
    private JButton expensesButton;

    public Add() {
        setContentPane(panel1);
        pack(); //resizes the frame
        setLocationRelativeTo(null); //put it in center of screen
        setSize(450,500);
        setMinimumSize(new Dimension(450,500));
        setMaximumSize(new Dimension(450,500));
        setResizable(false);
        setTitle("Add Income/Expense");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                dispose();
            }
        });
        expensesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Expense();
                dispose();
            }
        });
        incomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Expense();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Add Add = new Add();
    }
}
