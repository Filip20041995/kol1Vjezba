/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezba1;

import java.util.List;

/**
 *
 * @author filip
 */
public class Kolegij {
    
    private int sifra;
    private String naziv;
    private int dozvoljenBrojIzostanaka;
    private List<Izostanak> izostanci;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDozvoljenBrojIzostanaka() {
        return dozvoljenBrojIzostanaka;
    }

    public void setDozvoljenBrojIzostanaka(int dozvoljenBrojIzostanaka) {
        this.dozvoljenBrojIzostanaka = dozvoljenBrojIzostanaka;
    }

    public List<Izostanak> getIzostanci() {
        return izostanci;
    }

    public void setIzostanci(List<Izostanak> izostanci) {
        this.izostanci = izostanci;
    }
    
    
}
