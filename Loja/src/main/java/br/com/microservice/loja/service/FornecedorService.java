package br.com.microservice.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.mapper.FornecedorMapper;
import br.com.microservice.loja.service.client.IFornecedorServiceClient;

@Service
public class FornecedorService {

	@Autowired
	private IFornecedorServiceClient fornecedorClient;
	
	public List<InfoFornecedorDTO> buscarFornecedoresPorEstado(String estado) throws Throwable {
		try {			
			ResponseEntity<Object> objReturn = fornecedorClient.buscarFornecedorPorEstado(estado);

			return FornecedorMapper.toMapper(objReturn.getBody());			
		} catch (HttpClientErrorException e) {
			throw e;
		}		
	}
}
