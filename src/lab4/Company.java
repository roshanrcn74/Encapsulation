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
    private HRDepartment hrDepartment;

    public Company() {
        hrDepartment = new HRDepartment();
    }
    // delegate employee details to hr department
    public void hireEmployee(String fName, String lName, String ssn){
        hrDepartment.hirePerson(fName, lName, ssn);    
    }
    // 
    public HRDepartment getHrDepartment() {
        return hrDepartment;
    }
    
}
