package br.com.agenda.model;

import java.util.Date;

public class Contato {
	private int id;
	private String nome;
	private int idade;
	private Date dataCadastro;
	
	//Getters
	public int getId() {return id;}
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
	public Date getDataCadastro() {return dataCadastro;}
	//Setters
	public void setNome(String nome) {	this.nome = nome;}
	public void setId(int id) {this.id = id;}
	public void setIdade(int idade) {this.idade = idade;}
	public void setDataCadastro(Date dataCadastro) {this.dataCadastro = dataCadastro;}
}
