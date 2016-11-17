// Fig. 5.27: ShapesTest.java
// Test application that displays class Shapes.
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest
{
    public static void main(String[] args)
    {
        // obtain user's choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangle\n" +
                        "Enter 2 to draw ovals");

        int choice = Integer.parseInt(input); // convert input to int

        // create the panel with the user's input
        Shape panel = new Shape(choice);

        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
} // end class ShapesTest
