/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.MainSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.HospitalEnterprise.HospitalAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidhi
 */
public class DoctorAdminRole extends Role{
 
	//overriding main panel with doctor admin work area whenever doctor admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new HospitalAdminWorkArea(userProcessContainer,enterprise,system);
    }   

    @Override
    public String toString()
    {
    	return Role.RoleType.DoctorAdminRole.getValue();
    }
}