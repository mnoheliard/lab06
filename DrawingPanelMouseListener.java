import java.awt.*;
import java.awt.event.MouseListener;

public class DrawingPanelMouseListener implements MouseListener{
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Graphics g = e.getComponent().getGraphics();
        Color c = Blackboard.getCurrentColor();
        g.setColor(c);
        g.fillOval(x - 10, y - 10, 20, 20);
        g.dispose();
        Blackboard.setCounter(Blackboard.getCounter() + 1);

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
        }
}
