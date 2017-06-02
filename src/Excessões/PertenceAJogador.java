package Excessões;

public class PertenceAJogador extends Exception {
	/**
	 * @author Jean
	 * excessão para quando tentar comprar um imovel que pertence ao jogador
	 */
	private static final long serialVersionUID = 1L;

	public void printmsg(){
		System.out.println("O Imovel pertence à um jogador e não pode ser comprado\n");
	}

}
