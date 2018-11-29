package br.inf.edge.visita.api.model;

import lombok.Getter;
import lombok.Setter;

public class ClienteDTO {

	@Setter @Getter
	private int codigo;

	@Setter @Getter
	private String nome;

	@Setter @Getter
	private String endereco;

	@Setter @Getter
	private String observacao;
}