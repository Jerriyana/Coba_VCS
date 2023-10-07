package View;

import javax.swing.JOptionPane;
import Controller.Controller;
import Main.Main;       

public class UserDataView {
    public UserDataView(){
        show();
    }   
    
    public void show(){
        Controller control = new Controller();

        String nama = JOptionPane.showInputDialog(null, 
            "Input Nama : ", 
            "Print User Data", 
            JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
            control.printUserData(nama, Main.listUser),
            "User Data Screen",
            JOptionPane.DEFAULT_OPTION);
    }
}

