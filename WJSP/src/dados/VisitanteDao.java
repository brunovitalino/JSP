package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VisitanteDao
{	
	int id;
	String nome, telefone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<VisitanteDao> listar()
	{
		String comandoSQL = "";
		Connection conexao;
		PreparedStatement pst;
		ResultSet rs;
		List<VisitanteDao> visitantes = new ArrayList<VisitanteDao>();
		VisitanteDao visitante;
		
		comandoSQL =	"SELECT * FROM Visitante;";
		
		try
		{
			conexao = new ConexaoFactory().getConexao();
			pst = conexao.prepareStatement(comandoSQL);
			rs = pst.executeQuery();
			while (rs.next())
			{
				// Ficaremos reicializando a variavel para sobrescrever as referencias de valores anteriores
				visitante = new VisitanteDao();
				visitante.setId(rs.getInt("id"));
				visitante.setNome(rs.getString("nome"));
				visitante.setTelefone(rs.getString("telefone"));
				visitantes.add(visitante);
			}
			//return visitantes;
		}
		catch (SQLException e)
		{
			System.out.println("Nao foi possivel manter uma conexao com o banco de dados.");
			e.printStackTrace();
		}
		finally
		{
			/*try {
				rs.close();
				pst.close();
				conexao.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Nao foi possivel liberar recursos.");
				e.printStackTrace();
			}*/
		}
		return visitantes;
	}
	
}
