package entidade;

import java.util.Date;

public class Pruu {

	private String texto;
	
	private Date dataCriacao;
	
	private int likes;
	
	private boolean bloqueado;
	
	private Usuario usuarioCriacao;
	
	@Override
	public String toString() {
		if (!bloqueado) {
			return "Pruu [likes =" + likes + ", usuarioCriacao =" + usuarioCriacao.getNome() + "]";
		} else
			return "Pruu bloqueado";
	}

	//Construtor
	public Pruu(String texto, Date dataCriacao, int likes, boolean bloqueado, Usuario usuarioCriacao) {
		super();
		
		//Trata o tamanho do texto. Se zero, grava um espaço branco, senão somente os 300 primeiros.
		if (texto.length() == 0 ) {
			texto = " ";
		}else if (texto.length() > 300) {
			texto = texto.substring(0,300);
		}
		
		this.texto = texto;
		this.dataCriacao = dataCriacao;
		this.likes = likes;
		this.bloqueado = bloqueado;
		this.usuarioCriacao = usuarioCriacao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		System.out.println("Likes : "+this.likes);
		this.likes += likes;
		System.out.println("Likes : "+this.likes);
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Usuario getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(Usuario usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}
	
}
