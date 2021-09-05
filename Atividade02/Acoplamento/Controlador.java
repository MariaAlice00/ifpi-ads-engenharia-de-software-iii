package Acoplamento;

public class Controlador {
	private DAO dao = new DAO();
	
	private Contato contato = new Contato("Alice",
										  "Rua Brasil",
										  "1-23-00");
	
	public void persistaDados() {
		dao.incluiContato(contato);
	}
}

/* Uma alteração na implementação da classe Contato pode exigir alterações na classe Controlador e DAO */
