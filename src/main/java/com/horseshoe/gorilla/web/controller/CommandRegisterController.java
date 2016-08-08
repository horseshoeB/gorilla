package com.horseshoe.gorilla.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/command/register")
public class CommandRegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", "disp Message!!");

		return "index";
	}

}
