package com.michiget.todaygye.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.michiget.todaygye.controller.HomeController;

@Service
public class HomeService implements HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Override
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home.tiles";
	}

	@Override
	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String loginForm() throws Exception {
		logger.info("loginForm page.");
		return "login/loginform.tiles";
	}

	@Override
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String joinForm() throws Exception {
		logger.info("joinForm page.");
		return "join/joinform.tiles";
	}
}
