import javax.swing.*;
import java.awt.*;

public class StatusBarPanel extends JPanel implements Runnable{
    private JLabel label = new JLabel("Status Label!!!");

    public StatusBarPanel(){
        setBackground(Color.CYAN);
        this.add(label);
    }

    @Override
    public void run() {
        while(true){
            try {
                long time = System.currentTimeMillis();
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
                String formatedTime = sdf.format(new java.util.Date(time));
                label.setText("Time: " + formatedTime + " :: clicks: " + Blackboard.getCounter());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
