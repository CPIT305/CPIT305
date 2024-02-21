package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JButton signUpButton;
    private JButton loginButton;
    private JPanel panel1;

    public signUp() {
        setContentPane(panel1);
        pack(); //resizes the frame
        setLocationRelativeTo(null); //put it in center of screen
        setSize(450,500);
        setMinimumSize(new Dimension(450,500));
        setMaximumSize(new Dimension(450,500));
        setResizable(false);
        setTitle("Sign Up");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        signUpButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage p = new HomePage(); // to display the homePage frame
                dispose();


            }
        });
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                newlogin newlogin=  new newlogin(); // display the login frame
                newlogin.setVisible(true);
                dispose();

            } {



                }
        });
    }
}
