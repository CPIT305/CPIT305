package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newlogin extends JFrame {
    private JPanel panel1;
    private JLabel logo;
    private JTextField tfusername;
    private JLabel username;
    private JPasswordField passwordField1;
    private JButton button1Login;
    private JButton signUpButton;


    public newlogin() {
        setContentPane(panel1);
        pack(); //resizes the frame
        setLocationRelativeTo(null); //put it in center of screen
        setSize(450,500);
        setMinimumSize(new Dimension(450,500));
        setMaximumSize(new Dimension(450,500));
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        logo.setBounds(10, 10, 10, 10);

        setVisible(true);

        button1Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                dispose();

            }
        });
        signUpButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                signUp signUp=  new signUp();
                signUp.setVisible(true);
                dispose();

            }
        });
    }

    public static void main(String[] args) {
        new newlogin();

    }
}
