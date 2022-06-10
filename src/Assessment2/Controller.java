/**
 *
 * Name: John David
 * Student ID: 21130196
 *
 *
 */

package Assessment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    public mainFrame view;
    public Model model;

    public Controller(mainFrame view, Model model) {
        this.view = view;
        this.model = model;
        this.view.AddActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command) {
            
            default:
                break;
        }
    }

}
