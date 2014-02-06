/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author khalloway
 */
public class HREmployee extends Employee{
   
   
    public void startHiringProcess(Employee e, String cubeId){
        e.hireEmployee(cubeId);
    }
    
    public void startTerminationProcess(Employee e){
        e.terminateEmployee();
    }
    
    /*
    I have some confusion on whether this is a good implementation or not.
    Every Employee can be hired or terminated, but only an HREmployee can start
    the hiring or termination process. However, to use this implementation the
    hireEmployee() and terminateEmployee() are implemented in the employee class
    to preserve the encapsulation of meetWithHrForBenefitAndSalryInfo(),
    meetDepartmentStaff(), reviewDeptPolicies(), and moveIntoCubicle(String cubeId)as
    private methods. If I want to implement hireEmployee() and terminateEmployee()
    in this class, I would have to expose meetWithHrForBenefitAndSalryInfo(),
    meetDepartmentStaff(), reviewDeptPolicies(), and moveIntoCubicle(String cubeId)
    as public methods, which doesn't seem quite right, either. Could you email
    me with your thoughts on this implementation?
    
    khalloway@my.wctc.edu
    
    */
}
