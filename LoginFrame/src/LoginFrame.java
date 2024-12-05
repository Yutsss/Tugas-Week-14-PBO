
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

  private JLabel userLabel, passwordLabel;
  private JTextField userTextField;
  private JPasswordField passwordField;
  private JButton loginButton;

  public LoginFrame() {
    setTitle("User Login");
    setLayout(new FlowLayout());
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    userLabel = new JLabel("Username:");
    userTextField = new JTextField(20);

    passwordLabel = new JLabel("Password:");
    passwordField = new JPasswordField(20);

    loginButton = new JButton("Login");

    loginButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("password")) {
          JOptionPane.showMessageDialog(null, "Login Successful");
        } else {
          JOptionPane.showMessageDialog(null, "Invalid Username or Password");
        }
      }
    });

    add(userLabel);
    add(userTextField);
    add(passwordLabel);
    add(passwordField);
    add(loginButton);
  }
}
