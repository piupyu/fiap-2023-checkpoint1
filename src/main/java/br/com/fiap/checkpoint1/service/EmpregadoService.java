package br.com.fiap.checkpoint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

	@Autowired()
	private EmpregadoRepository empregadoRepository;

	public List<Empregado> findAll() {
		return empregadoRepository.findAll();
	}

	public Empregado update(Empregado empregado) {
		return empregadoRepository.save(empregado);

	}

	public Empregado create(Empregado empregado) {
		return empregadoRepository.save(empregado);

	}

}
