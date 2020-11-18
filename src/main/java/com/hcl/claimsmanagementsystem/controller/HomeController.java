package com.hcl.claimsmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * This class is used for automatically opening the registration page without the need of giving the url
 *  '/user/registration'
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("redirect:user/homepage");
		// return new ModelAndView("registration");
	}
}