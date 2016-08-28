
package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Annelore pc
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity 
public class Address  { 
    @Id 
    @GeneratedValue
    private int id;
    
    @NotBlank(message = "{NotBlank.Address.straat}")
    @Size (min = 5, max = 50 , message = "{Size.Address.straat}" )
    private String straat;
    
    @NotNull(message = "{NotNull.Address.huisnr}") @Min(1) @Max(1000)
    private int huisnr;
    
    private String bus;
    
    @NotNull (message = "{NotNull.Address.postcode}") @Min(4) @Max(5)
    private int postcode;
    
    @NotBlank(message = "{NotBlank.Address.gemeente}")
    @Size (min = 2, max = 50 , message = "{Size.Address.gemeente}" )
    private String gemeente;
    
    
    public Address(){
        
    }
    public Address(String straat,int huisnr,String bus,int postcode,String gemeente){
        setStraat(straat);
        setHuisnr(huisnr);
        setBus(bus);
        setPostcode(postcode);
        setGemeente(gemeente);
    }
    public Address(String straat,int huisnr,int postcode,String gemeente){
        this(straat,huisnr,null,postcode,gemeente);
    }

    public String getStraat() {
        return this.straat;
    }

    public void setStraat(String straat){
        if(straat == null){
            throw new DomainException("geef geldige straat in");
        }
        this.straat = straat;
    }
    
    public int getHuisnr() {
        return huisnr;
    }

    public void setHuisnr(int huisnr){
       if(huisnr == 0){
           throw new DomainException("geef geldig huisnr in");
       }
        this.huisnr = huisnr;
    }
    
    public String getBus() {
        return bus;
    }
    
    public void setBus(String bus) {
        this.bus = bus;
    }

    public int getPostcode() {
        return postcode;
    }
    public void setPostcode(int postcode){
        if(postcode == 0){
            throw new DomainException("geef een geldige postcode in");
        }
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente){
        if(gemeente == null){
            throw new DomainException("geef geldige gemeente in");
        }
        this.gemeente = gemeente;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public boolean equals(Object o){
        if(o instanceof Address){
            Address a = (Address) o;
            if(a.getStraat().equals(this.getStraat()) 
                    && a.getHuisnr()== this.getHuisnr()
                    && this.getBus().equals(a.getBus())
                    && this.getPostcode() == a.getPostcode()){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        if(this.getBus() == null){
            return this.getStraat()+ " "+ this.getHuisnr()+ " "+ this.getPostcode()+" "+this.getGemeente();
        }
        return this.getStraat()+ " "+ this.getHuisnr()+ " "+ this.getBus()+" "+ this.getPostcode()+" "+this.getGemeente();
    }
    
}
