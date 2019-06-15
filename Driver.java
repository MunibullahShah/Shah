import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args){

        //TO run one class only
        //Comment the other classes' objects


        //ReplaceForm Window
        ReplaceForm form=new ReplaceForm();

        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        form.setVisible(true);

        //CheckBox Event
        CheckBoxEvent check=new CheckBoxEvent();

        check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        check.setSize(400,300);

        check.setVisible(true);

        //Pizza App
       PizzaOrder dm=new PizzaOrder();
       dm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       dm.setSize(350,150);

       dm.setVisible(true);

       //Temperature Converter
       TempratureConverter window=new TempratureConverter();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setSize(500,400);
       window.setVisible(true);
        JFrame application=new JFrame("Paint");

        //Painting window
        PaintPanel paintPanel=new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);

        application.add(new JLabel("Drag Mouse to Draw.."),BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500,400);
        application.setVisible(true);


    }
}
