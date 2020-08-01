package com.AI.AIPrzyWyborzeJezyka.domowaAI.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DomowaController {
	@GetMapping("/domowaAI")
//	@ResponseBody
	public String stronaDomowa() {
		return "domowaAI";
	}
}
