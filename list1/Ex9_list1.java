/* A CBF resolveu cobrar uma multa para os jogadores que no campeonato brasileiro
	receberem cart˜oes amarelos e vermelhos. Dados quatro n´umeros inteiros, representando
	o time, o n´umero do jogador, o n´umero de cart˜oes amarelos e vermelhos do jogador,
	calcule o valor da multa, escrevendo a resposta na tela. Considere que a multa por
	cart˜ao amarelo ´e de R$1000,20 e por cart˜ao vermelho ´e de R$4523,75.*/
class Ex9_list1{
	static double calcula_multa(int cartao_amarelo, int cartao_vermelho){
		double valor_multa =  (cartao_amarelo * 1000.20) + (cartao_vermelho * 4523.75);
		return valor_multa;
	}

	public static void main(String[] arg){
		int time = 1;
		int numero_jogador = 2;
		System.out.println("O valor da multa do jogador " + numero_jogador + " do time: " + time + " é de: " + calcula_multa(3,4));
	}
}