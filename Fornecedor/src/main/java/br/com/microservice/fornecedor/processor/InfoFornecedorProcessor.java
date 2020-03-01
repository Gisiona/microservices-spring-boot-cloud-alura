package br.com.microservice.fornecedor.processor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.microservice.fornecedor.entity.InfoFornecedor;
import br.com.microservice.fornecedor.repository.InfoFornecedorRepository;

@Component
public class InfoFornecedorProcessor {

	@Autowired
	private InfoFornecedorRepository infoFornecedorRepository;
	
	public List<InfoFornecedor> buscarFornecedorPorEstado(String estado) {
		return infoFornecedorRepository.findAll();
	}

	public InfoFornecedor buscarFornecedorPorId(Long id) {
		Optional<InfoFornecedor> response = infoFornecedorRepository.findById(id);
		return response.get();
	}
}
