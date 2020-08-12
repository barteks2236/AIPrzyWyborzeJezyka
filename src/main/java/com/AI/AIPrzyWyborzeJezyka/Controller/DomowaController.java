package com.AI.AIPrzyWyborzeJezyka.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AI.AIPrzyWyborzeJezyka.Data.ListaJezykow;
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
		
		ZapytaniaJarvis.y = ZapytaniaJarvis.danePytan.get(n);
		Odpowiedzi.daneOdp2.add(odp.getOdp());

		System.out.println(Odpowiedzi.daneOdp2);
		Odpowiedzi.imie = Odpowiedzi.daneOdp2.get(0);
		Odpowiedzi.x = Odpowiedzi.daneOdp2.get(n);
		
		System.out.println(ZapytaniaJarvis.danePytan.size() + "a n=" + n);
		

		if (n==1 && !Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("tak")) {
			return "domowaAI";
		}
		
		if (n==2 && !Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("ok")) {
			return "domowaAI";
		}
		
		if (n==3 && (Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("chce być programistą") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("chce byc programistą") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("programistą")
				|| Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("chce być programistką") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("chce byc programistką") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("programistką") 
				|| Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("programista") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("programistka"))) {
			Odpowiedzi.waga+=1;
		}
		if (n==3 && (Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("biznes") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("otworzyć biznes") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("założyć biznes")
				|| Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("startup") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("start up") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("rozkrecic cos") 
				|| Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("rozkręcić biznes") || Odpowiedzi.daneOdp2.get(n).toLowerCase().equals("rozkręcić coś"))) {
			Odpowiedzi.waga+=2;
		}
		else
			Odpowiedzi.waga+=3;
		
		

		n++;
		
		
		
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
	
	
	
	
	
// Nawigacja VERONICA
	
	@GetMapping("/Veronica")
	public String getVeronica() {
		return "Veronica";
	}
	
	@GetMapping("/programista")
	public String getProgramista() {
		return "programista";
	}
	
	@GetMapping("/projekt")
	public String getProjekt() {
		return "projekt";
	}
	
	@GetMapping("/gry")
	public String getGry() {
		return "gry";
	}
	
	@GetMapping("/gry2")
	public String getGry2(Model model) {
		model.addAttribute("listaJezykowGry", ListaJezykow.getListaJezykowGry());
		return "gry2";
	}
	
	@GetMapping("/gry3")
	public String getGry3(Model model) {
		model.addAttribute("listaJezykowGry2", ListaJezykow.getListaJezykowGry2());
		return "gry3";
	}
	
	@GetMapping("/aplikacje")
	public String getAplikacje() {
		return "aplikacje";
	}
	
	@GetMapping("/aplikacje2")
	public String getAplikacje2() {
		return "aplikacje2";
	}
	
	@GetMapping("/aplikacje3")
	public String getAplikacje3() {
		return "aplikacje3";
	}
	
	@GetMapping("/aplikacje4")
	public String getAplikacje4() {
		return "aplikacje4";
	}
	
	@GetMapping("/iOS")
	public String getIOS(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(4));
		return "iOS";
	}
	
	@GetMapping("/Java")
	public String getJava(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(5));
		return "Java";
	}
	
	@GetMapping("/Windows")
	public String getWindows(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(6));
		return "Windows";
	}
	
	@GetMapping("/dataScience")
	public String getDataScience(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow());
		return "dataScience";
	}
	
	@GetMapping("/machineLearning")
	public String getMachineLearning(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(1));
		return "machineLearning";
	}
	
	@GetMapping("/stronaInt")
	public String getStronaInt(Model model) {
		model.addAttribute("listaJezykowFront", ListaJezykow.getListaJezykowFront());
		return "stronaInt";
	}
	
	@GetMapping("/backend")
	public String getBackend(Model model) {
		model.addAttribute("listaJezykowBack", ListaJezykow.getListaJezykowBack());
		return "backend";
	}
	
	@GetMapping("/bazyDanych")
	public String getBazyDanych(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(3));
		return "bazyDanych";
	}
	
	@GetMapping("/propozycja")
	public String getPropozycja(Model model) {
		model.addAttribute("listaJezykow", ListaJezykow.getListaJezykow().get(1));
		return "propozycja";
	}
	
	@GetMapping("/dlaczego")
	public String getDlaczego() {
		return "dlaczego";
	}

}
