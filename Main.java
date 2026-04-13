import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
  public static void main(String[] args)
  {
    main.setTitle("My Application");
    main.setSize(400,300);
    main.setSize(400, 300);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    main.setVisible(true);
  }

public Main()
  {
    BorderLayout layout = new BorderLayout(1, 3);
    setLayout(layout);
    ToolPanel toolPanel = new ToolPanel();
    this.add(toolPanel, BorderLayout.WEST);
    DrawingPanel drawingPanel = new DrawingPanel();
    this.add(drawingPanel, BorderLayout.CENTER);
    StatusBarPanel statusBarPanel = new StatusBarPanel();
    this.add(statusBarPanel, BorderLayout.SOUTH);
    Thread statusBarThread = new Thread(statusBarPanel);
    statusBarThread.start();
  }
}
