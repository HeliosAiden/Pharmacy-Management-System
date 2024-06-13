package utils;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ChangeStyle {

    public void changelook(){
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
     }

}
