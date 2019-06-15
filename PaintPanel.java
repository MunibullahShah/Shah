import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PaintPanel extends JPanel {
    private final ArrayList<Point> points=new ArrayList<>();
    private JColorChooser colorPanel;

    public PaintPanel(){
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Point point:points){
            g.fillOval(point.x,point.y,4,4);
        }

    }
}
