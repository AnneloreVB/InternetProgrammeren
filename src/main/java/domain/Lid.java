/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Lid extends Person {
   private String rijksregistersnr;
   private String naam;
   private String voornaam;
   private Adres adres;
   private boolean heeftBetaald;
   
   public Lid(String rijksregisternr, String naam, String voornaam, Adres adres, boolean heeftBetaald){
      super(rijksregisternr, naam,voornaam,adres);
       this.heeftBetaald = heeftBetaald;
   }
   
   
    protected void betaal(){
        this.heeftBetaald = true;
    }
    protected void resetBetaling(){
        this.heeftBetaald = false;
    }
    public boolean heeftBetaald(){
        return heeftBetaald;
    }
}