import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class ToolPanel extends JPanel {

    public ToolPanel() {
        this.setBackground(Color.WHITE);
        GridLayout layout = new GridLayout(9,1);
        this.setLayout(layout);
        JRadioButton r1 = new JRadioButton("Red");
        JRadioButton r2 = new JRadioButton("Green");
        JRadioButton r3 = new JRadioButton("Blue");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        ToolPanelListener listener = new ToolPanelListener();
        r1.addActionListener(listener);
        r2.addActionListener(listener);
        r3.addActionListener(listener);
        r1.setSelected(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
    }
}
