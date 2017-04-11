package negocio;

import java.util.List;

import dados.VisitanteDao;

// Classe criada somente para fazermos alguns testes antes
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("LISTAR\n");
		
		//List<VisitanteDao> visitantes = new VisitanteDao().listar();
		
		VisitanteDao dao = new VisitanteDao();
		List<VisitanteDao> visitantes = dao.listar();
		
		for (VisitanteDao visitante: visitantes)
		{
			System.out.println(visitante.getNome());
			System.out.println(visitante.getTelefone() + "\n");
		}
	}

}
