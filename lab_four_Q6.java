import javax.swing.*;
import java.awt.*;
public class lab_four_Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(669,669);
        JLabel label=new JLabel("Hi,ma nigga!\n thank you");
        label.setOpaque(true);
        label.setBackground(Color.black);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}