package br.inf.edge.visita.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Login {

	@Getter @Setter
	private String username;

	@Getter @Setter
	private String password;
}