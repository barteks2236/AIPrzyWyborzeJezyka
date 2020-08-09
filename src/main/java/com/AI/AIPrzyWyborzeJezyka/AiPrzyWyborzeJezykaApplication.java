package com.AI.AIPrzyWyborzeJezyka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.AI.AIPrzyWyborzeJezyka.Data.ZapytaniaJarvis;

@SpringBootApplication
public class AiPrzyWyborzeJezykaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiPrzyWyborzeJezykaApplication.class, args);
		ZapytaniaJarvis.stworzenieBazyPytan();
		
//		List<String> danePytan = new ArrayList<String>();
//		danePytan.add("Miło Cię poznać ");
//		danePytan.add("Szukasz języka programowania do nauki, tak? ");
//		danePytan.add("To Świetnie trafiłęś, ale żebym mógł Ci pomóc musi mi odpowiedzieć na kilka ważnych pytań, ok? ");
//		danePytan.add("loading... ");

		
		
	}

}
