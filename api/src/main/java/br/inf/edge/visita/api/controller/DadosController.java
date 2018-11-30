package br.inf.edge.visita.api.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inf.edge.visita.api.entity.Cliente;
import br.inf.edge.visita.api.entity.Regiao;
import br.inf.edge.visita.api.entity.Usuario;
import br.inf.edge.visita.api.model.ClienteDTO;
import br.inf.edge.visita.api.model.DadosDTO;
import br.inf.edge.visita.api.model.Login;
import br.inf.edge.visita.api.model.RegiaoDTO;
import br.inf.edge.visita.api.model.Token;
import br.inf.edge.visita.api.model.UsuarioDTO;
import br.inf.edge.visita.api.repo.ClienteRepository;
import br.inf.edge.visita.api.repo.RegiaoRepository;
import br.inf.edge.visita.api.repo.UsuarioRepository;

@RestController
@RequestMapping("/visita")
public class DadosController
{
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RegiaoRepository regiaoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping( value = "/login" )
	public ResponseEntity<?> login(
			@RequestBody Login login)
	{
		Usuario usuario = usuarioRepository.findByUsuario(login.getUsername());

		if ( usuario != null && usuario.getSenha().equals(login.getPassword()) )
		{
			UsuarioDTO dto = new UsuarioDTO();
			dto.setNome(usuario.getNome());
			dto.setToken(UUID.randomUUID().toString());
			return new ResponseEntity<UsuarioDTO>(dto, HttpStatus.OK);
		}
		
		return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
	}

	@PostMapping( value = "/dados" )
	public ResponseEntity<DadosDTO> dados(
			@RequestBody Token login)
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		List<RegiaoDTO> regiao = new ArrayList<>();
		
		List<Regiao> regioes = regiaoRepository.findAll();
		
		for (Regiao r : regioes)
		{
			RegiaoDTO regiaoDto = new RegiaoDTO();
			regiaoDto.setCodigo(r.getCodigo());
			regiaoDto.setNome(r.getNome());
			regiaoDto.setData(df.format(new Date()));
			regiao.add(regiaoDto);


			List<ClienteDTO> clientesDto = new ArrayList<>();

			List<Cliente> clientes = clienteRepository.findByIdRegiao(r.getId());

			if ( clientes != null )
			{
				for (Cliente c : clientes)
				{
					ClienteDTO clienteDto = new ClienteDTO();
					clienteDto.setCodigo(c.getCodigo());
					clienteDto.setNome(c.getNome());
					clienteDto.setEndereco(c.getEndereco());
					clienteDto.setLatitude(c.getLatitude());
					clienteDto.setLongitude(c.getLongitude());

					clientesDto.add(clienteDto);
				}

				regiaoDto.setClientes(clientesDto);
			}
		}
		
		DadosDTO dados = new DadosDTO();
		dados.setRegioes(regiao);

		return new ResponseEntity<DadosDTO>(dados, HttpStatus.OK);
	}
}