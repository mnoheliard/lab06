
public class Blackboard {
    private static java.awt.Color currentColor = java.awt.Color.RED;
    private static int counter = 0;

    public static java.awt.Color getCurrentColor() {
        return currentColor;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCurrentColor(java.awt.Color color) {
        currentColor = color;
    }

    public static void setCounter(int count) {
        counter = count;
    } 
}
