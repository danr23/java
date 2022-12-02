import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent.*;
import javax.swing.text.*;
import java.awt.event.*;

public class OneCL extends TwoCL {
public static void main(String[] args){
JFrame frame = new JFrame("Program");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600,675);
frame.setVisible(true);
frame.setLocationRelativeTo(null);

JPanel panel = new JPanel();
panel.add(nuggetsB);
panel.add(pizzaB);
panel.add(sandwhichB);
panel.add(sausagesB);
panel.add(foodEnTA);
panel.add(foodRuTA);
panel.add(chipsB);
panel.setBackground(Color.orange);
panel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,new Color(255,255,245)));

foodEnTA.setBackground(new Color(230, 155, 0));
foodRuTA.setBackground(new Color(230, 155, 0));
foodEnTA.setForeground(new Color(255, 255, 255));
foodRuTA.setForeground(new Color(255, 255, 255));
foodEnTA.setBorder(BorderFactory.createMatteBorder(5,3,3,5,new Color(230, 135, 0)));
foodRuTA.setBorder(BorderFactory.createMatteBorder(5,3,3,5,new Color(230, 135, 0)));

nuggetsB.setBackground(new Color(230, 255, 45));
pizzaB.setBackground(new Color(230, 215, 0));
sandwhichB.setBackground(new Color(230, 175, 45));
sausagesB.setBackground(new Color(230, 135, 0));

frame.add(panel);
ActionListener actionCH = new actionCHCL();
chipsB.addActionListener(actionCH);
chipsB.setBackground(new Color(0,0,0));
}
}
