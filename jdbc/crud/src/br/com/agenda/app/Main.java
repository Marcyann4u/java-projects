package br.com.agenda.app;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDAO contatoDao = new ContatoDAO();
//		contato.setNome("Pombo");
//		contato.setIdade(24);
//		contato.setDataCadastro(new Date());
//		contatoDao.save(contato);
		
		//Atualizar Contato
//		Contato c1 = new Contato();
//		c1.setNome("Maria Eduarda");
//		c1.setIdade(22);
//		c1.setDataCadastro(new Date());
//		c1.setId(2);
//		contatoDao.update(c1);
		
		contatoDao.deleteByID(7);
		
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato");
			System.out.println("ID: "+ c.getId());
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Idade: "+ c.getIdade());
			System.out.println("Cadastro: "+ c.getDataCadastro());

		}
	}

}
