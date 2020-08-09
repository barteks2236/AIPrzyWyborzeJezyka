package com.AI.AIPrzyWyborzeJezyka.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AI.AIPrzyWyborzeJezyka.Data.Odpowiedzi;
import com.AI.AIPrzyWyborzeJezyka.Data.ZapytaniaJarvis;

import org.springframework.ui.Model;


@Controller
public class DomowaController {
	public static int n=0;	
		
	@GetMapping("/domowaAI")
//	@ResponseBody
	public String stronaDomowa() {
		Odpowiedzi.daneOdp2.clear();
		Odpowiedzi.daneOdp.clear();
		System.out.println("LISTY WYCZYSZCZONE");
		n=0;
		
		return "domowaAI";
	}

	@GetMapping("/JARVISchat")
	public String JARVISchat(@ModelAttribute Odpowiedzi odp, ZapytaniaJarvis pyt, Model model) {
		model.addAttribute("odpowiedz", odp);
		model.addAttribute("zapytanie", pyt);
		
		ZapytaniaJarvis.y=ZapytaniaJarvis.danePytan.get(0);
		Odpowiedzi.daneOdp2.add(odp.getOdp());
		System.out.println(Odpowiedzi.daneOdp2);
		Odpowiedzi.imie = Odpowiedzi.daneOdp2.get(0);
		

		
		n++;	

		
		
		return "JARVISchat";
	}

	@PostMapping("/JARVISchat")
	public String setPerson(@ModelAttribute Odpowiedzi odp, ZapytaniaJarvis pyt, Model model) {


		model.addAttribute("odpowiedz", odp);
		model.addAttribute("zapytanie", pyt);

		
//			 Odpowiedzi.daneOdp.add(odp);
		
		ZapytaniaJarvis.y = ZapytaniaJarvis.danePytan.get(n);
		Odpowiedzi.daneOdp2.add(odp.getOdp());

		System.out.println(Odpowiedzi.daneOdp2);
		Odpowiedzi.imie = Odpowiedzi.daneOdp2.get(0);
		Odpowiedzi.x = Odpowiedzi.daneOdp2.get(n);
		n++;
		System.out.println(ZapytaniaJarvis.danePytan.size() + "a n=" + n);
		
		if (ZapytaniaJarvis.danePytan.size()==n){
			System.out.println("Koniec pytań");
			return "domowaAI";
		}		
		
		
		else
		
		
		return "JARVISchat";
		
//			 System.out.println(Odpowiedzi.daneOdp);
		
		 

//		if(!osoba.getImie().equals("")) {
//			
//		
//			System.out.println(Osoba.daneOsoby);
//			
//	
//		

		/* return "JARVISchat"; */
		/*return "JARVISchat";*/
	}

	@GetMapping("/LoginForm")
	public String LoginForm(Model model) {
		model.addAttribute("odpowiedz", new Odpowiedzi());
		model.addAttribute("pytanie", new ZapytaniaJarvis());
		
		return "LoginForm";
	}

	@PostMapping("/LoginForm")
	public String getPerson(@ModelAttribute Odpowiedzi odp, ZapytaniaJarvis pyt, Model model) {

		model.addAttribute("odpowiedz", odp);
		model.addAttribute("zapytanie", pyt);
		
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
