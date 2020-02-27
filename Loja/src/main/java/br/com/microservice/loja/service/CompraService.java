package br.com.microservice.loja.service;

import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.loja.dto.CompraDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	private RestTemplate restTemplate;
	private String urlApiFornecedor = "http://localhost:8081/api/v1/fornecedor/info/SP";
	

	public ResponseEntity<InfoFornecedorDTO> realizarCompra(CompraDTO compra) {
		restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate.exchange(URI.create(urlApiFornecedor ), HttpMethod.GET, null, String.class);
		return null;
	}

}
