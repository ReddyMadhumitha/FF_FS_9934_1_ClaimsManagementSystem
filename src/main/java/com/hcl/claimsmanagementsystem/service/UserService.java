/**
 * 
 */
package com.hcl.claimsmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;
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
@Service 
public interface UserService {
	boolean register(User user);
	boolean profile(UserDetails user);
	boolean claimRequest(ClaimRequest user);
	boolean payment(Payment user);
    String login(Credential credential);
}
