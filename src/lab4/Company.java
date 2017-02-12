/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author roshann
 */
public class Company {
    private final HRDepartment hireResources;

    public Company() {
        hireResources = new HRDepartment();
    }
    
    public void hireEmployee(String fName, String lName, String ssn){
        //HRDepartment hiringResources = new HRDepartment();
        hireResources.hirePerson(fName, lName, ssn);
        
    }

    public HRDepartment getHireResources() {
        return hireResources;
    }
    
}
