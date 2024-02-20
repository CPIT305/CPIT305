import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatiscsPage {
    private JPanel mainPanel;
    private JPanel AnalysisPicPanel;
    private JPanel historyPanel;
    private JLabel income;
    private JLabel expenses;
    private JLabel total;
    private JButton backButton;
    private JTextField a200$TextField;
    private JTextField a150$TextField;
    private JTextField a50$TextField;
    private DefaultPieDataset pieDataset;
    private JFreeChart pieChart;
    private ChartPanel chartPanel;
    DefaultTableModel model;
    JTable table;

    JFrame frame = new JFrame();
    public StatiscsPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program after hitting close button
        frame.setContentPane(mainPanel); //specify the panel to show
        frame.pack(); //resizes the frame
        frame.setLocationRelativeTo(null); //put it in center of screen
        frame.setSize(450,500);
        frame.setMinimumSize(new Dimension(450,500));
        frame.setMaximumSize(new Dimension(450,500));
        frame.setResizable(false);
        frame.setVisible(true); //shows it

        String[] categories = {"bills","Shopping","Food"};

        String[] a = {"Category","Amount"};
        model = new DefaultTableModel(null,a);
        table = new JTable(model);
        for (int i = 0; i < 5; i++ ){
            int RandomNumber = (int)(Math.random() * 3);
            Object[] data = {categories[RandomNumber],30};
            model.addRow(data);
        }
        showPie();
        frame.validate();//refresh (put after pie)
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                frame.dispose();
            }
        });
    }
    public void showPie(){
        DefaultListModel dlm = new DefaultListModel();
        JList list = new JList(dlm);
        JScrollPane scrollPane = new JScrollPane(list);

        pieDataset = new DefaultPieDataset();
        double bills = 0,shopping = 0,food = 0;
        for (int i = 0; i < table.getRowCount(); i++){
            String name = table.getValueAt(i,0).toString();
            if ((name).equalsIgnoreCase("bills")){
                bills = bills + Double.valueOf(table.getValueAt(i,1).toString());
                pieDataset.setValue(name,bills);
            }
            else if ((name).equalsIgnoreCase("shopping")){
                shopping = shopping + Double.valueOf(table.getValueAt(i,1).toString());
                pieDataset.setValue(name,shopping);
            }
            else if ((name).equalsIgnoreCase("food")){
                food = food + Double.valueOf(table.getValueAt(i,1).toString());
                pieDataset.setValue(name,food);
            }

            double amt = Double.valueOf(table.getValueAt(i,1).toString());
            dlm.addElement(name + " " + amt);

        }

        pieChart = ChartFactory.createPieChart("Expenses Overview",pieDataset,true,true,true);
        pieChart.getPlot();
        chartPanel = new ChartPanel(pieChart);
        AnalysisPicPanel.add(chartPanel);
        historyPanel.add(scrollPane);

    }

    public static void main(String[] args) {
        new StatiscsPage();
    }

}
