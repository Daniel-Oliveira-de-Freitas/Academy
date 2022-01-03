package br.com.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.academy.dao.AlunoDao;
import br.com.academy.model.Aluno;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoDao alunorepositorio;

	@GetMapping ("/inserirAluno")
	public ModelAndView InserirAluno(Aluno aluno) {		
		ModelAndView mv = new ModelAndView();	
		mv.setViewName("aluno/formAluno");
		mv.addObject("aluno", new Aluno());
		return mv ;	
	}
	
	@PostMapping ("InsertAlunos")
	public ModelAndView inserirAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Aluno/listAlunos");
		alunorepositorio.save(aluno);
		return mv;
	}
}
