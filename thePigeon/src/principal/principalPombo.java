package principal;

import java.util.ArrayList;
import java.util.Date;

import entidade.Administrador;
import entidade.Pruu;
import entidade.Usuario;

public class principalPombo {

	public static void main(String[] args) {

		//Listas
		ArrayList<Usuario> listUsuarios = new ArrayList<>();
		
		/* 1 Cadastrar usuários (pelo menos 3, sendo um deles administrador)*/
		Usuario tati = new Usuario(" Tatiane Babel", "123.456.789-00", "tati.babel@pigeon.com");
		Usuario rubens = new Usuario(" Rubens Lima", "987.654.321-00", "rubens.lima@pigeon.com");
		Administrador lucky = new Administrador(" Lucky 777 ", "222.333.444-00", "lucky.777@pigeon.com");		
		
		//CRIAÇÃO DOS PRUUUUUUUUUUUUUUUUUUUUUUUUUUS
		Pruu tatiPruu1 = new Pruu("Pegue o pombo", //mensagem
							      new Date(),	   //data criação
							      7,			   //quantidade likes
							      false,		   //bloqueado
							      tati);
		
		Pruu tatiPruu2 = new Pruu("Mensagem para Harry Potter", //mensagem
							      new Date(),	   //data criação
							      1097,			   //quantidade likes
							      false,       	   //bloqueado
							      tati);

		Pruu rubensPruu1 = new Pruu("Hello Everyone", //mensagem
								      new Date(),	   //data criação
								      100,			   //quantidade likes
								      false,           //bloqueado
								      rubens);		   

		Pruu rubensPruu2 = new Pruu("This will gonna be ok", //mensagem
							        new Date(),	   //data criação
							        111,		   //quantidade likes
							        false,         //bloqueado
							        rubens);		   		

		Pruu luckyPruu1 = new Pruu("Estou com fome", //mensagem
			      new Date(),	   //data criação
			      100,			   //quantidade likes
			      false,
			      lucky);		   //bloqueado

		Pruu luckyPruu2 = new Pruu("Bora pegar um sol", //mensagem
							        new Date(),	   //data criação
							        111,		   //quantidade likes
							        false,
							        lucky);		   //bloqueado		
		
		/*2 - cada usuário deve enviar pelo menos 2 pruus*/
		tati.sendPruu(tatiPruu1);
		tati.sendPruu(tatiPruu2);
		
		rubens.sendPruu(rubensPruu1);
		rubens.sendPruu(rubensPruu2);
		
		lucky.sendPruu(luckyPruu1);
		lucky.sendPruu(luckyPruu2);

		//dar like em um determinado pruu
		tati.like(luckyPruu1);
		
		//administrador bloquear um determinado pruu
		lucky.bloqueiaPruu(rubensPruu1);		
		
		//Adiciona os usuários em uma lista
		listUsuarios.add(rubens);
		listUsuarios.add(tati);
		listUsuarios.add(lucky);	
		
		//mostrar todos os pruus de todos os usuários
		for (Usuario usuario : listUsuarios) {
			usuario.showPruus(usuario);
		}
		
		
	}
}
