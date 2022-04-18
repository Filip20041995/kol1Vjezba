/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kol1vjezba;

import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class Unos {
    
        public static String unosString(String poruka){
        String unos="";
        while(true){
            unos = JOptionPane.showInputDialog(poruka);
            if(unos.isEmpty()){
                JOptionPane.showMessageDialog(null,"Neispravan unos");
                continue;
            }
            try {
                Integer.parseInt(unos);
                continue;
            } catch (Exception e) {
            }
            break;
        }
        return unos;
    }
    
}
