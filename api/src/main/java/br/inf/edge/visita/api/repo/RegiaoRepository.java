package br.inf.edge.visita.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inf.edge.visita.api.entity.Regiao;

public interface RegiaoRepository extends JpaRepository<Regiao, Long>
{
}