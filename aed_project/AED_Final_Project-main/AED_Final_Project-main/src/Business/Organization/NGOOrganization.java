/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.NGO.NGODirectory;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author jan
 */
public class NGOOrganization extends Organization{
    NGODirectory ngoList;
    //constructor to add NGO list to NGO directory
    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngoList=new NGODirectory();
    }

    public NGODirectory getNgoList() {
        return ngoList;
    }

    public void setNgoList(NGODirectory ngolist) {
        this.ngoList = ngolist;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }
}
