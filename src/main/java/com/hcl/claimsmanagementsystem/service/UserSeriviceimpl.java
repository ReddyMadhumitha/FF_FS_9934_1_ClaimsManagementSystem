/**
 * 
 */
package com.hcl.claimsmanagementsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.claimsmanagementsystem.model.ClaimRequest;
import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.Payment;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.model.UserDetails;
import com.hcl.claimsmanagementsystem.repository.UserDao;
/**
 * This class  is used for registering the user,profile of the user,
 *claimrequest of the user,payment of the user and login for the credential
 * @author reddy-madhumitha
 *
 */
@Service
public class UserSeriviceimpl implements UserService  {
	@Autowired
    UserDao userDao;
    public boolean register(User usr) {
        if(userDao.register(usr))
        	return true;
        return false;
    }
    public boolean profile(UserDetails usr) {
        if(userDao.profile(usr))
        	return true;
        return false;
    }
    public boolean claimRequest(ClaimRequest usr) {
        if(userDao.claimRequest(usr))
        	return true;
        return false;
    }
    public boolean payment(Payment user) {
        if(userDao.payment(user))
        	return true;
        return false;
    }
    public String login(Credential credential) {
        if(userDao.login(credential).equals("Member"))
        	return "Member";
        if(userDao.login(credential).equals("Admin"))
        	return "Admin";
        return "Failed";
    }
}
