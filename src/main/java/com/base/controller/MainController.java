package com.base.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MainController extends BaseController {

	private static final Logger logger = Logger.getLogger(MainController.class);
	



	@RequestMapping("/")
	public String main(Model model) {
		return "home";
	}


}
