/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */

package Assessment2;


public class Twiceland {
    public static void main(String[] args) {
        mainFrame frame = new mainFrame();
        Model model = new Model();
        Controller controller = new Controller(frame, model);
        model.addObserver(frame);
    }
        
}
