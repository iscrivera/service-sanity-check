package mx.com.ariverav.servicesanitycheck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.com.ariverav.servicesanitycheck.model.Menu;

@Controller
public class SanityCheckController {
	
	@Value("${app.menus}")
	List<Menu> menus;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("menus", menus);		
		return "index";
		
	}

}
