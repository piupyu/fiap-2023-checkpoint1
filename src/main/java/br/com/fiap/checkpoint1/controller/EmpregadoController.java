package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadoService;

@RestController()
@RequestMapping("/empregados")
public class EmpregadoController {
	
	@Autowired()
	private EmpregadoService empregadoService;
	
	@GetMapping()
	public List<Empregado> findAll() {
		return empregadoService.findAll();
	}	
	
	@PutMapping()
	public Empregado update(@RequestBody Empregado empregado) {
		return empregadoService.update(empregado);
		
	}
	
	@PostMapping()
	public Empregado create(@RequestBody Empregado empregado) {
		return empregadoService.create(empregado);
		
	}
	

}
