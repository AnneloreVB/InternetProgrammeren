/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Annelore pc
 */
public class DBException extends RuntimeException {
    
    private String message;
    
    public DBException(String message){
        setMessage(message);
    }
    @Override
    public String getMessage(){
        return message;
    }
    private void setMessage(String message){
        this.message = message;
    }
}
