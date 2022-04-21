package com.example.controller;

import com.example.entity.*;
import com.example.service.FortuneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class FortuneController {

	private final Logger logger = Logger.getLogger(getClass().getName());

	@RequestMapping("/fortuneService")
	public String showFortuneService(Model model){
		FortuneService fortuneService = new FortuneService();
		model.addAttribute("fortuneService", fortuneService);
		return "fortune-service";
	}

	@RequestMapping("/showFortune")
	public String showFortune(Model model, @ModelAttribute("fortuneService") FortuneService fortuneService){
		Fortune fortune;
		switch (fortuneService.getFortuneType()){
			case "Football": {
				fortune = new FootballFortune();
				break;
			}
			case "Basketball": {
				fortune = new BasketballFortune();
				break;
			}
			case "Swimming": {
				fortune = new SwimmingFortune();
				break;
			}
			default: throw new RuntimeException("Unknown fortune type!");
		}
		fortune.getFortune();
		model.addAttribute("fortune", fortune);

		return "fortune-service-confirmation";
	}
}
