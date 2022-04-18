/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kol1vjezba;

/**
 *
 * @author filip
 */
public class Evidencija {

    public Pjesma getPjesma() {
        return pjesma;
    }

    public void setPjesma(Pjesma pjesma) {
        this.pjesma = pjesma;
    }
    
    private String naziv;
    private String osoba;
        private Pjesma pjesma;

    public Evidencija() {
        this.pjesma = new Pjesma();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }
    
    
    
}
