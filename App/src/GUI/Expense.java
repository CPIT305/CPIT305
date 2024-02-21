
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Expense extends JFrame{
    private JButton BackButton;
    private JButton saveButton;
    private JTextField chooseCategoryTextField;
    private JTextField noteTextField;
    private JTextField chooseMethodTextField;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public Expense(){
        setContentPane(panel1);
        pack(); //resizes the frame
        setLocationRelativeTo(null); //put it in center of screen
        setSize(450,500);
        setMinimumSize(new Dimension(450,500));
        setMaximumSize(new Dimension(450,500));
        setResizable(false);
        setTitle("Add Expense");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add();
                dispose();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfirmSaves();
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        Expense Add = new Expense();
    }
}
