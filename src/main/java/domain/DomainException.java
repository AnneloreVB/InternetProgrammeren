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
public class DomainException extends RuntimeException{
    private String message;
    
    public DomainException(String message){
        setMessage(message);
    }
    public String getMessage(){
        return message;
    }
    private void setMessage(String message){
        this.message = message;
    }
}
