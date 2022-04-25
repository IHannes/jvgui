import javax.swing.*;

public class MyLabel {

    public JLabel Label(){
    ImageIcon image = new ImageIcon("p1.jpg");
    JLabel label = new JLabel();
    label.setText("123");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.LEFT);
    label.setVerticalTextPosition(JLabel.TOP);
    return label;
    }
    
}
