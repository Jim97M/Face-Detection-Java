/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFaceApp;

/**
 *
 * @author JIMMY
 */
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class App {
    public static void main(String [] Args){
        try{
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | IllegalAccessException |InstantiationException | UnsupportedLookAndFeelException e ){
            e.printStackTrace();
        }
        MainFrame mainFrame = new MainFrame();
        mainFrame.displayScreen();
    }
   
}
foo
