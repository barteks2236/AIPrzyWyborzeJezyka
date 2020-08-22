package com.AI.AIPrzyWyborzeJezyka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.AI.AIPrzyWyborzeJezyka.Data.ZapytaniaJarvis;

@SpringBootApplication
public class AiPrzyWyborzeJezykaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiPrzyWyborzeJezykaApplication.class, args);
		ZapytaniaJarvis.stworzenieBazyPytan();	
	}
}