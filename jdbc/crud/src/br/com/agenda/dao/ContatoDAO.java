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
		//Comando SQL
		String sql = "SELECT * FROM contatos";
		//Lista de contatos
		List<Contato> contatos = new ArrayList<Contato>();
		//Variáveis para conexão com o banco
		Connection conn = null;
		PreparedStatement pstm = null;
		//classe q recupera os dados do banco
		ResultSet rset = null;
		
		try {
			//criar uma conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			//executar a conexão com o comando que queremos realizar (Nesse caso é a string sql)
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			
			while(rset.next()) {
				Contato contato = new Contato();
				//pegar o id
				contato.setId(rset.getInt("id"));
				//pegar nome
				contato.setNome(rset.getString("nome"));
				//pegar idade
				contato.setIdade(rset.getInt("idade"));
				//pegar data cadastro
				contato.setDataCadastro(rset.getDate("dataCadastro"));
				contatos.add(contato);
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(rset != null) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return contatos;
	}
	
	public void update(Contato contato) {
		String sql = "UPDATE contatos SET nome = ?, idade = ?, datacadastro = ? "+ "WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			
			//Adicionar os valores p atualizar
			
			
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			pstm.setInt(4, contato.getId());
			
			pstm.execute();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
}
