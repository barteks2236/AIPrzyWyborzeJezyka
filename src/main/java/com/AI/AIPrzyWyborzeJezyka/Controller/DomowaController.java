package com.AI.AIPrzyWyborzeJezyka.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AI.AIPrzyWyborzeJezyka.Data.Osoba;

import org.springframework.ui.Model;



@Controller
public class DomowaController {
	@GetMapping("/domowaAI")
//	@ResponseBody
	public String stronaDomowa() {
		return "domowaAI";
	}
	
	@GetMapping("/JARVISchat")
	public String JARVISchat() {
		return "JARVISchat";
	}	 
	@PostMapping("/JARVISchat")
	public String setPerson(@ModelAttribute Osoba osoba) {

		
//		if(!osoba.getImie().equals("")) {
//			Osoba.daneOsoby.add(osoba);
//		
//			System.out.println(Osoba.daneOsoby);
//			
//	
//		}
		
		return "errorPage";
	}
	
	
	
	
	
	
	@GetMapping("/LoginForm")
	public String LoginForm(Model model) {
		 model.addAttribute("klient", new Osoba()); 
		return "LoginForm";
	}	
	
	@PostMapping("/LoginForm")
	public String getPerson(@ModelAttribute Osoba osoba, Model model) {

		model.addAttribute("klient", osoba);
		
//		if(!osoba.getImie().equals("")) {
//			Osoba.daneOsoby.add(osoba);
//		
//			System.out.println(Osoba.daneOsoby);
//			
//	
//		}

		return "LoginForm";
	}
	
	
	
	
	
	
}
