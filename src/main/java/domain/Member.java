/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Member extends Person {
   private String rijksregistersnr;
   private String naam;
   private String voornaam;
   private Address adres;
   private boolean heeftBetaald;
   
   public Member(String rijksregisternr, String naam, String voornaam, Address adres, boolean heeftBetaald){
      super(rijksregisternr, naam,voornaam,adres);
       this.heeftBetaald = heeftBetaald;
   }
   
   
    public void betaal(){
        this.heeftBetaald = true;
    }
    protected void resetBetaling(){
        this.heeftBetaald = false;
    }
    public boolean heeftBetaald(){
        return heeftBetaald;
    }
}