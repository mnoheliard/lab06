import java.awt.*;
import java.awt.event.ActionListener;
public class ToolPanelListener implements ActionListener{

@Override
  public void actionPerformed(java.awt.event.ActionEvent e)
  {
    String command = e.getActionCommand();
    System.out.println("Selected color: " + command);
    if(command.equals("Red"))
    {
      Blackboard.setColor(Color.RED);
    }
    else if (command.equals("Green");
    {
      Blackboard.setColor(Color.GREEN);
    }
    else if (command.equals("Blue"))
    {
      Blackboard.setColor(Color.BLUE);
    }
  }
}
      
