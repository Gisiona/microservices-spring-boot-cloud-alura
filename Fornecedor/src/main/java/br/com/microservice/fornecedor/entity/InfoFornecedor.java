package br.com.microservice.fornecedor.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity @Table(name = "fornecedor")
public class InfoFornecedor implements Serializable {
   
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long idFornecedor;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pessoa_ontato")
	private String pessoaContato;
	
	@Column(name = "estado")
	private String estado;
}
