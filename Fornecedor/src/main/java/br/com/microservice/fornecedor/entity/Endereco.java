package br.com.microservice.fornecedor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity @Table(name = "endereco")
public abstract class Endereco {

	@Id
	private Long idEndereco;
	private String endereco;
	private Long numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String uf;
	private String cep;
}
