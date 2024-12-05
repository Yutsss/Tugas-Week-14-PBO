import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageViewer extends JFrame {

  private JLabel imageLabel;
  private JButton openButton;

  public ImageViewer() {
    setTitle("Image Viewer");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    imageLabel = new JLabel("No Image", JLabel.CENTER);
    imageLabel.setPreferredSize(new Dimension(600, 300));

    openButton = new JButton("Open Image");

    openButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        openImage();
      }
    });

    add(imageLabel, BorderLayout.CENTER);
    add(openButton, BorderLayout.SOUTH);
  }

  private void openImage() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Open Image");

    fileChooser
        .setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif"));

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
      File selectedFile = fileChooser.getSelectedFile();
      try {
        BufferedImage img = ImageIO.read(selectedFile);
        ImageIcon imageIcon = new ImageIcon(img);
        imageLabel.setIcon(imageIcon);
        imageLabel.setText("");
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error loading image", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}