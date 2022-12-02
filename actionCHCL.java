import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent.*;
import javax.swing.text.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.*;
import java.net.*;


public class actionCHCL implements ActionListener {
public static ImageIcon chips = new ImageIcon(OneCL.class.getResource("/textures/chips.gif"));
public void actionPerformed(ActionEvent e) {
JFrame chfr = new JFrame("CHIPS!!");
chfr.setDefaultCloseOperation(chfr.EXIT_ON_CLOSE);
chfr.setSize(300,300);
chfr.setVisible(true);
chfr.setLocationRelativeTo(null);
JButton buttonchfr1 = new JButton(chips);
buttonchfr1.setBorder(BorderFactory.createMatteBorder(5,5,5,5,new Color(255,255,0)));
chfr.add(buttonchfr1);
try {
URL chipsaud = actionCHCL.class.getResource("/sounds/chipsaud.wav");
//File chipsaud = new File(actionCHCL.class.getResource("/sounds/chipsaud.wav"));
AudioInputStream ais = AudioSystem.getAudioInputStream(chipsaud);
Clip clip = AudioSystem.getClip();
clip.open(ais);
clip.setFramePosition(0);
clip.start();
}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
exc.printStackTrace();
}
}
}
