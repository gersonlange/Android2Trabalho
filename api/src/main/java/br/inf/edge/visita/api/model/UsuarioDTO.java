package br.inf.edge.visita.api.model;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDTO {
	
	@Setter @Getter
	private String nome;
	
	@Setter @Getter
	private String token;
}