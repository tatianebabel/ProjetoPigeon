package entidade;

import java.util.ArrayList;

public class Usuario {

	//Variáveis
	private String nome;
	private String cpf;
	private String email;
	
	private ArrayList<Pruu> listPruu = new ArrayList<Pruu>();
	
	//Construtor
	public Usuario(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	//Pega o nome
	public String getNome() {
		return nome;
	}
	//Seta o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Pega o CPF
	public String getCpf() {
		return cpf;
	}
	//Seta o CPF
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//Pega o Email
	public String getEmail() {
		return email;
	}
	//Seta o email
	public void setEmail(String email) {
		this.email = email;
	}
	
	//guarda o pruu recebido em uma lista
	public void sendPruu(Pruu pruu) {
		listPruu.add(pruu);
	}
	
	//Mostra todos os pruus de um usuário
	public void showPruus(Usuario usuario) {
		
		for (Pruu pruu : usuario.listPruu) {
			System.out.println(pruu.toString() + "\n");
		}
	}
	
	//Sobrecarga - Mostra todos os prus de todos os usuários
	public void showPruus(ArrayList<Usuario> listaUsuarios) {

		for (Usuario usuario : listaUsuarios) {

			for (Pruu pruu : usuario.listPruu) {
				System.out.println(pruu.toString() + "\n");
			}
		}
	}
	
	//Mostra um determinado pruu
	public void showPruu(Pruu pruu) {
		System.out.println(pruu.toString());
	}

	//Dar Like
	public void like(Pruu pruu) {
		pruu.setLikes(1);
	}
	
}
