//FA18-BSE-038


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class ClickMe extends JFrame {
    private final JButton clickme;

   public ClickMe(){
       super("Click Me");
       setLayout(new FlowLayout());

       clickme=new JButton("Click Me");
       clickme.setSize(4,2);
       add(clickme);

       MotionHandler handler=new MotionHandler();
       clickme.addMouseListener(handler);
       clickme.addMouseMotionListener(handler);


   }

   private class MotionHandler implements MouseListener,MouseMotionListener{
       @Override
       public void mouseMoved(MouseEvent e) {

       }

       @Override
       public void mouseClicked(MouseEvent e) {

       }

       @Override
       public void mousePressed(MouseEvent e) {
           JOptionPane.showMessageDialog(null,"Catch me If u can");

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {
           Random rand=new Random();
           int i=rand.nextInt(400);
           int j=rand.nextInt(300);
           clickme.setLocation(i,j);
       }

       @Override
       public void mouseExited(MouseEvent e) {

       }

       @Override
       public void mouseDragged(MouseEvent e) {

       }
   }
}
