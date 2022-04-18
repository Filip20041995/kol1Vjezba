/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filip
 */
public class Start {

    private List<Kolegij> kolegiji;
    
    public class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    }

    public Start() {

        kolegiji = new ArrayList<>();

        do {
            unosKolegija();
        } while (!Unos.unosString("k za kraj unosa kolegija").equals("k"));
        
    
    

        for (Kolegij k : kolegiji) {
            if(k.getIzostanci().size() >= k.getDozvoljenBrojIzostanaka()){
                System.out.println(k.getNaziv() + ": OVO JE CRVENO!!!!! " + k.getIzostanci().size() + "/" + k.getDozvoljenBrojIzostanaka());
            }else{
            System.out.println(k.getNaziv() + ": " + k.getIzostanci().size() + "/" + k.getDozvoljenBrojIzostanaka());
        }
        }
        
       
    }

    private void unosKolegija() {
        Kolegij k = new Kolegij();
        k.setSifra(Unos.unosInt("Upiši šifru kolegija"));
        k.setNaziv(Unos.unosString("Upiši naziv kolegija"));
        k.setDozvoljenBrojIzostanaka(Unos.unosInt("Upiši dozvoljeni broj izostanaka"));
        k.setIzostanci(unosViseIzostanaka());
        kolegiji.add(k);

    }

    private List<Izostanak> unosViseIzostanaka() {
        List<Izostanak> izostanci = new ArrayList<>();
        Izostanak i;
        do {

           i = unosJednogIzostanka();
          izostanci.add(i);
            
        } while (!Unos.unosString("k za kraj unosa izostanaka").equals("k"));
        return izostanci;
    }

    private Izostanak unosJednogIzostanka() {
        Izostanak i = new Izostanak();
        i.setDatum(Unos.ucitajDatum("Upiši datum izostanka"));
        i.setRazlogIzostanka(Unos.unosString("Upiši razlog izostanka"));
     
        return i;
    }
    
    

    public static void main(String[] args) {
        new Start();
    }
}
