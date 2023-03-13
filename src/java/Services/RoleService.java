package services;

import dataaccess.RoleDB;
import models.Role;

/**
 *
 * @author Rahul Bisht
 */
public class RoleService {
    
    public Role getRole(int iD) throws Exception{
        RoleDB roleDB = new RoleDB();
        Role role = roleDB.getRole(iD);
        return role;
    }
}
