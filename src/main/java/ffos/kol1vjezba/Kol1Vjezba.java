/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ffos.kol1vjezba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filip
 */
public class Kol1Vjezba {
    
   public Kol1Vjezba(){
       
     List<Evidencija> evidencije = new ArrayList<>();
        Evidencija e;
        

        do {
            e = new Evidencija();
            e.setNaziv(Unos.unosString("Unesi naziv evidencije"));
            e.setOsoba(Unos.unosString("Unesi ime osobe koja slusa evidenciju"));
           evidencije.add(e);
            do{
            e.getPjesma().setIzvodac(Unos.unosString("Unesi ime izvodaca pjesme"));
            e.getPjesma().setNazivPjesme(Unos.unosString("Unesi naziv pjesme"));
            evidencije.add(e);
            }while(!Unos.unosString("Unos X za prekid unosa pjesama na evidenciju ili Ne za dalje").equals("X"));
            
        } while (!Unos.unosString("Napiši X za prekid evidencije ili NE za dalje").equals("X"));
       
      List<String> imena = new ArrayList<>();
        for (Evidencija evidencija : evidencije) {
            imena.add(evidencija.getPjesma().getNazivPjesme());
        }

        for (String ime : imena) {
            System.out.println(ime);
         
   }
   }
 
    public static void main(String[] args) {
        new Kol1Vjezba();
    }
}
