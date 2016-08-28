/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Person {
    @Id
    @Size(min = 8,max = 8, message ="{Size.Person.rijksregistersnr}")
    @Pattern(regexp = "^(r|R)[0-9]{7}$", message = "{Pattern.Person.rijksregistersnr}")
    private String rijksregistersnr;
    
    @NotBlank(message = "{NotBlank.Person.naam}")
    private String naam;
    
    @NotBlank(message = "{NotBlank.Person.voornaam}")
    private String voornaam;
    
    @Valid
    @OneToOne//(cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
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
       
}
