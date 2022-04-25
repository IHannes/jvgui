import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
     MyFrame(JLabel label, JPanel panel){
        this.setTitle("Finanzplaner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("p0.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(217,249,255));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(screenWidth - 10,screenHeight - 40);
        this.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}