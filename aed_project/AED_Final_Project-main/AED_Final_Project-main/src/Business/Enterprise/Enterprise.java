/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author vidhi
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String enterpriseName, EnterpriseType type)
    {
      super(enterpriseName);
      this.enterpriseType= type;
      organizationDirectory = new OrganizationDirectory();
    }
    //enums for different types of enterprise
     public enum EnterpriseType
     {
        Community("Community"),
        NGO("NGO"),
        Provider ("Provider"),
        Police("Police"),
        Hospital("Hospital"),
        FireMan("FireMan");
        
        private String enterpriseTypeValue;
        
        private EnterpriseType(String value)
        {
            this.enterpriseTypeValue = value;
        }

        public String getEnterpriseTypeValue() {
            return enterpriseTypeValue;
        }
        
        @Override
        public String toString()
        {
            return enterpriseTypeValue;
        }
     }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
