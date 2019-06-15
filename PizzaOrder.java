import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PizzaOrder extends JFrame {
    private JRadioButton small;
    private JRadioButton medium;
    private JRadioButton large;

    protected int smallPrice=500;
    protected int mediumPrice=750;
    protected int largePrice=950;

    protected int total=0;

    private JCheckBox olive;
    private JCheckBox mashroom;
    private JCheckBox extraCheese;
    private JCheckBox toping;

    protected int olivePrice=100;
    protected int mashroomPrice=150;
    protected int extraCheesePrice=100;
    protected int topingPrice=50;

    private ButtonGroup pizzaSelect;

    private JLabel bill;

    public PizzaOrder(){
        super("Pizza Order");
        setLayout(new FlowLayout());

        small=new JRadioButton("Small:500",false);
        medium=new JRadioButton("Medium:750",false);
        large=new JRadioButton("Large:950",false);

        add(small);
        add(medium);
        add(large);

        pizzaSelect=new ButtonGroup();
        pizzaSelect.add(small);
        pizzaSelect.add(medium);
        pizzaSelect.add(large);

        olive=new JCheckBox("olive: 100");
        mashroom=new JCheckBox("mashroom: 150");
        extraCheese=new JCheckBox("EXtra Cheese: 100");
        toping=new JCheckBox("Toping: 50");

        add(toping);
        add(olive);
        add(extraCheese);
        add(mashroom);

        bill=new JLabel("Total Bill:"+total);

        add(bill);

        CheckBoxHandler handler=new CheckBoxHandler();

        small.addItemListener(handler);
        medium.addItemListener(handler);
        large.addItemListener(handler);

        toping.addItemListener(handler);
        olive.addItemListener(handler);
        mashroom.addItemListener(handler);
        extraCheese.addItemListener(handler);


    }

    private class CheckBoxHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(small.isSelected()){
                total=smallPrice;
            }
            if(medium.isSelected()){
                total=mediumPrice;
            }
            if(large.isSelected()){
                total=largePrice;
            }

            if(toping.isSelected()){
                total=total+topingPrice;
            }

            if(mashroom.isSelected()){
                total=total+mashroomPrice;
            }

            if(olive.isSelected()){
                total=total+olivePrice;
            }

            if(extraCheese.isSelected()){
                total=total+extraCheesePrice;
            }

            bill.setText("Total Bill: "+total);
        }


    }

}
