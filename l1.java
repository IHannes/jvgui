import java.applet.*; 
import java.awt.*; 

public class l1 extends Applet 
{ 
  Button MyButton1, MyButton2, MyButton3; 

  public void init() 
  { 
    MyButton1 = new Button("MyButton 1"); 
    MyButton2 = new Button("MyButton 2"); 
    MyButton3 = new Button("MyButton 3"); 
    add(MyButton1); 
    add(MyButton2); 
    add(MyButton3); 
  } 


public static void main(String[] args) {
    l1.init();
}
}