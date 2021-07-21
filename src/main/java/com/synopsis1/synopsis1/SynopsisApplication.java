package com.synopsis1.synopsis1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.synopsis1.synopsis1.service.IpersonaService;
import com.synopsis1.synopsis1.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class SynopsisApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SynopsisApplication.class);
	@Autowired
	private IpersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SynopsisApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception{
		//System.out.println("HOLA A TODOS");
		//LOG.info("HOLA A TODOS");
		//LOG.warn("esto es un mensaje de advertencia");
		//service = new PersonaServiceImpl();
		service.registrar("Jose");
	}

}
