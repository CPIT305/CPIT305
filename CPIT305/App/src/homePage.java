import javax.swing.*;

public class homePage extends JFrame {
    private JPanel panel1;
    private JPanel panel;
    private JButton expensesButton;
    private JButton incomeButton;

    public homePage() {
        setContentPane(panel1);
        setTitle("homePage");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        homePage homePage = new homePage();
    }
}
