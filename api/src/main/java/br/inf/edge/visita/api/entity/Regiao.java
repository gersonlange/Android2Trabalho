package br.inf.edge.visita.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
public class Regiao {

	@Id
	@GeneratedValue
	@Setter @Getter
	private Long id;

	@Setter @Getter
	private int codigo;

	@Setter @Getter
	private String nome;
}
