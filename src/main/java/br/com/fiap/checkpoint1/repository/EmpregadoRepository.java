package br.com.fiap.checkpoint1.repository;

import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.model.Empregado;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
	
}
