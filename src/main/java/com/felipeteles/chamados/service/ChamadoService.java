package com.felipeteles.chamados.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeteles.chamados.domain.Chamado;
import com.felipeteles.chamados.repository.ChamadoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repo;
	
	public Chamado buscar(Integer id) throws ObjectNotFoundException {
		Optional<Chamado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Chamado.class.getName()));
	}
}