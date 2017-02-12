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
    private List<Employee> employee;
    private String cubeID = "";

    public HRDepartment() {
        this.employee = new ArrayList();
    }
  
    public void hirePerson(String fName, String lName, String ssn){
        Employee employee = new Employee(fName, lName, ssn);
        employee.setCubeId(assignCubeId());
        this.employee.add(employee);
        //employee.doFirstTimeOrientation(assignCubeId());
        //employee.getReportService().outputReport();       
    } 
    
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
    
    public Employee getEmployee(String ssn){
        int index = 0;
        while (employee.size() > index) {
	 if (employee.get(index).getSsn().equals(ssn)){
             return employee.get(index);
            }
                index++;
        }
       return null; 
    }
    
    public void doOrientation(Employee emp){
        if (emp != null ){
            emp.doFirstTimeOrientation(assignCubeId());
            getEmployeeOrientationReport(emp);
        }
        
    }
    
    public void getEmployeeOrientationReport(Employee emp){
        emp.getReportService().outputReport();
    }

    public List<Employee> getEmployee() {
        return employee;
    }
    
}
