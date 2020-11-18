/**
 * 
 */
package com.hcl.claimsmanagementsystem.repository;

import java.util.List; 

import org.springframework.stereotype.Repository;

import com.hcl.claimsmanagementsystem.model.ClaimRequest;
import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.Payment;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.model.UserDetails;

/**
 *
 *This interface is used for declaring a function for registering the user,profile of the user,
 *claimrequest of the user,payment of the user and login of the credential
 * @author reddy-madhumitha
 */
@Repository 
public interface UserDao {
	boolean register(User user);
	boolean profile(UserDetails user);
	boolean claimRequest(ClaimRequest user);
	boolean payment(Payment user);
    String login(Credential credential);
}
