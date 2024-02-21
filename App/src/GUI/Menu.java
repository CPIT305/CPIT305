package GUI;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu {
    private JPanel MainPanel;
    private JButton statisticsButton;
    private JButton logOutButton;
    private JButton backButton;
    JFrame frame = new JFrame();

    public Menu() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program after hitting close button
        frame.setContentPane(MainPanel); //specify the panel to show
        frame.pack(); //resizes the frame
        frame.setLocationRelativeTo(null); //put it in center of screen
        frame.setSize(300,400);
        frame.setMinimumSize(new Dimension(300,400));
        frame.setMaximumSize(new Dimension(300,500));
        frame.setResizable(false);
        frame.setVisible(true); //shows it
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                frame.dispose();

            }

        });

        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StatiscsPage();
                frame.dispose();
            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new newlogin();
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Menu();
    }
}
