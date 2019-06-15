import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CheckBoxEvent extends JFrame{
    private final JTextField textField;
    private JCheckBox box1;
    private JCheckBox box2;

    //private JLabel box1Label;
    //private JLabel box2Label;

    public CheckBoxEvent(){
        super("Check Box Event Handler");

        setLayout(new FlowLayout());

        textField=new JTextField("Font Style Changing...",20);
        textField.setFont(new Font("Checking",Font.PLAIN,14));
        add(textField);

        box1=new JCheckBox("Bold");
        box2=new JCheckBox("Italic");



        add(box1);
        add(box2);

        CheckBoxHandler handler=new CheckBoxHandler();
        box1.addItemListener(handler);
        box2.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;

            if (box1.isSelected() && box2.isSelected()) {
                font = new Font("Checking", Font.BOLD + Font.ITALIC, 14);
            }
            else
            if (box1.isSelected()) {
                font = new Font("Checking", Font.BOLD, 14);
            }
            else
            if (box2.isSelected()) {
                new Font("Checking", Font.ITALIC, 14);
            }
            else font=new Font("Checking",Font.PLAIN,14);

            textField.setFont(font);

        }

    }
}
