/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba2;

import ffos.vjezba1.Kolegij;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author filip
 */
public class Start {
    
    private List<Prijava> prijave;
    
    public Start(){
        
        prijave = new ArrayList<>();
        
          do {
            unosPrijave();
        } while (!Unos.unosString("n za kraj unosa prijava").equals("n"));
          
         /* for (Prijava p : prijave){
              System.out.println(p.getDatum() + ": " + p.getStudent().getIme() + " " + p.getStudent().getPrezime() + " " + p.getStudent().getProsjek());
          }*/
          
         
              System.out.println("Ukupan broj prijava: " + prijave.size());
              
              List<Double> prosjeci = new ArrayList<>();
              for(Prijava p : prijave){
                  prosjeci.add(p.getStudent().getProsjek());
                
              }
              
              System.out.println("Najmanji prosjek: " + Collections.min(prosjeci));
              System.out.println("Najveći prosjek: " + Collections.max(prosjeci));
              
         
        
    }
    
    private void unosPrijave(){
        Prijava p = new Prijava();
        p.setSifra(Unos.unosInt("Upiši šifru prijave"));
        p.setDatum(Unos.ucitajDatum("Upiši datum prijave"));
        p.setStudent(unosStudenta());
        prijave.add(p);
    }
    
    private Student unosStudenta(){
        Student s = new Student();
        s.setJMBAG(Unos.unosInt("Unesi JMBAG"));
        s.setIme(Unos.unosString("Unesi ime"));
        s.setPrezime(Unos.unosString("Unesi prezime"));
        s.setProsjek(Unos.unosDouble("Unesi prosjek na dvije decimale"));
        return s;
        
    }
    
    public static void main(String[] args) {
        new Start();
    }
    
}
