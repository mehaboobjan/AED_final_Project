/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkRequestQueue;

/**
 *
 * @author jan
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkRequestQueue workQueue;
    
    public UserAccount(){
        workQueue = new WorkRequestQueue();
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkRequestQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkRequestQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
}
