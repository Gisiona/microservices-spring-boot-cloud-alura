package br.com.microservice.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.microservice.loja.dto.CompraRequestDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.dto.response.CompraResponse;
import br.com.microservice.loja.dto.response.DataResponse;
import br.com.microservice.loja.exception.FornecedorHttpClientException;
import br.com.microservice.loja.processor.CompraProcessor;

@RestController
@RequestMapping("/api/v1/loja")
public class CompraController {
	
	@Autowired
	private CompraProcessor compraProcessor;
	
	@PostMapping("/compra")
	public ResponseEntity<DataResponse<CompraResponse>> realizarCompra(@RequestBody CompraRequestDTO compra) throws JsonProcessingException
	{
		CompraResponse response = compraProcessor.realizarCompra(compra);
		return ResponseEntity.status(HttpStatus.CREATED).body(new DataResponse (response));
	}
	
	@GetMapping("/fornecedores/{id}")
	public ResponseEntity<DataResponse<InfoFornecedorDTO>> listaFornecedorPorId(@PathVariable Long id) throws FornecedorHttpClientException 
	{
		InfoFornecedorDTO response = compraProcessor.listaFornecedorPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse (response));
	}
	
	@PostMapping("/fornecedores/estado/{estado}")
	public ResponseEntity<DataResponse<List<InfoFornecedorDTO>>> buscarFornecedoresPorEstado(@PathVariable String estado) throws Throwable 
	{
		List<InfoFornecedorDTO> response = compraProcessor.buscarFornecedoresPorEstado(estado);
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse (response));
	}
	
	@GetMapping("/health") 
	public ResponseEntity<DataResponse<String>> ok()
	{
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse<String>(""));
	}
}
