package br.com.microservice.fornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.entity.InfoFornecedor;
import br.com.microservice.fornecedor.processor.InfoFornecedorProcessor;

@RestController
@RequestMapping("/api/v1/fornecedor")
public class InfoFornecedorController {

	@Autowired
	private InfoFornecedorProcessor infoFornecedorProcessor;
	
	@GetMapping("/all/{estado}")
	public List<InfoFornecedor> buscarFornecedorPorEstado(@PathVariable String estado) {	
		List<InfoFornecedor> fornecedores = infoFornecedorProcessor.buscarFornecedorPorEstado(estado);
		return fornecedores;
	}
	
	@GetMapping("/info/{id}")
	public InfoFornecedor buscarFornecedorPorId(@PathVariable Long id) {	
		InfoFornecedor fornecedor = infoFornecedorProcessor.buscarFornecedorPorId(id);
		return fornecedor;
	}
	
	
}
