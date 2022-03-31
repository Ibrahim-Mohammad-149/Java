import javax.swing.*;
import java.awt.*;

//This is just an interface, it doesn't work

public class LoginGUI {

    static JLabel userLabel;
    static JTextField userText;
    static JLabel passwordLabel;
    static JPasswordField passwordInput;
    static JLabel buttonLabel;
    static JButton button;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("LoginGUI");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (d.width - w) /2;
        int y = (d.height - h) /2;
        frame.setLocation(x,y);

        panel.setLayout(null);

        //User Input
        userLabel = new JLabel("User: ");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        //Password Input
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        passwordInput = new JPasswordField();
        passwordInput.setBounds(100,50,165,25);
        panel.add(passwordInput);

        //Login Button
        buttonLabel = new JLabel();
        buttonLabel.setBounds(100,80,165,25);
        panel.add(buttonLabel);
        button = new JButton("Login");
        button.setBounds(120,100,100,25);
        panel.add(button);

        frame.setVisible(true);
    }

    }
