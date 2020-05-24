package main;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import views.Menu;
/**
 *
 * @author eduardoleal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu_panel = new Menu();
        JFrame frame = new JFrame();
        frame.add(menu_panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(" PIA | Eduardo Leal - 1938550");
    }
    
}
