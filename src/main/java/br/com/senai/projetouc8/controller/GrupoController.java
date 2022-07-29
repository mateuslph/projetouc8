package br.com.senai.projetouc8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.senai.projetouc8.service.GrupoService;

@Controller
public class GrupoController {
	
	@Autowired
	private GrupoService servico;
	
	@GetMapping({"/grupos", "/"})
	public String listarGrupos(Model modelo) {
		modelo.addAttribute("grupos", servico.listarGrupos());
		return "grupos";
	}
}