package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private JPanel HomePagePanel;
    private JButton menuButton;
    private JLabel income;
    private JTextField a200$TextField;
    private JLabel total;
    private JTextField a50$TextField;
    private JLabel expenses;
    private JTextField a150$TextField;
    private JButton addButton;
    private JPanel mainPanel;
    private JPanel historyPanel;
    DefaultTableModel model;
    JTable table;

    JFrame frame = new JFrame();
    public HomePage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program after hitting close button
        frame.setContentPane(mainPanel); //specify the panel to show
        frame.pack(); //resizes the frame
        frame.setLocationRelativeTo(null); //put it in center of screen
        frame.setSize(450,500);
        frame.setMinimumSize(new Dimension(450,500));
        frame.setMaximumSize(new Dimension(450,500));
        frame.setResizable(false);
        frame.setVisible(true); //shows it
        History();
        frame.validate();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add();
                frame.dispose();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                frame.dispose();
            }
        });
    }
    public void History(){
        String[] ecategories = {"bills","Shopping","Food"}; //expense categories

        String[] icategories = {"Gift","Salary","Sale"}; //income categories

        String[] a = {"Category","Amount"};
        DefaultListModel dlm = new DefaultListModel();
        JList list = new JList(dlm);
        JScrollPane scrollPane = new JScrollPane(list);
        model = new DefaultTableModel(null,a);
        table = new JTable(model);
        for (int i = 0; i < 5; i++ ){
            int RandomNumber = (int)(Math.random() * 3);
            Object[] data = {ecategories[RandomNumber],30};
            model.addRow(data);
            Object[] incomedata = {icategories[RandomNumber],40};
            model.addRow(incomedata);
        }
        for (int i = 0; i < table.getRowCount(); i++){
            String name = table.getValueAt(i,0).toString();
            double amt = Double.valueOf(table.getValueAt(i,1).toString());

            if(check(ecategories,name)){
                dlm.addElement(name + " -" + amt);
            }
            else{
                dlm.addElement(name + " +" + amt);
            }



        }


        historyPanel.add(scrollPane);


    }
    public boolean check(String[] arr, String name){
        for (int j = 0; j < 3 ; j++){
            if (name.equalsIgnoreCase(arr[j])){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        new HomePage();
    }
}
