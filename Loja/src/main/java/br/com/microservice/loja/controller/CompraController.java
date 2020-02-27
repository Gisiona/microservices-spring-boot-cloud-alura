package br.com.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.microservice.loja.dto.CompraDTO;
import br.com.microservice.loja.dto.response.CompraResponse;
import br.com.microservice.loja.processor.CompraProcessor;

@RestController
@RequestMapping("/api/v1/loja")
public class CompraController {
	
	private CompraProcessor compraProcessor;
	
	@Autowired
	public CompraController(CompraProcessor _compraProcessor) {
		this.compraProcessor = _compraProcessor;
	}
	
	@PostMapping("/compra")
	public ResponseEntity<CompraResponse> realizarCompra(@RequestBody CompraDTO compra) throws JsonProcessingException
	{
		CompraResponse response = compraProcessor.realizarCompra(compra);
		return new ResponseEntity<CompraResponse>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/health")
	public ResponseEntity<?> ok()
	{
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
