package br.com.microservice.fornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.dto.InfoFornecedorDto;
import br.com.microservice.fornecedor.dto.response.DataResponse;
import br.com.microservice.fornecedor.entity.InfoFornecedor;
import br.com.microservice.fornecedor.processor.InfoFornecedorProcessor;

@RestController
@RequestMapping("/v1/fornecedor")
public class InfoFornecedorController {

	@Autowired
	private InfoFornecedorProcessor infoFornecedorProcessor;
	
	@GetMapping("/all/{estado}")
	public ResponseEntity<DataResponse<List<InfoFornecedorDto>>> buscarFornecedorPorEstado(@PathVariable String estado) {	
		List<InfoFornecedorDto> fornecedores = infoFornecedorProcessor.buscarFornecedorPorEstado(estado);
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse (fornecedores));
	}
	
	@GetMapping("/info/{id}")
	public ResponseEntity<DataResponse<InfoFornecedor>> buscarFornecedorPorId(@PathVariable Long id) {	
		InfoFornecedor fornecedor = infoFornecedorProcessor.buscarFornecedorPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse (fornecedor));
	}
	
	
}
