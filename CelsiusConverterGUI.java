import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusInput;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenhiteLabel;



    public CelsiusConverterGUI (String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
        this.setTitle("Celsius Coverter");
        this.pack();


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int tempFahr = (int)((Double.parseDouble(celsiusInput.getText()))
                        * 1.8 + 32);
                fahrenhiteLabel.setText(tempFahr + " Fahrenheit");

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("Celsius Converter");
        frame.setVisible(true );
    }

    private static void centerFrame(JFrame frame) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (d.width - w) /2;
        int y = (d.height - h) /2;

        frame.setLocation(x,y);
    }
}
