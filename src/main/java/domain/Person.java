/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Person {
    private String rijksregistersnr;
    private String naam;
    private String voornaam;
    private Adres adres;
    
    public Person(String rijksregisternr,String naam, String voornaam, Adres adres){
        setRijksregistersnr(rijksregistersnr);
        setNaam(naam);
        setVoornaam(voornaam);
        setAdres(adres);
    }

    public String getNaam() {
        return naam;
    }
    private void setNaam(String naam) {
        this.naam = naam;
    }
    public String getVoornaam() {
        return voornaam;
    }
    private void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
     public Adres getAdres() {
        return adres;
    }
    private void setAdres(Adres adres) {
        this.adres = adres;
    }
    public String getrRijksregistersnr() {
        return rijksregistersnr;
    }
    private void setRijksregistersnr(String rijksregistersnr) {
        this.rijksregistersnr = rijksregistersnr;
    }
}
