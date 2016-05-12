/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {
    @Id  
    private String rijksregistersnr;
    private String naam;
    private String voornaam;
    @OneToOne(cascade = CascadeType.ALL)
    private Address adres;
    
    public Person(){
        
    }
    public Person(String rijksregisternr,String naam, String voornaam, Address adres){
        setRijksregistersnr(rijksregisternr);
        setNaam(naam);
        setVoornaam(voornaam);
        setAdres(adres);
    }
    public Person(String rijksregisternr,String naam, String voornaam, String straat, int huisnr, String bus,int postcode,String gemeente){
        setRijksregistersnr(rijksregisternr);
        setNaam(naam);
        setVoornaam(voornaam);
        setAdres(new Address(straat,huisnr,bus,postcode,gemeente));
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        if(naam == null){
            throw new DomainException("geef geldige naam in");
        }
        this.naam = naam;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        if(voornaam == null){
            throw new DomainException("geef geldige voornaam in");
        }
        this.voornaam = voornaam;
    }
     public Address getAdres() {
        return adres;
    }
    public void setAdres(Address adres) {
        if(adres == null){
            throw new DomainException("geef geldig adres in");
        }
        this.adres = adres;
    }
    public String getRijksregistersnr() {
        return rijksregistersnr;
    }
    public void setRijksregistersnr(String rijksregistersnr) {
        if(rijksregistersnr == null){
            throw new DomainException("geef geldig rijksregistersnr in");
        }
        this.rijksregistersnr = rijksregistersnr;
    }
       
}
