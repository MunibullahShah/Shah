import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;
public class JListMenu extends JFrame {
    private final JList<String> colorList;
    private static final String[] colorNames = {"Black", "Blue", "Green"};

    private static final Color[] colorArray={Color.BLACK,Color.BLUE,Color.GREEN};

    public JListMenu(){
        setLayout(new FlowLayout());

        colorList=new JList(colorNames);
        colorList.setVisibleRowCount(2);

        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(colorList));

        colorList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colorArray[colorList.getSelectedIndex()]);
            }
        });
    }


}