package Excess�es;

public class PertenceAJogador extends Exception {
	/**
	 * @author Jean
	 * excess�o para quando tentar comprar um imovel que pertence ao jogador
	 */
	private static final long serialVersionUID = 1L;

	public void printmsg(){
		System.out.println("O Imovel pertence � um jogador e n�o pode ser comprado\n");
	}

}
