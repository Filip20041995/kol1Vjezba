/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba;

/**
 *
 * @author filip
 */
public class Projekt {
    
    private String sifra;
    private String naziv;
    private boolean zavrsenost;
    private Voditelj voditelj;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isZavrsenost() {
        return zavrsenost;
    }

    public void setZavrsenost(boolean zavrsenost) {
        this.zavrsenost = zavrsenost;
    }

    public Voditelj getVoditelj() {
        return voditelj;
    }

    public void setVoditelj(Voditelj voditelj) {
        this.voditelj = voditelj;
    }

   
    
    
    
}
