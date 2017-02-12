package lab4;

import java.util.List;
import java.util.Scanner;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Startup {
    public static void main(String[] args) {
        
        Company abc = new Company();
        
         // input employee details for hire
        Scanner input = new Scanner(System.in);
        String ans = "";
        do {
            System.out.print("Enter employee first name : ");
            String fName = input.next();
            System.out.print("Enter employee last name : ");
            String lName = input.next();           
            System.out.print("Enter employee ssn : ");
            String ssn = input.next();
            abc.hireEmployee(fName, lName, ssn);
            
            System.out.print("Do you want to hire more employee (Y/N) : ");
            ans = input.next();
            
        }while(!"N".equalsIgnoreCase(ans));
        
        // send hired employee for orientation 
        
        ans = "";
        int index = 0;
        List<Employee> empList = abc.getHrDepartment().getEmpList();
        do{
            if (empList.size() > index){
                String cubeId = empList.get(index).getCubeId();
                empList.get(index).doFirstTimeOrientation(cubeId);
                empList.get(index).getReportService().outputReport();
            }else {
                System.out.println("No more employes to send orientation ");
            }
            //abc.getHireResources().getEmployee().get(index).getReportService();
            index++;
            System.out.print("Send more employees to orientation (Y/N) : ");
            ans = input.next();
        } while (!"N".equalsIgnoreCase(ans));
        
    }    
}
