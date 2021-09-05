package Acoplamento;

public class DAO {
	public String incluiContato(Contato contato) {
		return "INSERT INTO TABLE contatos VALUES ('" + 
				contato.nome + "', '" +
				contato.endereco + "', '" +
				contato.fone + "')";
	}
}

/* Como Contato não é encapsulado, permite que esse método acesse os atributos diretamente */

/* A classe DAO tem considerável dependência em relação a classe Contato */