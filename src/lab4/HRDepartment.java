/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roshann
 */
public class HRDepartment {
    private List<Employee> empList;
    private String cubeID = "";

    public HRDepartment() {
        this.empList = new ArrayList();
    }
    // get the employee details and add to the array list 
    public void hirePerson(String fName, String lName, String ssn){
        Employee employee = new Employee(fName, lName, ssn);
        employee.setCubeId(assignCubeId());
        this.empList.add(employee);
        //employee.doFirstTimeOrientation(assignCubeId());
        //employee.getReportService().outputReport();       
    } 
    // assign new cube id to the employee
    public String assignCubeId(){
        String cubeId = "A01";
        if ("".equalsIgnoreCase(this.cubeID)){
            cubeId = "A01";
        } else {
            int num = Integer.parseInt(this.cubeID.substring(2))+1;
            cubeId = "A0" + num;  
        }
        this.cubeID = cubeId;

        return cubeId;      
    }
    // return the employee base on ssn
    public Employee getEmployee(String ssn){
        int index = 0;
        while (empList.size() > index) {
	 if (empList.get(index).getSsn().equals(ssn)){
             return empList.get(index);
            }
                index++;
        }
       return null; 
    }
    
    // call employee for Oruentation
    public void doOrientation(Employee emp){
        if (emp != null ){
            emp.doFirstTimeOrientation(assignCubeId());
            //getEmployeeOrientationReport(emp);
        }
        
    }
    
    //get employee orientation report
    public void getEmployeeOrientationReport(Employee emp){
        emp.getReportService().outputReport();
    }
    
    //get employee list
    public List<Employee> getEmpList() {
        return empList;
    }
    
}
