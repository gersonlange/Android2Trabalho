package br.inf.edge.visita.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inf.edge.visita.api.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
	Usuario findByUsuario(String usuario);
}