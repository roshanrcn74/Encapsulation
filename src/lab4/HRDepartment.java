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
public class HRDepartment {
    
    public void hirePerson(String fName, String lName, String ssn, String cubeId){
        Employee employee = new Employee(fName, lName, ssn);
        employee.doFirstTimeOrientation(cubeId);
        employee.getReportService().outputReport();
        
    }  
}
