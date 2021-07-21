package com.synopsis1.synopsis1.service;

import org.springframework.stereotype.Service;
import com.synopsis1.synopsis1.repository.IPersonaRepo;
//import com.synopsis1.synopsis1.repository.PersonaRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Service
public class PersonaServiceImpl implements IpersonaService {
	
	@Autowired
	@Qualifier("persona2")
	private IPersonaRepo repo;
	

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		//repo = new PersonaRepoImpl();
		repo.registrar(nombre);
	}

}
