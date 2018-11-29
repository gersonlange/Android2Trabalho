package br.inf.edge.visita.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inf.edge.visita.api.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>
{
	List<Cliente> findByIdRegiao(long idRegiao);
}