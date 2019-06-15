import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

public class ReplaceForm extends JFrame{
    private JTextField text1;
    private JTextField text2;
    private final JLabel text1Label;
    private final JLabel text2Label;
    private JButton replace;

    public ReplaceForm(){
        super("Replace Form");

        text1=new JTextField(10);
        text2=new JTextField(10);
        replace=new JButton("Replace");

        text1Label=new JLabel("Enter First Text");
        text2Label=new JLabel("Enter 2nd Text");

        setLayout(new FlowLayout());

        add(text1Label);
        add(text1);

        add(text2Label);
        add(text2);
        add(replace);

        EventHandler handler=new EventHandler();
        replace.addActionListener(handler);
    }

    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s1=text1.getText();
            String s2=text2.getText();

            text1.setText(s2);
            text2.setText(s1);
        }
    }
}
