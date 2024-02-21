import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmSaves extends JFrame{
    private JPanel panel2;
    private JPanel panel1;
    private JLabel message;
    private JButton OK;

    public ConfirmSaves(){
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

        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ConfirmSaves Add = new ConfirmSaves();
    }
}
