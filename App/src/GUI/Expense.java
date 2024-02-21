<<<<<<< HEAD:App/src/GUI/Expense.java
package GUI;

=======
>>>>>>> 084eb9a973b1d84698417bfad3d6dbe757eb81d9:CPIT305/App/src/Expense.java
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
<<<<<<< HEAD:App/src/GUI/Expense.java
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfirmSaves();
                dispose();
            }
        });
=======
>>>>>>> 084eb9a973b1d84698417bfad3d6dbe757eb81d9:CPIT305/App/src/Expense.java
    }

    public static void main(String[] args) {
        Expense Add = new Expense();
    }
}
