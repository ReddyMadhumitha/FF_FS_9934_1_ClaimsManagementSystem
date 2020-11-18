package com.hcl.claimsmanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.claimsmanagementsystem.model.ClaimRequest;
import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.Payment;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.model.UserDetails;
import com.hcl.claimsmanagementsystem.service.UserService;

/*
 * This class acts as a controller for registering the user details,updation of the profile,
 * request for the claims,payment updation and login credentials
 */
@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("registration");
		else {
			if (userService.register(user))
				return new ModelAndView("registerSuccess");
			else
				return new ModelAndView("registerFailed");
		}
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration", "user", new User());

	}

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("profile") UserDetails user, BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("profile");
		else {
			if (userService.profile(user))
				return new ModelAndView("updateSuccess");
			else
				return new ModelAndView("updateFailed");
		}
	}

	@RequestMapping("/profile")
	public ModelAndView add2() {
		return new ModelAndView("profile", "profile", new UserDetails());

	}

	@RequestMapping(value = "/claimrequest", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("claimreq") ClaimRequest user, BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("claimrequest");
		else {
			if (userService.claimRequest(user))
				return new ModelAndView("claimRequestSuccess");
			else
				return new ModelAndView("claimRequestFailed");
		}
	}

	@RequestMapping("/claimrequest")
	public ModelAndView request() {
		return new ModelAndView("claimrequest", "claimreq", new ClaimRequest());

	}

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("payment") Payment user) {
		if (userService.payment(user))
			return new ModelAndView("paymentUpdateSuccess");
		else
			return new ModelAndView("paymentUpdatefailed");
	}

	@RequestMapping("/payment")
	public ModelAndView payment() {
		return new ModelAndView("payment", "payment", new Payment());

	}

	@RequestMapping("/login")
	public ModelAndView addLogin() {
		return new ModelAndView("login", "credential", new Credential());

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView add1(@ModelAttribute("credential") Credential credential, BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("login");
		else {
			if (userService.login(credential).equals("Member"))
				return new ModelAndView("loginSuccess");
			else if (userService.login(credential).equals("Admin"))
				return new ModelAndView("adminLogin");
			return new ModelAndView("loginFailed");
		}
	}

	@RequestMapping("/homepage")
	public ModelAndView addHome() {
		return new ModelAndView("homepage");

	}
}
