package com.felipeteles.chamados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeteles.chamados.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
