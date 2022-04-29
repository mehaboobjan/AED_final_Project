/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rajen
 */
public class SystemConfiguration {
    public static MainSystem configureSystem(){
    MainSystem system= MainSystem.getInstance();
   
     Employee employee= system.getEmployeeDirectory().createEmployee("SYSTEM ADMIN");
     //making defualt username, password for application admin role
     UserAccount ua= system.getUserAccountDirectory().createUserAccount("admin","admin", employee, new SystemAdminRole());
    
    return system;
    }
}



