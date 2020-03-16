package br.com.microservice.fornecedor.processor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.microservice.fornecedor.dto.InfoFornecedorDto;
import br.com.microservice.fornecedor.entity.Endereco;
import br.com.microservice.fornecedor.entity.InfoFornecedor;
import br.com.microservice.fornecedor.mapper.FornecedorMapper;
import br.com.microservice.fornecedor.repository.EnderecoRepository;
import br.com.microservice.fornecedor.repository.InfoFornecedorRepository;

@Component
public class InfoFornecedorProcessor {

	@Autowired
	private InfoFornecedorRepository infoFornecedorRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private FornecedorMapper fornecedorMapper;
	
	public List<InfoFornecedorDto> buscarFornecedorPorEstado(String estado) {
		List<InfoFornecedor> fornecedores = infoFornecedorRepository.findAll();		
		Optional<Endereco> endereco = enderecoRepository.findById(fornecedores.get(0).getIdEndereco());		
		List<InfoFornecedorDto> dtos = fornecedorMapper.from(fornecedores, endereco.get());
				
		return dtos;
	}

	public InfoFornecedorDto buscarFornecedorPorId(Long id) {
		Optional<InfoFornecedor> response = infoFornecedorRepository.findById(id);
		Optional<Endereco> endereco = enderecoRepository.findById(response.get().getIdEndereco());
		InfoFornecedorDto dto = fornecedorMapper.from(response.get(), endereco.get());
		
		return dto;
	}
}
