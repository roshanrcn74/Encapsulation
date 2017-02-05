/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author roshann
 */
public class Company {
    private HRDepartment hiringResources;

    public Company() {
        //HiringAgency hiringResources = new HiringAgency();
    }
    
    public void hireEmployee(String fName, String lName, String ssn, String cubeID){
        HRDepartment hiringResources = new HRDepartment();
        hiringResources.hirePerson(fName, lName, ssn, cubeID);
    }
    
}
