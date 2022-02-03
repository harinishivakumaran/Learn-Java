import java.awt.*;
import javax.swing.*;

public class Jdbc {
    public static void main(String args[]) {
      JFrame f=new JFrame("My Frame");
      f.add(new JButton("OK"));
      f.add(new JButton("Cancel"));
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(200,200);
      f.setVisible(true);
    }
}