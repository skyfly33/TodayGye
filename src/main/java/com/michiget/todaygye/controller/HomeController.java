package com.michiget.todaygye.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public interface HomeController {

	/*
	 * test�� public String test(Locale locale, Model model) throws Exception;
	 */

	// login page
	public String loginForm() throws Exception;

}
