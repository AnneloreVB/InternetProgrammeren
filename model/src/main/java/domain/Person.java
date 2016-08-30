/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

//@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
public class Person implements Serializable {
    @Id
    @Size(min = 8,max = 8, message ="{Size.Person.rijksregistersnr}")
    @Pattern(regexp = "^(r|R)[0-9]{7}$", message = "{Pattern.Person.rijksregistersnr}")
    private String rijksregistersnr;
    
    @NotBlank(message = "{NotBlank.Person.naam}")
    private String naam;
    
    @NotBlank(message = "{NotBlank.Person.voornaam}")
    private String voornaam;
    
    
    @OneToOne(cascade = CascadeType.PERSIST )
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
        this.naam = naam;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    
     public Address getAdres() {
        return adres;
    }
    public void setAdres(Address adres) {
        this.adres = adres;
    }
    public String getRijksregistersnr() {
        return rijksregistersnr;
    }
    public void setRijksregistersnr(String rijksregistersnr) {
        this.rijksregistersnr = rijksregistersnr;
    }
    public String toString(){
        return this.getRijksregistersnr() + " "+ this.getNaam() + " "+ this.getVoornaam()+ " "+ this.getAdres();
    }  
}
