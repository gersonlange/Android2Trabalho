package br.inf.edge.visita.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegiaoDTO
{
	@Setter @Getter
	private int codigo;

	@Setter @Getter
	private String nome;

	@Setter @Getter
	private String data;

	@Setter @Getter
	private String observacao;

	@Setter @Getter
	private List<ClienteDTO> clientes;
}