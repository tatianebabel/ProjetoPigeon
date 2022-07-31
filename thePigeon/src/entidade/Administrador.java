package entidade;

public class Administrador extends Usuario{

	public Administrador(String nome, String cpf, String email) {
		super(nome, cpf, email);
		// TODO Auto-generated constructor stub
	}

	public void bloqueiaPruu(Pruu pruu) {
		pruu.setBloqueado(true);
	}
	
	
}
