/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author rajen
 */
public class MainSystem extends Organization {
    
    private static MainSystem mainSystem;
    private ArrayList<Network> networkList;
    
    
    public static MainSystem getInstance()
    {
     if(mainSystem == null)
     {
         mainSystem = new MainSystem();
     }
     return mainSystem;
    }
    //constructor for Ecosystem class
    private MainSystem()
    {
        super(null);
        networkList = new ArrayList<>();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(MainSystem system)
    {
        mainSystem = system;
    }
    //add a network
    public Network addNetwork()
    {
      Network  network = new Network();
      networkList.add(network);
      return network;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SystemAdminRole());
        
        return role;
    }
    
    
    
    
    
    
    
    
    public static boolean checkIfUsernameIsUnique(String username)
    {
        for(Network n : mainSystem.getNetworkList())
        {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
            {
                for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                {
                    if(ua.getUsername().equals(username))
                    {
                        return false;
                    }
                }
                
                for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUsername().equals(username))
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }   
    
}
