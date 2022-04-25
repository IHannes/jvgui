import javax.swing.*;

import java.awt.*;
import java.util.*;

public class l2{
    public static void main(String[] args) {
    MyLabel label1 = new MyLabel();
    JLabel label2 = label1.Label();
    JPanel redpanel = new JPanel();
    redpanel.setBackground(Color.blue);
    redpanel.setBounds(0,0,250,250);
    Dimension d = new Dimension(10, 10);
    redpanel.setSize(d);
    MyFrame eins = new MyFrame(label2, redpanel);
    }
}