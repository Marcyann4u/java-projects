package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {
	/* CRUD
	 * C: Create - OK
	 * R: Read   - 
	 * U: Update - 
	 * D: Delete - 
	 */
	public void save(Contato contato) {
		String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar conexao com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			//criamos uma preparedStatement para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1,contato.getNome());
			pstm.setInt(2,contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			//executa a query
			pstm.execute();
			System.out.println("Dados adicionados com sucesso.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Fechar todas as conexoes
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public List<Contato> getContatos(){
		String sql = "SELECT * FROM contatos";
		List<Contato> contatos = new ArrayList<Contato>();
	 
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//classe q recupera os dados do banco
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			
			
		}
		
	}
	
	
	
}
