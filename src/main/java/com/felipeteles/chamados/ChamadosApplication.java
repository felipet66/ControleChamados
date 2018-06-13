package com.felipeteles.chamados;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipeteles.chamados.domain.Chamado;
import com.felipeteles.chamados.repository.ChamadoRepository;

@SpringBootApplication
public class ChamadosApplication implements CommandLineRunner {
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ChamadosApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Chamado chamado = new Chamado(null, "Internet ruim!","Pendente","Felipe", sdf.parse("13/06/2018") );
		Chamado chamado2 = new Chamado(null, "PC com problema","Aberto","Felipe", sdf.parse("13/06/2018") );
		
		chamadoRepository.saveAll(Arrays.asList(chamado, chamado2));
	}
}
