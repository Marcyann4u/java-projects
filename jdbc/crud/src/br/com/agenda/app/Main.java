package br.com.agenda.app;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDAO contatoDao = new ContatoDAO();
//		contato.setNome("Adriel");
//		contato.setIdade(19);
//		contato.setDataCadastro(new Date());
//		contatoDao.save(contato);
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato");
			System.out.println("ID: "+ c.getId());
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Idade: "+ c.getIdade());
			System.out.println("Cadastro: "+ c.getDataCadastro());

		}
	}

}
