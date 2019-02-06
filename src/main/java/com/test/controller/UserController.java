package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("page")
	public ModelAndView showLoginPage(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("User", new User());
		modelAndView.setViewName("addform");
		System.out.println("hrey");
		return modelAndView;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("User") User user, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		userService.addEmployee(user);
		modelAndView.setViewName("sucess");
		return  modelAndView;
	}

}
