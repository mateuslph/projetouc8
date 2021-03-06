package br.com.senai.projetouc8.service;

import java.util.List;

import br.com.senai.projetouc8.orm.Grupos;

public interface GrupoService {

	public List<Grupos> listarGrupos();

	public void apagarGrupos(Integer id);

	public Grupos salvarGrupos(Grupos grupos);

	public Grupos consultarGruposId(Integer id);

	public Grupos atualizarGrupos(Grupos grupos);
}
