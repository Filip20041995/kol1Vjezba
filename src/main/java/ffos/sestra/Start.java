/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.sestra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author filip
 */
public class Start {

    List<Sestra> sestre;

    public Start() {

        sestre = new ArrayList<>();

        do {
            unosSestre();
        } while (!Unos.unosString("f za prekid").equals("f"));

        for (Sestra s : sestre) {
            System.out.println(s.getBojaKose());
        }

        List<Date> datumi = new ArrayList<>();

        for (Sestra s : sestre) {
            datumi.add(s.getSvekar().getDatumRodenja());

        }
        
        System.out.println("Najmanji prosjek: " + Collections.min(datumi));

    }

    private void unosSestre() {

        Sestra s = new Sestra();
        s.setSifra(Unos.unosString("Unesi sifru"));
        s.setNarukvica(Unos.unosInt("Unesi broj narukvice"));
        s.setNovcica(Unos.unosDouble("Unesi cijenu Novčice"));
        s.setKuna(Unos.unosDouble("Unesi kune"));
        s.setBojaKose(Unos.unosString("Unesi boju kose"));
        s.setNausnica(Unos.unosInt("Unesi broj narukvice"));

        Svekar sv = new Svekar();
        sv.setCarape(Unos.unosString("Unesi vrstu carapa"));
        sv.setGustoca(Unos.unosDouble("Unesi gustoču svekra"));
        sv.setKratkaMajica(Unos.unosString("Unesi vrstu majice"));
        sv.setFrizura(Unos.unosString("Unesi vrstu frizure"));
        sv.setBojaOciju(Unos.unosString("Unesi boju ociju"));
        sv.setDatumRodenja(Unos.ucitajDatum("Unesi datum rođenja"));

        s.setSvekar(sv);

        sestre.add(s);

    }

    public static void main(String[] args) {
        new Start();
    }

}
