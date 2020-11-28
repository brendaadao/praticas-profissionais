package com.marido.aluguel.marido.com.marido.aluguel.marido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.marido.aluguel.marido.com.marido.aluguel.marido.DAO.MaridoDAO;
import com.marido.aluguel.marido.com.marido.aluguel.marido.Domain.ServicoDomain;

@Controller
public class MaridoController {
	
	@Autowired
	private MaridoDAO maridoDAO;

	@CrossOrigins("*")
	@PostMapping(value="/cadastrarServico")
	public ResponseEntity<?> cadastrarServico(@RequestBody ServicoDomain servicoDomain) {
		
		try {
			maridoDAO.insert(servicoDomain);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@CrossOrigins("*")
	@GetMapping(value="/recuperarServicos")
	public ResponseEntity<?> recuperarServicos() {
		
		List<ServicoDomain> servicos = maridoDAO.findAll();
		
		try {
			
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
		}
		
		return new ResponseEntity<>(servicos, HttpStatus.OK);
	}
	
}
