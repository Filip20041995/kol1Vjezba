/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filip
 */
public class Start {

    List<Projekt> projekti;

    public Start() {

        projekti = new ArrayList<>();

        do {
            unosProjekta();
        } while (!Unos.unosString("g za prekid").equals("g"));

        for (Projekt p : projekti) {
            System.out.println(p.getNaziv() + ": " + p.getVoditelj().getGodisnjaPlaca() / 12);
        }

        double suma = 0;
        int loopExecCounter = 0;
        for (Projekt p : projekti) {
            if (p.isZavrsenost()) {
                loopExecCounter = loopExecCounter + 1;
                suma += p.getVoditelj().getGodisnjaPlaca();
                    
            }

        }
        
        //

        //System.out.println(suma / 12);
        
        double mjesecSuma = suma / 12;
        
        System.out.println("Prosjek mjesečnih plaća završenih projekata: " + mjesecSuma / loopExecCounter);
       
       

    }

    private void unosProjekta() {
        Projekt p = new Projekt();
        p.setSifra(Unos.unosString("Upiši šifru projekta"));
        p.setNaziv(Unos.unosString("Upiši naziv projekta"));
        p.setZavrsenost(Unos.unosBoolean("Da li je projekt gotov"));

        Voditelj v = new Voditelj();
        v.setIme(Unos.unosString("Unesi ime voditelja"));
        v.setPrezime(Unos.unosString("Unesi prezime voditelja"));
        v.setGodisnjaPlaca(Unos.unosDouble("Unesi godišnju plaću voditelja"));

        p.setVoditelj(v);

        projekti.add(p);

    }

    public static void main(String[] args) {
        new Start();
    }

}
