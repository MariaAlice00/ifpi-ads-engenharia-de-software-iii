package Acoplamento;

public class DAO {
	public String incluiContato(Contato contato) {
		return "INSERT INTO TABLE contatos VALUES ('" + 
				contato.nome + "', '" +
				contato.endereco + "', '" +
				contato.fone + "')";
	}
}

/* Como Contato n�o � encapsulado, permite que esse m�todo acesse os atributos diretamente */

/* A classe DAO tem consider�vel depend�ncia em rela��o a classe Contato */