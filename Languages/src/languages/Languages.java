/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languages;
import javax.swing.JFrame;
/**
 *
 * @author debes
 */
public class Languages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new LanguagesUI();
        frame.setTitle("GUI Languages");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
