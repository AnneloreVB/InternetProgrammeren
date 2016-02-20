/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Annelore pc
 */
public class Adres {
    
    private String straat;
    private int huisnr;
    private String bus;
    private int postcode;
    private String gemeente;
    
    public Adres(String straat,int huisnr,String bus,int postcode,String gemeente) throws DomainException{
        setStraat(straat);
        setHuisnr(huisnr);
        setBus(bus);
        setPostcode(postcode);
        setGemeente(gemeente);
    }
    public Adres(String straat,int huisnr,int postcode,String gemeente) throws DomainException{
        this(straat,huisnr,null,postcode,gemeente);
    }

    public String getStraat() {
        return straat;
    }

    private void setStraat(String straat) throws DomainException {
        if(straat == null){
            throw new DomainException("geef geldige straat in");
        }
        this.straat = straat;
    }
    
    public int getHuisnr() {
        return huisnr;
    }

    private void setHuisnr(int huisnr) throws DomainException {
       if(huisnr == 0){
           throw new DomainException("geef geldig huisnr in");
       }
        this.huisnr = huisnr;
    }
    
    public String getBus() {
        return bus;
    }
    
    private void setBus(String bus) {
        this.bus = bus;
    }

    public int getPostcode() {
        return postcode;
    }
    private void setPostcode(int postcode) throws DomainException {
        if(postcode == 0){
            throw new DomainException("geef een geldige postcode in");
        }
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    private void setGemeente(String gemeente) throws DomainException {
        if(gemeente == null){
            throw new DomainException("geef geldige gemeente in");
        }
        this.gemeente = gemeente;
    }
    
    
}
