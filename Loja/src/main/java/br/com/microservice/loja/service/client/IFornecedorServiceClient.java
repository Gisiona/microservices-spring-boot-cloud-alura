package br.com.microservice.loja.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("fornecedor") /* nome da aplicacao registrado no eureka server*/
public interface IFornecedorServiceClient {

	@RequestMapping("/api/v1/fornecedor/all/{estado}")
	ResponseEntity<Object> buscarFornecedorPorEstado(@PathVariable String estado);
}
