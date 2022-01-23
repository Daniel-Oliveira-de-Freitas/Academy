package br.com.academy.enums;

public enum Curso {
	
	ENGENHARIADESOFTWARE("Engenharia de Software"),
	CIENCIADACOMPUTACAO("Ciência da Computação"),
	INFORMATICA("Informática"),
	ENGENHARIAMECANICA("Engenharia Mecânica"),
	JAIME("jAIME"),
	ENGENHARIACIVIL("Engenharia Civil");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}
	
	
}
