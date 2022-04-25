import javax.swing.*;

public class colormode extends JOptionPane{
    public static int colormode(){
    int retrn = 500;
    int stopp = 0;
    while (stopp == 0) {
        int theme = Integer.parseInt(JOptionPane.showInputDialog(null, "0 für dunklen Modus,\n1 für hellen Modus,\n2 für hellblauen Modus", "Hintergrundfarbe", 0));
        switch (theme) {
            case 0:
                retrn = 0;
                stopp = 1;
                break;
            case 1: 
                retrn = 1;
                stopp = 1;
                break;
            case 2:
                retrn = 2;
                stopp = 1;
                break;
            default: {
                JOptionPane.showMessageDialog(null, "Ihre Eingabe konnte nicht erkannt werden");
                break;
            }
            }
    }

return retrn;
}
}