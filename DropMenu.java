import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class DropMenu extends JFrame{
    private final JComboBox<String> colourCombo;
    //private final JLabel label;

    private static final String[] colourNames={"Black","Blue","Green"};
    private Color[] colorArray={Color.BLACK,Color.BLUE,Color.GREEN};

    public DropMenu(){
        super("Drop Menu");

        setLayout(new FlowLayout());

        colourCombo=new JComboBox<String>(colourNames);
        colourCombo.setMaximumRowCount(3);

        colourCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED)
                {
                    getContentPane().setBackground(colorArray[colourCombo.getSelectedIndex()]);
                }

            }
        });

        add(colourCombo);
       // label=new JLabel("White");
        //add(label);

    }
}
