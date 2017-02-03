/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Date;

/**
 *
 * @author roshann
 */
public class ValidationService {
    
    
    public boolean isValid(String value){
        boolean valid = false;
        if (value != null && !value.isEmpty()){
            valid = true;
        }
        return valid;
    }
    
    
    public boolean isValidDate(Date value){
        boolean valid = false;
        if (value != null){
            valid = true;
        }
        return valid;
    }
    
    public boolean isValidSSN(String value){
        boolean valid = false;
        if (value != null && value.length() >= 9 && value.length() <= 11 ){
            valid = true;
        }
        return valid;        
    }
    
}
