package br.inf.edge.visita.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;

	@Setter @Getter
	private int codigo;

	@Setter @Getter
	private String nome;

	@Setter @Getter
	private String endereco;

	@Setter @Getter
	private long idRegiao;
}
