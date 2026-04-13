import javax.swing.*;

public class DrawingPanel extends JPanel {
    public DrawingPanel() {
        setBackground(java.awt.Color.LIGHT_GRAY);
        DrawingPanelMouseListener drawingPanelMouseListener = new DrawingPanelMouseListener();
        this.addMouseListener(drawingPanelMouseListener);
    }
}
