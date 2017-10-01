import java.util.Scanner;
import casa.CasaRet;
import casa.CasaQuad;
import casa.Casa;
import piscina.AreaPiscina;

/*
	Projeto de um condomínio de casas com piscina
*/
class Projeto {
	/* Residências do condomínio */
	ListaSimples condominio;
	
	/*
		Construtor para Projeto
	*/
	Projeto() {
		this.condominio = new ListaSimples();
	}

	/*
		Adiciona uma residência ao condomínio
		
		Parâmetro:
			r - residência a ser adicionada.
	*/
	void adicionaRes(Residencia r) {
		this.condominio.insere(r);
	}
	
	public static void main(String[] args) {
		CasaRet cr = new CasaRet(10,5,1320);
		CasaQuad cq = new CasaQuad(10,1523);
		CasaQuad cq2 = new CasaQuad(8,1523);
		
		Residencia r1 = new Residencia(cr,null);
		Residencia r2 = new Residencia(cq,null);
		Residencia r3 = new Residencia(cq2,null);
		
		Projeto p = new Projeto();
		p.adicionaRes(r1);
		p.adicionaRes(r2);
		p.adicionaRes(r3);
		
		No n = p.condominio.cabeca;
		while (n != null) {
			System.out.println(n.r.casa.area());
			n = n.prox;
		}
	}
}
