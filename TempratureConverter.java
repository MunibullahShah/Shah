import javafx.event.EventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempratureConverter extends JFrame {

    private JTextField box1;
    private final JTextField box2;
    private JRadioButton centigrade1;
    private JRadioButton faren1;
    private JRadioButton centigrade2;
    private JRadioButton faren2;

    private ButtonGroup from;
    private ButtonGroup to;

    private JLabel frm;
    private JLabel t0;

    public TempratureConverter(){
        super("Converter");
        setLayout(new FlowLayout());

        box1=new JTextField("",4);
        box2=new JTextField("",6);
        frm=new JLabel("From");
        t0=new JLabel("To");

        centigrade1=new JRadioButton("Centrigrade",true);
        faren1=new JRadioButton("Farenhiete",false);

        add(centigrade1);
        add(faren1);
        add(frm);
        add(box1);

        from=new ButtonGroup();
        to=new ButtonGroup();

        from.add(centigrade1);
        from.add(faren1);

        centigrade2=new JRadioButton("Centigrade",true);
        faren2=new JRadioButton("Farenhiete",false);

        add(centigrade2);
        add(faren2);

        to.add(centigrade2);
        to.add(faren2);
        add(t0);
        add(box2);

        EventHandler handler=new EventHandler();
        box1.addActionListener(handler);

    }

    private class EventHandler implements ActionListener {
        private EventHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            if(centigrade1.isSelected()){
                if(centigrade2.isSelected()){
                    box2.setText(box1.getText());
                }

                if(faren2.isSelected()){
                    double cent=Double.parseDouble(box1.getText());
                    double far=(cent*9/5)+32;
                    box2.setText(""+far);
                }
            }

            if (faren1.isSelected()){
                if(faren2.isSelected()){
                    box2.setText(box1.getText());
            }
                if(centigrade2.isSelected()){
                    double far=Double.parseDouble(box1.getText());
                    double cent=(far-32)*5/9;
                    box2.setText(""+cent);
                }
        }
    }
}

}
