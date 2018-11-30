package br.inf.edge.visita.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteDTO {

	@Setter @Getter
	private int codigo;

	@Setter @Getter
	private String nome;

	@Setter @Getter
	private String endereco;

	@Setter @Getter
	private String observacao;
	
	@Setter @Getter
	private double latitude;
	
	@Setter @Getter
	private double longitude;
}